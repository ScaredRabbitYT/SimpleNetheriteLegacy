package net.scaredrabbit.simplenetherite.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scaredrabbit.simplenetherite.SimpleNetherite;

public class ModItemGroup {
        public static ItemGroup NETHERITE;

    public static void registerItemGroup() {
        NETHERITE = FabricItemGroup.builder(new Identifier(SimpleNetherite.MOD_ID, "netherite"))
                .displayName(Text.literal("Simple Netherite"))
                .icon(() -> new ItemStack(ModItems.RAW_NETHERITE)).build();
    }

}
