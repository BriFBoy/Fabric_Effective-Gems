package net.brifboy.effectivegems.item;

import net.brifboy.effectivegems.EffectiveGems;
import net.brifboy.effectivegems.block.Modblock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroupe {

    private static final ItemGroup EFFECTIVE_GEM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EffectiveGems.MOD_ID, "effective"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroupe.green_gem"))
                    .icon(() -> new ItemStack(ModItem.GREEN_GEM)).entries((displayContext, entries) -> {
                    entries.add(ModItem.GREEN_GEM);
                    entries.add(ModItem.BLUE_GEM);
                    entries.add(ModItem.BLACK_GEM);
                    entries.add(Modblock.GREEN_GEM_ORE);
                    entries.add(Modblock.DEEPSLATE_GREEN_GEM_ORE);
                    entries.add(Modblock.BLUE_GEM_ORE);
                    entries.add(Modblock.DEEPSTALE_BLUE_GEM_ORE);
                    entries.add(Modblock.NETHER_BLACK_GEM_ORE);

                    entries.add(ModItem.BLUE_GEM_HELMET);
                    entries.add(ModItem.BLUE_GEM_CHESTPLATE);
                    entries.add(ModItem.BLUE_GEM_LEGGINGS);
                    entries.add(ModItem.BLUE_GEM_BOOTS);
                    entries.add(ModItem.GREEN_GEM_HELMET);
                    entries.add(ModItem.GREEN_GEM_CHESTPLATE);
                    entries.add(ModItem.GREEN_GEM_LEGGINGS);
                    entries.add(ModItem.GREEN_GEM_BOOTS);
                    entries.add(ModItem.BLACK_GEM_HELMET);
                    entries.add(ModItem.BLACK_GEM_CHESTPLATE);
                    entries.add(ModItem.BLACK_GEM_LEGGINGS);
                    entries.add(ModItem.BLACK_GEM_BOOTS);

                    entries.add(ModItem.GREEN_GEM_SWORD);
                    entries.add(ModItem.BLUE_GEM_SWORD);
                    entries.add(ModItem.BLACK_GEM_SWORD);

                    entries.add(Modblock.BLUE_GEM_BLOCK);
                    entries.add(Modblock.GREEN_GEM_BLOCK);
                    entries.add(Modblock.BLACK_GEM_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        EffectiveGems.LOGGER.info("Registering Item Groups for " + EffectiveGems.MOD_ID);
    }
}
