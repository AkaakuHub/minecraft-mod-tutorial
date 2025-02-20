
package com.tntmodders.exampletnt.provider;

import com.tntmodders.exampletnt.ExampleTNT;
import com.tntmodders.exampletnt.ExampleTNTBlocks;
import com.tntmodders.exampletnt.ExampleTNTItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public abstract class ExampleTNTLangProvider extends LanguageProvider {
    public ExampleTNTLangProvider(PackOutput output, String locale) {
        super(output, ExampleTNT.MOD_ID, locale);
    }

    public static class ExampleTNTLangJP extends ExampleTNTLangProvider {

        public ExampleTNTLangJP(PackOutput output) {
            super(output, "ja_jp");
        }

        @Override
        protected void addTranslations() {
            this.add(ExampleTNTItems.SMALL_TNT.get(), "小型TNT");
            this.add(ExampleTNTBlocks.LARGE_TNT.get(), "大型TNT");
            this.add(ExampleTNTBlocks.TEAM411_BLOCK.get(), "チーム411ブロック");
            this.add(ExampleTNTBlocks.TEAM411_KADOMARU_BLOCK.get(), "チーム411角丸ブロック");
        }
    }

    public static class ExampleTNTLangUS extends ExampleTNTLangProvider {

        public ExampleTNTLangUS(PackOutput output) {
            super(output, "en_us");
        }

        @Override
        protected void addTranslations() {
            this.add(ExampleTNTItems.SMALL_TNT.get(), "Small TNT");
            this.add(ExampleTNTBlocks.LARGE_TNT.get(), "Large TNT");
            this.add(ExampleTNTBlocks.TEAM411_BLOCK.get(), "Team 411 Block");
            this.add(ExampleTNTBlocks.TEAM411_KADOMARU_BLOCK.get(), "Team 411 Kadomaru Block");
        }
    }
}

