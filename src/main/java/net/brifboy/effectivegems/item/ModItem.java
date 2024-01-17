package net.brifboy.effectivegems.item;

import net.brifboy.effectivegems.EffectiveGems;
import net.brifboy.effectivegems.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem{

    public static final Item GREEN_GEM = registerItem("green_gem", new Item(new FabricItemSettings()));
    public static final Item BLUE_GEM = registerItem("blue_gem", new Item(new FabricItemSettings()));
    public static final Item BLACK_GEM = registerItem("black_gem", new Item(new FabricItemSettings()));

    public static final Item BLUE_GEM_HELMET = registerItem("blue_gem_helmet",
            new ModArmorItem(ModArmorMaterials.BLUE_GEM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLUE_GEM_CHESTPLATE = registerItem("blue_gem_chestplate",
            new ArmorItem(ModArmorMaterials.BLUE_GEM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLUE_GEM_LEGGINGS = registerItem("blue_gem_leggings",
            new ArmorItem(ModArmorMaterials.BLUE_GEM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLUE_GEM_BOOTS = registerItem("blue_gem_boots",
            new ArmorItem(ModArmorMaterials.BLUE_GEM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item GREEN_GEM_HELMET = registerItem("green_gem_helmet",
            new ModArmorItem(ModArmorMaterials.GREEN_GEM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GREEN_GEM_CHESTPLATE = registerItem("green_gem_chestplate",
            new ArmorItem(ModArmorMaterials.GREEN_GEM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GREEN_GEM_LEGGINGS = registerItem("green_gem_leggings",
            new ArmorItem(ModArmorMaterials.GREEN_GEM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GREEN_GEM_BOOTS = registerItem("green_gem_boots",
            new ArmorItem(ModArmorMaterials.GREEN_GEM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item BLACK_GEM_HELMET = registerItem("black_gem_helmet",
            new ModArmorItem(ModArmorMaterials.BLACK_GEM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BLACK_GEM_CHESTPLATE = registerItem("black_gem_chestplate",
            new ArmorItem(ModArmorMaterials.BLACK_GEM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BLACK_GEM_LEGGINGS = registerItem("black_gem_leggings",
            new ArmorItem(ModArmorMaterials.BLACK_GEM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BLACK_GEM_BOOTS = registerItem("black_gem_boots",
            new ArmorItem(ModArmorMaterials.BLACK_GEM, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EffectiveGems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EffectiveGems.LOGGER.info("registering ModItems for " + EffectiveGems.MOD_ID);
    }
}
