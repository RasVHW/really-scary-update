package rasvhw.reallyscaryupdate.block;

import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSound;
import turniplabs.halplibe.helper.BlockBuilder;

import static rasvhw.reallyscaryupdate.ReallyScaryUpdate.MOD_ID;
public class ReallyScaryUpdateBlocks {
	public static Block pumpkinWhite;
	public static Block pumpkinWhiteGlowing;

	//public static final Block testBlock = new BlockBuilder(MOD_ID)
	//		.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID, "block/TestBlock.json")))
	//		.build(new BlockModel("testblock", 1000, Material.dirt, ModelHelper.getOrCreateBlockModel(MOD_ID, "block/TestBlock.json")));
	public static Block pumpkinWhiteSlashed;
	public static Block pumpkinWhiteSlashedGlowing;
	public void initializeBlocks(){
		pumpkinWhite = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.wood", "step.wood", 1.0f, 1.0f))
			.setHardness(0.8f)
			.setResistance(5.0f)
			.setTopBottomTexture("pumpkinWhiteTop.png")
			.setSideTextures("pumpkinWhiteSide.png")
			.setNorthTexture("pumpkinWhiteFront.png")
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.build(new BlockWhitePumpkin("pumpkin.white", 1600, true){});
		pumpkinWhiteGlowing = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.wood","step.wood",1.0f,1.0f))
			.setHardness(0.8f)
			.setResistance(5.0f)
			.setLuminance(15)
			.setTopBottomTexture("pumpkinWhiteTop.png")
			.setSideTextures("pumpkinWhiteSide.png")
			.setNorthTexture("pumpkinWhiteGlowingAngryFront.png")
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.build(new BlockRotatableHorizontal("pumpkin.white.glowing",1601,Material.vegetable){});

		//			.setBlockModel(new BlockModelDragonFly(ModelHelper.getOrCreateBlockModel(MOD_ID,"block/white_pumpkin_slashed.json"),
		//				ModelHelper.getOrCreateBlockState(MOD_ID,"white_pumpkin_slashed.json"),new BlockWhitePumpkinSlashedMetaState(),true))

		pumpkinWhiteSlashed = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.wood","step.wood",1.0f,1.0f))
			.setHardness(0.8f)
			.setResistance(5.0f)
			.setTopBottomTexture("pumpkinWhiteTop.png")
			.setSideTextures("pumpkinWhiteSide.png")
			.setNorthTexture("pumpkinWhiteSlashedFront.png")
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.build(new BlockRotatableHorizontal("pumpkin.white.slashed",1602,Material.vegetable){});
		pumpkinWhiteSlashedGlowing = new BlockBuilder(MOD_ID)
			.setBlockSound(new BlockSound("step.wood","step.wood",1.0f,1.0f))
			.setHardness(0.8f)
			.setResistance(5.0f)
			.setLuminance(15)
			.setTopBottomTexture("pumpkinWhiteTop.png")
			.setSideTextures("pumpkinWhiteSide.png")
			.setNorthTexture("pumpkinWhiteSlashedGlowingAngryFront.png")
			.setTags(BlockTags.MINEABLE_BY_AXE)
			.build(new BlockRotatableHorizontal("pumpkin.white.slashed.glowing",1603,Material.vegetable){});
	}
}
