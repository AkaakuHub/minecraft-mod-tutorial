
package com.tntmodders.exampletnt.provider;

import com.tntmodders.exampletnt.ExampleTNT;
import com.tntmodders.exampletnt.ExampleTNTBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ExampleTNTBlockStateProvider extends BlockStateProvider {
    public ExampleTNTBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ExampleTNT.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlockWithItem(ExampleTNTBlocks.LARGE_TNT.get(), this.cubeAll(ExampleTNTBlocks.LARGE_TNT.get()));
        this.simpleBlockWithItem(ExampleTNTBlocks.TEAM411_BLOCK.get(), this.cubeAll(ExampleTNTBlocks.TEAM411_BLOCK.get()));
        this.simpleBlockWithItem(ExampleTNTBlocks.TEAM411_KADOMARU_BLOCK.get(), this.cubeAll(ExampleTNTBlocks.TEAM411_KADOMARU_BLOCK.get()));
    }
}

