package net.illuc.kontraption;

import mekanism.api.math.FloatingLong;
import mekanism.common.MekanismLang;
import mekanism.common.block.attribute.AttributeStateFacing;
import mekanism.common.content.blocktype.BlockTypeTile;
import net.illuc.kontraption.blockEntities.TileEntityGyro;
import net.illuc.kontraption.blockEntities.TileEntityIonThruster;
import net.illuc.kontraption.blockEntities.TileEntityPilotSeat;
import net.illuc.kontraption.blockEntities.TileEntityWheel;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class KontraptionBlockTypes {

    private static final FloatingLong ION_THRUSTER_USAGE = FloatingLong.createConst(100);
    private static final FloatingLong ION_THRUSTER_STORAGE = FloatingLong.createConst(100);

    private KontraptionBlockTypes() {
    }

    public static final BlockTypeTile<TileEntityIonThruster> ION_THRUSTER = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> KontraptionTileEntityTypes.ION_THRUSTER, MekanismLang.HOLD_FOR_DESCRIPTION)
            .withEnergyConfig(() -> ION_THRUSTER_USAGE, () -> ION_THRUSTER_STORAGE)
            .with(new AttributeStateFacing(BlockStateProperties.FACING))
            .build();

    public static final BlockTypeTile<TileEntityPilotSeat> PILOT_SEAT = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> KontraptionTileEntityTypes.PILOT_SEAT, MekanismLang.HOLD_FOR_DESCRIPTION)
            .withEnergyConfig(() -> ION_THRUSTER_USAGE, () -> ION_THRUSTER_STORAGE)
            .with(new AttributeStateFacing(BlockStateProperties.HORIZONTAL_FACING))
            .build();

    public static final BlockTypeTile<TileEntityGyro> GYRO = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> KontraptionTileEntityTypes.GYRO, MekanismLang.HOLD_FOR_DESCRIPTION)
            .withEnergyConfig(() -> ION_THRUSTER_USAGE, () -> ION_THRUSTER_STORAGE)
            .with(new AttributeStateFacing(BlockStateProperties.FACING))
            .build();

    public static final BlockTypeTile<TileEntityWheel> WHEEL = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> KontraptionTileEntityTypes.WHEEL, MekanismLang.HOLD_FOR_DESCRIPTION)
            .withEnergyConfig(() -> ION_THRUSTER_USAGE, () -> ION_THRUSTER_STORAGE)
            //.withCustomShape(KontraptionBlockShapes.INSTANCE.getWHEEL())
            .with(new AttributeStateFacing(BlockStateProperties.FACING))
            .build();
}
