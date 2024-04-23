package rasvhw.reallyscaryupdate.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockPumpkin;
import net.minecraft.core.block.BlockRotatableHorizontal;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.tool.ItemToolSword;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.world.World;

public class BlockWhitePumpkin extends BlockPumpkin {
	boolean isCarvable;
	public BlockWhitePumpkin(String key, int id, boolean isCarvable) {
		super(key, id, isCarvable);
		this.isCarvable=isCarvable;
	}
	@Override
	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
		if (!this.isCarvable) {
			return false;
		} else {
			ItemStack heldItem = player.getHeldItem();
			if (heldItem != null && heldItem.getItem() instanceof ItemToolSword) {
				heldItem.damageItem(1, player);
				world.setBlockAndMetadataWithNotify(
					x,
					y,
					z,
					ReallyScaryUpdateBlocks.pumpkinWhiteSlashed.id,
					player.getHorizontalPlacementDirection(Direction.getHorizontalDirection(player).getSide()).getOpposite().getId())
					;
				return true;
			} else {
				return false;
			}
		}
	}

	public void onBlockAdded(World world, int x, int y, int z) {
	}
}
