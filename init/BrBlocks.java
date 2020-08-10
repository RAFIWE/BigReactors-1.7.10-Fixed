// 
// Decompiled by Procyon v0.5.36
// 

package erogenousbeef.bigreactors.init;

import erogenousbeef.bigreactors.common.block.BlockBRGenericFluid;
import erogenousbeef.bigreactors.common.multiblock.block.BlockTurbineRotorBlade;
import erogenousbeef.bigreactors.common.multiblock.block.BlockTurbineRotorShaft;
import erogenousbeef.bigreactors.common.multiblock.block.BlockTurbineRotorBearing;
import erogenousbeef.bigreactors.common.multiblock.block.BlockReactorFuelRod;
import erogenousbeef.bigreactors.common.multiblock.block.BlockReactorRedstonePort;
import erogenousbeef.bigreactors.common.multiblock.block.BlockMultiblockComputerPort;
import erogenousbeef.bigreactors.common.multiblock.block.BlockReactorRedNetPort;
import erogenousbeef.bigreactors.common.multiblock.block.BlockReactorControlRod;
import erogenousbeef.bigreactors.common.multiblock.block.BlockMultiblockIOPort;
import erogenousbeef.bigreactors.common.multiblock.block.BlockMultiblockPowerTap;
import erogenousbeef.bigreactors.common.multiblock.block.BlockMultiblockController;
import erogenousbeef.bigreactors.common.multiblock.block.BlockMultiblockCasing;
import erogenousbeef.bigreactors.common.multiblock.block.BlockMultiblockGlass;
import erogenousbeef.bigreactors.common.block.BlockBRMetal;
import erogenousbeef.bigreactors.common.block.BlockBROre;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder("bigreactors")
public final class BrBlocks
{
    @GameRegistry.ObjectHolder("oreyellorite")
    public static final BlockBROre oreYellorite;
    @GameRegistry.ObjectHolder("oreanglesite")
    public static final BlockBROre oreAnglesite;
    @GameRegistry.ObjectHolder("orebenitoite")
    public static final BlockBROre oreBenitoite;
    @GameRegistry.ObjectHolder("blockyellorium")
    public static final BlockBRMetal blockYellorium;
    @GameRegistry.ObjectHolder("blockcyanite")
    public static final BlockBRMetal blockCyanite;
    @GameRegistry.ObjectHolder("blockgraphite")
    public static final BlockBRMetal blockGraphite;
    @GameRegistry.ObjectHolder("blockblutonium")
    public static final BlockBRMetal blockBlutonium;
    @GameRegistry.ObjectHolder("blockludicrite")
    public static final BlockBRMetal blockLudicrite;
    @GameRegistry.ObjectHolder("blocksteel")
    public static final BlockBRMetal blockSteel;
    @GameRegistry.ObjectHolder("reactorglass")
    public static final BlockMultiblockGlass reactorGlass;
    @GameRegistry.ObjectHolder("reactorcasing")
    public static final BlockMultiblockCasing reactorCasing;
    @GameRegistry.ObjectHolder("reactorcontroller")
    public static final BlockMultiblockController reactorController;
    @GameRegistry.ObjectHolder("reactorpowertaprf")
    public static final BlockMultiblockPowerTap reactorPowerTapRF;
    @GameRegistry.ObjectHolder("reactorpowertaptesla")
    public static final BlockMultiblockPowerTap reactorPowerTapTesla;
    @GameRegistry.ObjectHolder("reactoraccessport")
    public static final BlockMultiblockIOPort reactorAccessPort;
    @GameRegistry.ObjectHolder("reactorcoolantport")
    public static final BlockMultiblockIOPort reactorCoolantPort;
    @GameRegistry.ObjectHolder("reactorcontrolrod")
    public static final BlockReactorControlRod reactorControlRod;
    @GameRegistry.ObjectHolder("reactorrednetport")
    public static final BlockReactorRedNetPort reactorRedNetPort;
    @GameRegistry.ObjectHolder("reactorcomputerport")
    public static final BlockMultiblockComputerPort reactorComputerPort;
    @GameRegistry.ObjectHolder("reactorredstoneport")
    public static final BlockReactorRedstonePort reactorRedstonePort;
    @GameRegistry.ObjectHolder("reactorfuelrod")
    public static final BlockReactorFuelRod reactorFuelRod;
    @GameRegistry.ObjectHolder("reactorcreativecoolantport")
    public static final BlockMultiblockIOPort reactorCreativeCoolantPort;
    @GameRegistry.ObjectHolder("turbineglass")
    public static final BlockMultiblockGlass turbineGlass;
    @GameRegistry.ObjectHolder("turbinehousing")
    public static final BlockMultiblockCasing turbineHousing;
    @GameRegistry.ObjectHolder("turbinecontroller")
    public static final BlockMultiblockController turbineController;
    @GameRegistry.ObjectHolder("turbinepowertaprf")
    public static final BlockMultiblockPowerTap turbinePowerTapRF;
    @GameRegistry.ObjectHolder("turbinepowertaptesla")
    public static final BlockMultiblockPowerTap turbinePowerTapTesla;
    @GameRegistry.ObjectHolder("turbinecomputerport")
    public static final BlockMultiblockComputerPort turbineComputerPort;
    @GameRegistry.ObjectHolder("turbinefluidport")
    public static final BlockMultiblockIOPort turbineFluidPort;
    @GameRegistry.ObjectHolder("turbinebearing")
    public static final BlockTurbineRotorBearing turbineBearing;
    @GameRegistry.ObjectHolder("turbinerotorshaft")
    public static final BlockTurbineRotorShaft turbineRotorShaft;
    @GameRegistry.ObjectHolder("turbinerotorblade")
    public static final BlockTurbineRotorBlade turbineRotorBlade;
    @GameRegistry.ObjectHolder("turbinecreativesteamgenerator")
    public static final BlockMultiblockIOPort turbineCreativeSteamGenerator;
    @GameRegistry.ObjectHolder("yellorium")
    public static final BlockBRGenericFluid yellorium;
    @GameRegistry.ObjectHolder("cyanite")
    public static final BlockBRGenericFluid cyanite;
    
    static {
        oreYellorite = null;
        oreAnglesite = null;
        oreBenitoite = null;
        blockYellorium = null;
        blockCyanite = null;
        blockGraphite = null;
        blockBlutonium = null;
        blockLudicrite = null;
        blockSteel = null;
        reactorGlass = null;
        reactorCasing = null;
        reactorController = null;
        reactorPowerTapRF = null;
        reactorPowerTapTesla = null;
        reactorAccessPort = null;
        reactorCoolantPort = null;
        reactorControlRod = null;
        reactorRedNetPort = null;
        reactorComputerPort = null;
        reactorRedstonePort = null;
        reactorFuelRod = null;
        reactorCreativeCoolantPort = null;
        turbineGlass = null;
        turbineHousing = null;
        turbineController = null;
        turbinePowerTapRF = null;
        turbinePowerTapTesla = null;
        turbineComputerPort = null;
        turbineFluidPort = null;
        turbineBearing = null;
        turbineRotorShaft = null;
        turbineRotorBlade = null;
        turbineCreativeSteamGenerator = null;
        yellorium = null;
        cyanite = null;
    }
}
