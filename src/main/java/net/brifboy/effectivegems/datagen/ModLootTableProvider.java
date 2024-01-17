package net.brifboy.effectivegems.datagen;

import net.brifboy.effectivegems.block.Modblock;
import net.brifboy.effectivegems.item.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;

import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider{
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Modblock.GREEN_GEM_ORE, oreDrops(Modblock.GREEN_GEM_ORE, ModItem.GREEN_GEM));
        addDrop(Modblock.DEEPSLATE_GREEN_GEM_ORE, oreDrops(Modblock.DEEPSLATE_GREEN_GEM_ORE, ModItem.GREEN_GEM));
        addDrop(Modblock.BLUE_GEM_ORE, copperLikeOreDrops(Modblock.BLUE_GEM_ORE, ModItem.BLUE_GEM, 2, 3));
        addDrop(Modblock.DEEPSTALE_BLUE_GEM_ORE, copperLikeOreDrops(Modblock.DEEPSTALE_BLUE_GEM_ORE, ModItem.BLUE_GEM, 2, 3));
        addDrop(Modblock.NETHER_BLACK_GEM_ORE, oreDrops(Modblock.NETHER_BLACK_GEM_ORE, ModItem.BLACK_GEM));
        addDrop(Modblock.BLUE_GEM_BLOCK);


    }
    public LootTable.Builder copperLikeOreDrops(Block drop, Item item, float min, float max) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop,
                (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                        ((LeafEntry.Builder) ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max))))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
