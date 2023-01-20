package net.scaredrabbit.simplenetherite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scaredrabbit.simplenetherite.SimpleNetherite;

public class ModItems {
    public static final Item RAW_NETHERITE = registerItem("raw_netherite"
            , new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleNetherite.MOD_ID, name), item);
    }
    public static void addItemsToItemGroups(){
        addToItemGroup(ModItemGroup.NETHERITE, RAW_NETHERITE);
    }
    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries ->
                entries.add(item));
    }

    public static void registerModItems() {
        SimpleNetherite.LOGGER.debug("Registering Mod Items for " + SimpleNetherite.MOD_ID);
        addItemsToItemGroups();
    }
}
