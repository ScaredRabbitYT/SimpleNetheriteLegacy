package net.scaredrabbit.simplenetherite.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scaredrabbit.simplenetherite.SimpleNetheriteFabric;

import net.minecraft.registry.Registry;
import net.scaredrabbit.simplenetherite.block.ModBlocks;

public class ModItemGroup {
        public static ItemGroup NETHERITE = Registry.register(Registries.ITEM_GROUP, new Identifier(SimpleNetheriteFabric.MOD_ID, "netherite"),
                FabricItemGroup.builder()
                        .displayName(Text.literal("Simple Netherite"))
                        .icon(() -> new ItemStack(ModItems.RAW_NETHERITE)).entries((displayContext, entries) -> {
                            entries.add(ModItems.RAW_NETHERITE);
                            entries.add(ModBlocks.NETHERITE_ORE);
                            entries.add(ModBlocks.ENDSTONE_NETHERITE_ORE);
                            entries.add(ModBlocks.DEEPSLATE_NETHERITE_ORE);
                            entries.add(ModBlocks.STONE_NETHERITE_ORE);
                            entries.add(ModBlocks.RAW_NETHERITE_BLOCK);
                        }).build());

    public static void registerItemGroup() {

    }

}
