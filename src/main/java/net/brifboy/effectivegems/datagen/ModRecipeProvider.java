package net.brifboy.effectivegems.datagen;

import net.brifboy.effectivegems.block.Modblock;
import net.brifboy.effectivegems.item.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }
    private static final List<ItemConvertible> GREEN_GEM_SMELTABLES = List.of(Modblock.GREEN_GEM_ORE, Modblock.DEEPSLATE_GREEN_GEM_ORE);
    private static final List<ItemConvertible> BLUE_GEM_SMELTABLES = List.of(Modblock.BLUE_GEM_ORE, Modblock.DEEPSTALE_BLUE_GEM_ORE);
    private static final List<ItemConvertible> BLACK_GEM_SMELTABLES = List.of(Modblock.NETHER_BLACK_GEM_ORE);



    @Override
    public void generate(RecipeExporter exporter) {
    offerSmelting(exporter, GREEN_GEM_SMELTABLES, RecipeCategory.MISC, ModItem.GREEN_GEM, 0.f, 200, "green_gem");
    offerBlasting(exporter, GREEN_GEM_SMELTABLES, RecipeCategory.MISC, ModItem.GREEN_GEM, 0.f, 100, "green_gem");
    offerSmelting(exporter, BLUE_GEM_SMELTABLES, RecipeCategory.MISC, ModItem.BLUE_GEM, 0.f, 200, "blue_gem");
    offerBlasting(exporter, BLUE_GEM_SMELTABLES, RecipeCategory.MISC, ModItem.BLUE_GEM, 0.f, 100, "blue_gem");
    offerSmelting(exporter, BLACK_GEM_SMELTABLES, RecipeCategory.MISC, ModItem.BLUE_GEM, 0.f, 200, "blue_gem");
    offerBlasting(exporter, BLACK_GEM_SMELTABLES, RecipeCategory.MISC, ModItem.BLUE_GEM, 0.f, 100, "blue_gem");

    offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItem.BLUE_GEM, RecipeCategory.DECORATIONS, Modblock.BLUE_GEM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.BLUE_GEM_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', ModItem.BLUE_GEM)
                .criterion(hasItem(ModItem.BLUE_GEM), conditionsFromItem(ModItem.BLUE_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.BLUE_GEM_HELMET)));
    ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.BLUE_GEM_CHESTPLATE, 1)
            .pattern("# #")
            .pattern("###")
            .pattern("###")
            .input('#', ModItem.BLUE_GEM)
            .criterion(hasItem(ModItem.BLUE_GEM), conditionsFromItem(ModItem.BLUE_GEM))
            .offerTo(exporter, new Identifier(getRecipeName(ModItem.BLUE_GEM_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.BLUE_GEM_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItem.BLUE_GEM)
                .criterion(hasItem(ModItem.BLUE_GEM), conditionsFromItem(ModItem.BLUE_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.BLUE_GEM_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.BLUE_GEM_BOOTS, 1)
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItem.BLUE_GEM)
                .criterion(hasItem(ModItem.BLUE_GEM), conditionsFromItem(ModItem.BLUE_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.BLUE_GEM_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.GREEN_GEM_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', ModItem.GREEN_GEM)
                .criterion(hasItem(ModItem.GREEN_GEM), conditionsFromItem(ModItem.GREEN_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.GREEN_GEM_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.GREEN_GEM_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItem.GREEN_GEM)
                .criterion(hasItem(ModItem.GREEN_GEM), conditionsFromItem(ModItem.GREEN_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.GREEN_GEM_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.GREEN_GEM_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItem.GREEN_GEM)
                .criterion(hasItem(ModItem.GREEN_GEM), conditionsFromItem(ModItem.GREEN_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.GREEN_GEM_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.GREEN_GEM_BOOTS, 1)
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItem.GREEN_GEM)
                .criterion(hasItem(ModItem.GREEN_GEM), conditionsFromItem(ModItem.GREEN_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.GREEN_GEM_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.BLACK_GEM_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', ModItem.BLACK_GEM)
                .criterion(hasItem(ModItem.BLACK_GEM), conditionsFromItem(ModItem.BLACK_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.BLACK_GEM_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.BLACK_GEM_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItem.BLACK_GEM)
                .criterion(hasItem(ModItem.BLACK_GEM), conditionsFromItem(ModItem.BLACK_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.BLACK_GEM_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.BLACK_GEM_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItem.BLACK_GEM)
                .criterion(hasItem(ModItem.BLACK_GEM), conditionsFromItem(ModItem.BLACK_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.BLACK_GEM_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItem.BLACK_GEM_BOOTS, 1)
                .pattern("   ")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItem.BLACK_GEM)
                .criterion(hasItem(ModItem.BLACK_GEM), conditionsFromItem(ModItem.BLACK_GEM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItem.BLACK_GEM_BOOTS)));


    }
}
