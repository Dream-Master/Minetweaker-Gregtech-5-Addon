package gttweaker;

import gttweaker.mods.gregtech.Fuels;
import gttweaker.mods.gregtech.machines.*;
import minetweaker.MineTweakerAPI;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = "GTTweaker", name = "GTTweaker", dependencies = "", version = "1.4.1")
public class GTTweaker {
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
        MineTweakerAPI.registerClass(AlloySmelter.class);
        MineTweakerAPI.registerClass(Amplifabricator.class);
        MineTweakerAPI.registerClass(Assembler.class);
        MineTweakerAPI.registerClass(Autoclave.class);
        MineTweakerAPI.registerClass(Blastfurnace.class);
        MineTweakerAPI.registerClass(Brewery.class);
        MineTweakerAPI.registerClass(Canner.class);
        MineTweakerAPI.registerClass(Centrifuge.class);
        MineTweakerAPI.registerClass(ChemicalBath.class);
        MineTweakerAPI.registerClass(ChemicalReactor.class);
        MineTweakerAPI.registerClass(CuttingSaw.class);
        MineTweakerAPI.registerClass(Distillery.class);
        MineTweakerAPI.registerClass(Electrolyzer.class);
        MineTweakerAPI.registerClass(Extruder.class);
        MineTweakerAPI.registerClass(Fermenter.class);
        MineTweakerAPI.registerClass(FluidCanner.class);
        MineTweakerAPI.registerClass(FluidExtractor.class);
        MineTweakerAPI.registerClass(FluidHeater.class);
        MineTweakerAPI.registerClass(FluidSolidifier.class);
        MineTweakerAPI.registerClass(ForgeHammer.class);
        MineTweakerAPI.registerClass(FormingPress.class);
        MineTweakerAPI.registerClass(Fuels.class);
        MineTweakerAPI.registerClass(ImplosionCompressor.class);
        MineTweakerAPI.registerClass(Lathe.class);
        MineTweakerAPI.registerClass(Mixer.class);
        MineTweakerAPI.registerClass(Packer.class);
        MineTweakerAPI.registerClass(PlateBender.class);
        MineTweakerAPI.registerClass(Polarizer.class);
        MineTweakerAPI.registerClass(PrecisionLaser.class);
        MineTweakerAPI.registerClass(Printer.class);
        MineTweakerAPI.registerClass(Pulverizer.class);
        MineTweakerAPI.registerClass(Separator.class);
        MineTweakerAPI.registerClass(Sifter.class);
        MineTweakerAPI.registerClass(Slicer.class);
        MineTweakerAPI.registerClass(Unpacker.class);
        MineTweakerAPI.registerClass(VacuumFreezer.class);
        MineTweakerAPI.registerClass(Wiremill.class);
        MineTweakerAPI.registerClass(ArcFurnace.class);
        MineTweakerAPI.registerClass(DistillationTower.class);
        MineTweakerAPI.registerClass(FusionReactor.class);
        MineTweakerAPI.registerClass(PlasmaArcFurnace.class);
        MineTweakerAPI.registerClass(PyrolyseOven.class);
        MineTweakerAPI.registerClass(OilCracker.class);
    }
    
    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent ev) {
        MineTweakerAPI.registerClassRegistry(GTTweakerRegistry.class);
    }
}
