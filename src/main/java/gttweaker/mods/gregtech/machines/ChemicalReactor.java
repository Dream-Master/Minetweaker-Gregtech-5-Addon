package gttweaker.mods.gregtech.machines;

import gttweaker.mods.gregtech.AddMultipleRecipeAction;
import minetweaker.MineTweakerAPI;
import minetweaker.annotations.ModOnly;
import minetweaker.api.item.IIngredient;
import minetweaker.api.item.IItemStack;
import minetweaker.api.liquid.ILiquidStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import static gregtech.api.enums.GT_Values.MOD_ID;
import static gregtech.api.enums.GT_Values.RA;

/**
 * Provides access to the Chemical Reactor recipes.
 *
 * @author DreamMasterXXL
 */
@ZenClass("mods.gregtech.ChemicalReactor")
@ModOnly(MOD_ID)
public class ChemicalReactor {
    /**
     * Adds a Chemical Reactor recipe.
     *
     * @param output        recipe output
     * @param fluidOutput   primary fluidInput
     * @param input1        primary input
     * @param input2        secondary input
     * @param fluidInput    primary fluidInput
     * @param durationTicks reaction time, in ticks
     */
    @ZenMethod
    public static void addRecipe(IItemStack output, ILiquidStack fluidOutput, IIngredient input1, IIngredient input2, ILiquidStack fluidInput, int durationTicks) {
        MineTweakerAPI.apply(new AddMultipleRecipeAction("Adding Chemical Reactor recipe for " + output, input1, input2, fluidInput, fluidOutput, output, durationTicks) {
            @Override
            protected void applySingleRecipe(ArgIterator i) {
                RA.addChemicalRecipe(i.nextItem(), i.nextItem(), i.nextFluid(), i.nextFluid(), i.nextItem(), i.nextInt());
            }
        });
    }

    @ZenMethod
    public static void addRecipe(IItemStack output, IIngredient input1, IIngredient input2, int durationTicks) {
        addRecipe(output, null, input1, input2, null, durationTicks);
    }
}
