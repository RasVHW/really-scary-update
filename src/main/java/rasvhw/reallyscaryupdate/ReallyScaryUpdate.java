package rasvhw.reallyscaryupdate;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rasvhw.reallyscaryupdate.block.ReallyScaryUpdateBlocks;
import rasvhw.reallyscaryupdate.recipes.ReallyScaryUpdateRecipes;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;
import useless.dragonfly.helper.ModelHelper;
import useless.dragonfly.model.block.BlockModelDragonFly;

public class ReallyScaryUpdate implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "reallyscaryupdate";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("ReallyScaryUpdate initialized.");
    }

	@Override
	public void beforeGameStart() {
		new ReallyScaryUpdateBlocks().initializeBlocks();
		LOGGER.info("ReallyScaryUpdateBlocks initialized");
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		new ReallyScaryUpdateRecipes().initializeRecipes();
	}
}
