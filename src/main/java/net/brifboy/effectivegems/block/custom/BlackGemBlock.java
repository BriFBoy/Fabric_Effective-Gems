package net.brifboy.effectivegems.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlackGemBlock extends Block {
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient) {
            if (entity.isPlayer() && !((PlayerEntity) entity).hasStatusEffect(StatusEffects.BLINDNESS) &&
                    !((PlayerEntity) entity).hasStatusEffect(StatusEffects.WITHER) && !((PlayerEntity) entity).hasStatusEffect(StatusEffects.BLINDNESS)) {
                ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 500, 50,
                        false, false, false));
                ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 500, 99,
                        false, false ,false));
                ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 500, 99,
                        false, false,false));
            }
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    public BlackGemBlock(Settings settings) {
        super(settings);
    }
}
