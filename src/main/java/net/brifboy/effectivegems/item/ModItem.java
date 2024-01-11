package net.brifboy.effectivegems.item;

import net.brifboy.effectivegems.EffectiveGems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem{

    public static final Item GREEN_GEM = registerItem("green_gem", new Item(new FabricItemSettings()));
    public static final Item BLUE_GEM = registerItem("blue_gem", new Item(new FabricItemSettings()));
    public static final Item BLACK_GEM = registerItem("black_gem", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EffectiveGems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EffectiveGems.LOGGER.info("registering ModItems for " + EffectiveGems.MOD_ID);
    }
}
