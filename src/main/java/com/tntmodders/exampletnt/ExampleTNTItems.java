
package com.tntmodders.exampletnt;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ExampleTNTItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleTNT.MOD_ID);
    public static final RegistryObject<Item> SMALL_TNT = ITEMS.register("small_tnt", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> LARGE_TNT = ITEMS.register("large_tnt", () -> new BlockItem(ExampleTNTBlocks.LARGE_TNT.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAM411_ITEM = ITEMS.register("team411_block", () -> new BlockItem(ExampleTNTBlocks.TEAM411_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAM411_KADOMARU_ITEM = ITEMS.register("team411_kadomaru_block", () -> new BlockItem(ExampleTNTBlocks.TEAM411_KADOMARU_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

