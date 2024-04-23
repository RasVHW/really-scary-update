package rasvhw.reallyscaryupdate.recipes;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import rasvhw.reallyscaryupdate.block.ReallyScaryUpdateBlocks;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static rasvhw.reallyscaryupdate.ReallyScaryUpdate.LOGGER;
import static rasvhw.reallyscaryupdate.ReallyScaryUpdate.MOD_ID;
import static rasvhw.reallyscaryupdate.block.ReallyScaryUpdateBlocks.*;

public class ReallyScaryUpdateRecipes implements RecipeEntrypoint {

	@Override
	public void onRecipesReady() {
		//RecipeBuilder.Shaped(MOD_ID)
		//			.setShape("1", "2")
		//			.addInput('1', Block.blockClay)
		//			.addInput('2', Block.sand)
		//			.create("grey_soldier", new ItemStack(greyDoll, 4));
		//RecipeBuilder.Shapeless(MOD_ID)
		//			.addInput(new ItemStack(greyDoll,1))
		//			.addInput(new ItemStack(Item.dye,1,5))
		//			.create("purple_soldier",new ItemStack(purpleDoll,1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(Block.pumpkinCarvedIdle)
			.addInput(Item.dye,15)
			.create("white_pumpkin",new ItemStack(pumpkinWhite,1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(ReallyScaryUpdateBlocks.pumpkinWhite)
			.addInput(Block.torchCoal)
			.create("glowing_white_pumpkin",new ItemStack(pumpkinWhiteGlowing,1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(pumpkinWhiteSlashed)
			.addInput(Block.torchCoal)
			.create("glowing_slashed_white_pumpkin",new ItemStack(pumpkinWhiteSlashedGlowing,1));
	}

	@Override
	public void initNamespaces() {
		RecipeEntrypoint.super.initNamespaces();
	}

	public void initializeRecipes(){
		onRecipesReady();
		initNamespaces();
		LOGGER.info("Really Scary Recipes initialized.");
	}
}
