package net.brifboy.effectivegems.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlueGemBlock extends Block{


    public BlueGemBlock(Settings settings) {
        super(settings);
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient) {
            if (entity.isPlayer() && !((PlayerEntity) entity).hasStatusEffect(StatusEffects.SPEED)) {
                ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 3,
                        false, false, false));

            }



        }
        super.onSteppedOn(world, pos, state, entity);
    }
}
