package net.scaredrabbit.simplenetherite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scaredrabbit.simplenetherite.SimpleNetheriteFabric;

public class ModItems {
    public static final Item RAW_NETHERITE = registerItem("raw_netherite"
            , new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleNetheriteFabric.MOD_ID, name), item);
    }


    public static void registerModItems() {
        SimpleNetheriteFabric.LOGGER.debug("Registering Mod Items for " + SimpleNetheriteFabric.MOD_ID);
    }
}
