package tehnut.emt.modules.ic2.tile.solars.compressed;

import ic2.api.energy.prefab.BasicSource;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import tehnut.emt.ConfigHandler;
import tehnut.emt.modules.ic2.blocks.IC2BlockRegistry;
import tehnut.emt.modules.ic2.tile.solars.TileEntitySolarBase;

public class TileDoubleCompressedSolar extends TileEntitySolarBase {

    public TileDoubleCompressedSolar() {
        output = ConfigHandler.doubleCompressedSolarOutput;
        energySource = new BasicSource(this, 10000, 3);
    }

    @Override
    public ItemStack getWrenchDrop(EntityPlayer entityPlayer) {
        return new ItemStack(IC2BlockRegistry.solars1, 1, 1);
    }
}