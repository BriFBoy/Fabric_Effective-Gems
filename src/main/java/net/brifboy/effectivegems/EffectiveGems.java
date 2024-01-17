package net.brifboy.effectivegems;

import net.brifboy.effectivegems.block.Modblock;
import net.brifboy.effectivegems.item.ModItem;
import net.brifboy.effectivegems.item.ModItemGroupe;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EffectiveGems implements ModInitializer {

	public static final String MOD_ID = "effectivegems";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.registerModItems();
		ModItemGroupe.registerItemGroups();
		Modblock.registerModBlocks();


	}
}