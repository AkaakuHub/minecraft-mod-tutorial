
package com.tntmodders.exampletnt.provider;

import com.tntmodders.exampletnt.ExampleTNT;
import com.tntmodders.exampletnt.ExampleTNTBlocks;
import com.tntmodders.exampletnt.ExampleTNTItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class ExampleTNTRecipeProvider extends RecipeProvider {
    public ExampleTNTRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, ExampleTNTItems.SMALL_TNT.get(), 3)
                .requires(ExampleTNTBlocks.LARGE_TNT.get())
                .group("exampletnt")
                .unlockedBy("has_large_tnt", has(ExampleTNTBlocks.LARGE_TNT.get()))
                .save(consumer, new ResourceLocation(ExampleTNT.MOD_ID, "small_tnt"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ExampleTNTBlocks.LARGE_TNT.get(), 2)
                .define('#', Blocks.TNT)
                .define('G', Items.GUNPOWDER)
                .pattern(" # ").pattern("GGG").pattern(" # ")
                .group("exampletnt")
                .unlockedBy("has_tnt", has(Blocks.TNT))
                .save(consumer, new ResourceLocation(ExampleTNT.MOD_ID, "large_tnt"));

        // 土からダイヤモンドを作るレシピ
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, Items.DIAMOND, 1)
                .requires(Blocks.DIRT)
                .group("exampletnt")
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer, new ResourceLocation(ExampleTNT.MOD_ID, "diamond"));

        // 土x4からオークの原木
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_LOG, 1)
                .define('#', Blocks.DIRT)
                .pattern("##").pattern("##")
                .group("exampletnt")
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer, new ResourceLocation(ExampleTNT.MOD_ID, "oak_log"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ExampleTNTBlocks.TEAM411_BLOCK.get(), 1)
                .define('#', Blocks.DIRT)
                .pattern("##").pattern(" #")
                .group("exampletnt")
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer, new ResourceLocation(ExampleTNT.MOD_ID, "team411_block"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS,ExampleTNTBlocks.TEAM411_KADOMARU_BLOCK.get(), 1)
                .define('#', Blocks.DIRT)
                .pattern(" # ").pattern("###").pattern(" # ")
                .group("exampletnt")
                .unlockedBy("has_dirt", has(Blocks.DIRT))
                .save(consumer, new ResourceLocation(ExampleTNT.MOD_ID, "team411_kadomaru_block"));
    }
}

