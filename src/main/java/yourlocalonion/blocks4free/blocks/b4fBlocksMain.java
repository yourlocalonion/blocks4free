package yourlocalonion.blocks4free.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import yourlocalonion.blocks4free.blocks4free;

public class b4fBlocksMain {
    private static int count = 0;
    public static final Block DANGER_BLOCK1 = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block DANGER_BLOCK2 = new Block(FabricBlockSettings.create().strength(4.0f));
    public static final Block METAL_BLOCK = new Block(FabricBlockSettings.create().strength(6.0f));
    public static final Block METAL_TILE = new Block(FabricBlockSettings.create().strength(6.0f));
    private static void registerBlockWithItem(Block block, String name) {
        Registry.register(Registries.BLOCK, new Identifier(blocks4free.mod_id, name), block);
        Registry.register(Registries.ITEM, new Identifier(blocks4free.mod_id, name), new BlockItem(block, new FabricItemSettings()));
        count++;
    }
    public static void initBlocks() {
        registerBlockWithItem(DANGER_BLOCK1, "danger_block1");
        registerBlockWithItem(DANGER_BLOCK2, "danger_block2");
        registerBlockWithItem(METAL_BLOCK, "metal_block");
        registerBlockWithItem(METAL_TILE, "metal_tile");
        blocks4free.LOGGER.info("loaded " + count + " blocks");
    }
}
