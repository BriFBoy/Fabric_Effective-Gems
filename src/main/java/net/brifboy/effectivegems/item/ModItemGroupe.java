package net.brifboy.effectivegems.item;

import net.brifboy.effectivegems.EffectiveGems;
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
                    }).build());

    public static void registerItemGroups() {
        EffectiveGems.LOGGER.info("Registering Item Groups for " + EffectiveGems.MOD_ID);
    }
}
