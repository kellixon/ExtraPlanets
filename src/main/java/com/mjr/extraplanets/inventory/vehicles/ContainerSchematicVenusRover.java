package com.mjr.extraplanets.inventory.vehicles;

import micdoodle8.mods.galacticraft.core.inventory.SlotRocketBenchResult;
import micdoodle8.mods.galacticraft.core.items.GCItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.mjr.extraplanets.items.ExtraPlanets_Items;
import com.mjr.extraplanets.recipes.VenusRoverRecipes;

public class ContainerSchematicVenusRover extends Container {
	public InventoryVenusRover craftMatrix = new InventoryVenusRover(this);
	public IInventory craftResult = new InventoryCraftResult();
	private final World worldObj;

	public ContainerSchematicVenusRover(InventoryPlayer par1InventoryPlayer, int x, int y, int z) {
		final int change = 27;
		this.worldObj = par1InventoryPlayer.player.worldObj;
		this.addSlotToContainer(new SlotRocketBenchResult(par1InventoryPlayer.player, this.craftMatrix, this.craftResult, 0, 142, 79 + change));
		int var6;
		int var7;

		// Body
		for (var6 = 0; var6 < 5; ++var6) {
			for (var7 = 0; var7 < 3; ++var7) {
				this.addSlotToContainer(new SlotVenusRover(this.craftMatrix, var7 * 5 + var6 + 1, 39 + var7 * 18, 6 + var6 * 18 + change, x, y, z, par1InventoryPlayer.player));
			}
		}

		for (var6 = 0; var6 < 3; ++var6) {
			for (var7 = 0; var7 < 2; ++var7) {
				this.addSlotToContainer(new SlotVenusRover(this.craftMatrix, var7 * 3 + var6 + 16, 21 + var7 * 72, 6 + var6 * 36 + change, x, y, z, par1InventoryPlayer.player));
			}
		}

		// Addons
		for (int var8 = 0; var8 < 3; var8++) {
			this.addSlotToContainer(new SlotVenusRover(this.craftMatrix, 22 + var8, 93 + var8 * 26, -15 + change, x, y, z, par1InventoryPlayer.player));
		}

		// Player inv:

		for (var6 = 0; var6 < 3; ++var6) {
			for (var7 = 0; var7 < 9; ++var7) {
				this.addSlotToContainer(new Slot(par1InventoryPlayer, var7 + var6 * 9 + 9, 8 + var7 * 18, 111 + var6 * 18 + change));
			}
		}

		for (var6 = 0; var6 < 9; ++var6) {
			this.addSlotToContainer(new Slot(par1InventoryPlayer, var6, 8 + var6 * 18, 169 + change));
		}

		this.onCraftMatrixChanged(this.craftMatrix);
	}

	@Override
	public void onContainerClosed(EntityPlayer par1EntityPlayer) {
		super.onContainerClosed(par1EntityPlayer);

		if (!this.worldObj.isRemote) {
			for (int var2 = 1; var2 < this.craftMatrix.getSizeInventory(); ++var2) {
				final ItemStack slot = this.craftMatrix.getStackInSlotOnClosing(var2);

				if (slot != null) {
					par1EntityPlayer.entityDropItem(slot, 0.0F);
				}
			}
		}
	}

	@Override
	public void onCraftMatrixChanged(IInventory par1IInventory) {
		this.craftResult.setInventorySlotContents(0, VenusRoverRecipes.findMatchingVenusRoverRecipe(this.craftMatrix));
	}

	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
		return true;
	}

	/**
	 * Called to transfer a stack from one inventory to the other eg. when shift clicking.
	 */
	@Override
	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par1) {
		ItemStack var2 = null;
		final Slot slot = (Slot) this.inventorySlots.get(par1);
		final int b = this.inventorySlots.size();

		if (slot != null && slot.getHasStack()) {
			final ItemStack var4 = slot.getStack();
			var2 = var4.copy();

			if (par1 < b - 36) {
				if (!this.mergeItemStack(var4, b - 36, b, true)) {
					return null;
				}

				if (par1 == 0) {
					slot.onSlotChange(var4, var2);
				}
			} else {
				Item i = var4.getItem();
				if (i == ExtraPlanets_Items.tier4Items || i == ExtraPlanets_Items.electricParts || i == GCItems.partBuggy) {
					for (int j = 1; j < 22; j++) {
						if (((Slot) this.inventorySlots.get(j)).isItemValid(var4)) {
							this.mergeOneItem(var4, j, j + 1, false);
						}
					}
				} else {
					if (par1 < b - 9) {
						if (!this.mergeItemStack(var4, b - 9, b, false)) {
							return null;
						}
					} else {
						if (!this.mergeItemStack(var4, b - 36, b - 9, false)) {
							return null;
						}
					}
				}
			}

			if (var4.stackSize == 0) {
				slot.putStack((ItemStack) null);
			}

			if (var4.stackSize == var2.stackSize) {
				return null;
			}

			slot.onSlotChanged();
			slot.onPickupFromSlot(par1EntityPlayer, var4);
		}

		return var2;
	}

	protected boolean mergeOneItem(ItemStack par1ItemStack, int par2, int par3, boolean par4) {
		boolean flag1 = false;
		if (par1ItemStack.stackSize > 0) {
			Slot slot;
			ItemStack slotStack;

			for (int k = par2; k < par3; k++) {
				slot = (Slot) this.inventorySlots.get(k);
				slotStack = slot.getStack();

				if (slotStack == null) {
					ItemStack stackOneItem = par1ItemStack.copy();
					stackOneItem.stackSize = 1;
					par1ItemStack.stackSize--;
					slot.putStack(stackOneItem);
					slot.onSlotChanged();
					flag1 = true;
					break;
				}
			}
		}

		return flag1;
	}
}