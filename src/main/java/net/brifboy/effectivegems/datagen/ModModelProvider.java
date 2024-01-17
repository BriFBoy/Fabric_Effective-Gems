package net.brifboy.effectivegems.datagen;

import net.brifboy.effectivegems.block.Modblock;
import net.brifboy.effectivegems.item.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {

        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    blockStateModelGenerator.registerSimpleCubeAll(Modblock.GREEN_GEM_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(Modblock.DEEPSLATE_GREEN_GEM_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(Modblock.BLUE_GEM_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(Modblock.DEEPSTALE_BLUE_GEM_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(Modblock.NETHER_BLACK_GEM_ORE);
    blockStateModelGenerator.registerSimpleCubeAll(Modblock.BLUE_GEM_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(Modblock.GREEN_GEM_BLOCK);
    blockStateModelGenerator.registerSimpleCubeAll(Modblock.BLACK_GEM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItem.GREEN_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItem.BLUE_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItem.BLACK_GEM, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItem.BLUE_GEM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.BLUE_GEM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.BLUE_GEM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.BLUE_GEM_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.GREEN_GEM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.GREEN_GEM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.GREEN_GEM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.GREEN_GEM_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.BLACK_GEM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.BLACK_GEM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.BLACK_GEM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItem.BLACK_GEM_BOOTS));
    }
}
