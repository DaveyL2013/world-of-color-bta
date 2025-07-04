package luke.color;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static luke.color.ColorMod.MOD_ID;

public class ColorRecipes implements RecipeEntrypoint {

	public void initializeRecipes() {


			RecipeBuilderShaped templatePowder = new RecipeBuilderShaped(MOD_ID, "DSS", "SSG", "GGG");
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 15))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_white", new ItemStack(ColorBlocks.concretePowder, 8, 0));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 14))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_orange", new ItemStack(ColorBlocks.concretePowder, 8, 1));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 13))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_magenta", new ItemStack(ColorBlocks.concretePowder, 8, 2));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 12))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_lightblue", new ItemStack(ColorBlocks.concretePowder, 8, 3));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 11))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_yellow", new ItemStack(ColorBlocks.concretePowder, 8, 4));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 10))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_lime", new ItemStack(ColorBlocks.concretePowder, 8, 5));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 9))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_pink", new ItemStack(ColorBlocks.concretePowder, 8, 6));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 8))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_gray", new ItemStack(ColorBlocks.concretePowder, 8, 7));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 7))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_silver", new ItemStack(ColorBlocks.concretePowder, 8, 8));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 6))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_cyan", new ItemStack(ColorBlocks.concretePowder, 8, 9));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 5))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_purple", new ItemStack(ColorBlocks.concretePowder, 8, 10));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 4))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_blue", new ItemStack(ColorBlocks.concretePowder, 8, 11));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 3))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_brown", new ItemStack(ColorBlocks.concretePowder, 8, 12));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 2))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_green", new ItemStack(ColorBlocks.concretePowder, 8, 13));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 1))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_red", new ItemStack(ColorBlocks.concretePowder, 8, 14));
			templatePowder.addInput('D', (new ItemStack(Items.DYE, 1, 0))).addInput('S', (Blocks.SAND)).addInput('G', (Blocks.GRAVEL)).create("concrete_powder_black", new ItemStack(ColorBlocks.concretePowder, 8, 15));

		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("bed");
		RecipeBuilder.ModifyWorkbench("minecraft").removeRecipe("seat");

		RecipeBuilderShaped templateBed = new RecipeBuilderShaped(MOD_ID, "CCW", "PPP");
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 0)).create("white_bed", new ItemStack(ColorItems.bedWhite, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 1)).create("orange_bed", new ItemStack(ColorItems.bedOrange, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 2)).create("magenta_bed", new ItemStack(ColorItems.bedMagenta, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 3)).create("lightblue_bed", new ItemStack(ColorItems.bedLightblue, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 4)).create("yellow_bed", new ItemStack(ColorItems.bedYellow, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 5)).create("lime_bed", new ItemStack(ColorItems.bedLime, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 6)).create("pink_bed", new ItemStack(ColorItems.bedPink, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 7)).create("gray_bed", new ItemStack(ColorItems.bedGray, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 8)).create("silver_bed", new ItemStack(ColorItems.bedSilver, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 9)).create("cyan_bed", new ItemStack(ColorItems.bedCyan, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 10)).create("purple_bed", new ItemStack(ColorItems.bedPurple, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 11)).create("blue_bed", new ItemStack(ColorItems.bedBlue, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 12)).create("brown_bed", new ItemStack(ColorItems.bedBrown, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 13)).create("green_bed", new ItemStack(ColorItems.bedGreen, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 14)).create("red_bed", new ItemStack(Items.BED, 1));
		templateBed.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 15)).create("black_bed", new ItemStack(ColorItems.bedBlack, 1));

		RecipeBuilderShaped templateSeat = new RecipeBuilderShaped(MOD_ID, "CWC", "P P");
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 0)).create("white_seat", new ItemStack(ColorItems.seatWhite, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 1)).create("orange_seat", new ItemStack(ColorItems.seatOrange, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 2)).create("magenta_seat", new ItemStack(ColorItems.seatMagenta, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 3)).create("lightblue_seat", new ItemStack(ColorItems.seatLightblue, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 4)).create("yellow_seat", new ItemStack(ColorItems.seatYellow, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 5)).create("lime_seat", new ItemStack(ColorItems.seatLime, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 6)).create("pink_seat", new ItemStack(ColorItems.seatPink, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 7)).create("gray_seat", new ItemStack(ColorItems.seatGray, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 8)).create("silver_seat", new ItemStack(ColorItems.seatSilver, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 9)).create("cyan_seat", new ItemStack(ColorItems.seatCyan, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 10)).create("purple_seat", new ItemStack(ColorItems.seatPurple, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 11)).create("blue_seat", new ItemStack(ColorItems.seatBlue, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 12)).create("brown_seat", new ItemStack(ColorItems.seatBrown, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 13)).create("green_seat", new ItemStack(ColorItems.seatGreen, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 14)).create("red_seat", new ItemStack(Items.SEAT, 1));
		templateSeat.addInput('C', Items.CLOTH).addInput('P',("minecraft:planks")).addInput('W', new ItemStack(Blocks.WOOL, 1, 15)).create("black_seat", new ItemStack(ColorItems.seatBlack, 1));


		RecipeBuilder.initNameSpace(MOD_ID);
	}


	@Override
	public void onRecipesReady() {
		initializeRecipes();
	}

	@Override
	public void initNamespaces() {
			RecipeBuilder.initNameSpace(MOD_ID);
			RecipeBuilder.getRecipeNamespace(MOD_ID);
		}

}
