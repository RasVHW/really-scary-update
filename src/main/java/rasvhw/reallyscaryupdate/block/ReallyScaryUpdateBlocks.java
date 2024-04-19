package rasvhw.reallyscaryupdate.block;

import net.minecraft.client.render.block.color.BlockColorGrass;
import net.minecraft.client.render.block.color.BlockColorLeavesOak;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.*;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.*;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.CreativeHelper;

import static rasvhw.reallyscaryupdate.ReallyScaryUpdate.MOD_ID;
public class ReallyScaryUpdateBlocks {
	public static Block pumpkinWhite;
	public void initializeBlocks(){
		pumpkinWhite = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
			.setHardness(0.8f)
			.setResistance(5.0f)
			.setTopBottomTexture("pumpkinWhiteTop.png")
			.setSideTextures("pumpkinWhiteSide.png")
			.setNorthTexture("pumpkinWhiteFront.png")
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.build(new BlockRotatableHorizontal("pumpkin.white", 1600, Material.stone){});
	}
}
