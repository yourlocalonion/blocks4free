package yourlocalonion.blocks4free;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yourlocalonion.blocks4free.blocks.b4fBlocksMain;

import static yourlocalonion.blocks4free.blocks.b4fBlocksMain.initBlocks;

public class blocks4free implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String mod_id = "blocks4free";
    public static final Logger LOGGER = LoggerFactory.getLogger(mod_id);

	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(b4fBlocksMain.DANGER_BLOCK1))
			.displayName(Text.translatable("itemGroup.blocks4free.item_group"))
			.entries(((displayContext, entries) -> {
				entries.add(b4fBlocksMain.DANGER_BLOCK1);
				entries.add(b4fBlocksMain.DANGER_BLOCK2);
				entries.add(b4fBlocksMain.METAL_BLOCK);
				entries.add(b4fBlocksMain.METAL_TILE);
			}))
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registries.ITEM_GROUP, new Identifier(mod_id, "test_group"), ITEM_GROUP);

		LOGGER.info("blocks4free has initialized");
		initBlocks();
	}
}