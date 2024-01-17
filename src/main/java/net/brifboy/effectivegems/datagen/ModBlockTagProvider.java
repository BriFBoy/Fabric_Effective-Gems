package net.brifboy.effectivegems.datagen;

import net.brifboy.effectivegems.block.Modblock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(Modblock.GREEN_GEM_ORE)
            .add(Modblock.DEEPSLATE_GREEN_GEM_ORE)
            .add(Modblock.BLUE_GEM_ORE)
            .add(Modblock.DEEPSTALE_BLUE_GEM_ORE)
            .add(Modblock.NETHER_BLACK_GEM_ORE);

    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
            .add(Modblock.GREEN_GEM_ORE)
            .add(Modblock.DEEPSLATE_GREEN_GEM_ORE);
    getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
            .add(Modblock.BLUE_GEM_ORE)
            .add(Modblock.DEEPSTALE_BLUE_GEM_ORE);

    getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_too_level_4")))
            .add(Modblock.NETHER_BLACK_GEM_ORE);





    }
}
