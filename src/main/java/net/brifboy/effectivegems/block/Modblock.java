package net.brifboy.effectivegems.block;

import net.brifboy.effectivegems.EffectiveGems;
import net.brifboy.effectivegems.block.custom.BlackGemBlock;
import net.brifboy.effectivegems.block.custom.BlueGemBlock;
import net.brifboy.effectivegems.block.custom.GreenGemBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class Modblock {

    public static final Block GREEN_GEM_ORE = registerBlock("green_gem_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_GREEN_GEM_ORE = registerBlock("deepslate_green_gem_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block BLUE_GEM_ORE = registerBlock("blue_gem_ore", new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));
    public static final Block DEEPSTALE_BLUE_GEM_ORE = registerBlock("deepslate_blue_gem_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block NETHER_BLACK_GEM_ORE = registerBlock("nether_black_gem_ore", new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));
    public static final Block BLUE_GEM_BLOCK = registerBlock("blue_gem_block",
            new BlueGemBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block GREEN_GEM_BLOCK = registerBlock("green_gem_block",
            new GreenGemBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));
    public static final Block BLACK_GEM_BLOCK = registerBlock("black_gem_block",
            new BlackGemBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EffectiveGems.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EffectiveGems.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        EffectiveGems.LOGGER.info("registering ModBlocks for " + EffectiveGems.MOD_ID);
    }
}
