package net.scaredrabbit.simplenetherite;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleNetherite implements ModInitializer {
	public static final String MOD_ID = "simplenetherite";
	public static final Logger LOGGER = LoggerFactory.getLogger("simplenetherite");

	@Override
	public void onInitialize() {


		LOGGER.info("Loading Simple Netherite");
	}
}