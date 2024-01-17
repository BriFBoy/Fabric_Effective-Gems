package net.brifboy.effectivegems.item;

import net.brifboy.effectivegems.EffectiveGems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    BLUE_GEM("blue_gem", 25, new int[] {3, 7, 5, 4}, 2,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.1f, () -> Ingredient.ofItems(ModItem.BLUE_GEM)),
    GREEN_GEM("green_gem", 20, new int[] {2, 6, 4, 3}, 2,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2f, 0.1f, () -> Ingredient.ofItems(ModItem.GREEN_GEM)),
    BLACK_GEM("black_gem", 20, new int[] { 5, 10, 9, 4}, 2,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2f, 0.1f, () -> Ingredient.ofItems(ModItem.BLACK_GEM));

    private final String name;
    private final int durabilityMultiplyer;
    private final int[] protectionAmount;
    private final int enchantability;
    private final SoundEvent equipSuond;
    private final float knockbackResistiance;
    private final float toughness;
    private final Supplier<Ingredient> repairIngrediant;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplyer, int[] protectionAmount, int enchantability, SoundEvent equipSuond,
                      float knockbackResistiance, float toughness, Supplier<Ingredient> repairIngrediant) {
        this.name = name;
        this.durabilityMultiplyer = durabilityMultiplyer;
        this.protectionAmount = protectionAmount;
        this.enchantability = enchantability;
        this.equipSuond = equipSuond;
        this.knockbackResistiance = knockbackResistiance;
        this.toughness = toughness;
        this.repairIngrediant = repairIngrediant;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplyer;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmount[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSuond;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngrediant.get();
    }

    @Override
    public String getName() {
        return EffectiveGems.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistiance;
    }
}
