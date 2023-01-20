package net.scaredrabbit.simplenetherite;

import net.fabricmc.api.ModInitializer;
import net.scaredrabbit.simplenetherite.block.ModBlocks;
import net.scaredrabbit.simplenetherite.item.ModItemGroup;
import net.scaredrabbit.simplenetherite.item.ModItems;
import net.scaredrabbit.simplenetherite.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleNetherite implements ModInitializer {
	public static final String MOD_ID = "simplenetherite";
	public static final Logger LOGGER = LoggerFactory.getLogger("simplenetherite");

	@Override
	public void onInitialize() {
		ModWorldGen.generateWorldGen();

		ModItemGroup.registerItemGroup();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();


		LOGGER.info("Loading Simple Netherite");
	}
}