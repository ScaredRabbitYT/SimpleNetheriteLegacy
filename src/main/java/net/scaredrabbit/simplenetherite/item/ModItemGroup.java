package net.scaredrabbit.simplenetherite.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scaredrabbit.simplenetherite.SimpleNetherite;
import net.scaredrabbit.simplenetherite.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup NETHERITE = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SimpleNetherite.MOD_ID, "netherite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.netherite"))
                    .icon(() -> new ItemStack(ModItems.RAW_NETHERITE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_NETHERITE);
                        entries.add(ModBlocks.NETHERITE_ORE);
                        entries.add(ModBlocks.ENDSTONE_NETHERITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_NETHERITE_ORE);
                        entries.add(ModBlocks.STONE_NETHERITE_ORE);
                        entries.add(ModBlocks.RAW_NETHERITE_BLOCK);


                    }).build());

   @Deprecated(forRemoval = true)
   public static void registerItemGroup() {
        NETHERITE = FabricItemGroup.builder()
                .displayName(Text.literal("Simple Netherite"))
                .icon(() -> new ItemStack(ModItems.RAW_NETHERITE)).build();
   }
   public static void registerItemGroups(){
       SimpleNetherite.LOGGER.info("Registering item groups for: " + SimpleNetherite.MOD_ID);
   }

}
