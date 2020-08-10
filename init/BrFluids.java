// 
// Decompiled by Procyon v0.5.36
// 

package erogenousbeef.bigreactors.init;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.ResourceLocation;
import it.zerono.mods.zerocore.lib.fluid.ModFluid;
import erogenousbeef.bigreactors.common.BigReactors;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.Fluid;

public class BrFluids
{
    public static final Fluid fluidYellorium;
    public static final Fluid fluidCyanite;
    public static final Fluid fluidSteam;
    public static final Fluid fluidFuelColumn;
    
    public static void initialize() {
    }
    
    public static boolean isSameFluid(final Fluid fluid1, final Fluid fluid2) {
        return null != fluid1 && null != fluid2 && (fluid1 == fluid2 || 0 == fluid1.getName().compareToIgnoreCase(fluid2.getName()));
    }
    
    public static boolean isSameFluid(final FluidStack fluidStack1, final FluidStack fluidStack2) {
        return null != fluidStack1 && null != fluidStack2 && isSameFluid(fluidStack1.getFluid(), fluidStack2.getFluid());
    }
    
    public static boolean isFluidUsableAsSteam(final Fluid currentlyUsedSteam, final Fluid otherFluid) {
        return isSameFluid((null != currentlyUsedSteam) ? currentlyUsedSteam : BrFluids.fluidSteam, otherFluid);
    }
    
    public static boolean isFluidUsableAsSteam(final FluidStack currentlyUsedSteamStack, final FluidStack otherFluidStack) {
        final Fluid currentFluid = (null != currentlyUsedSteamStack) ? currentlyUsedSteamStack.getFluid() : null;
        final Fluid otherFluid = (null != otherFluidStack) ? otherFluidStack.getFluid() : null;
        return isSameFluid((null != currentFluid) ? currentFluid : BrFluids.fluidSteam, otherFluid);
    }
    
    static {
        Fluid fluid;
        if (null == (fluid = FluidRegistry.getFluid("yellorium"))) {
            FluidRegistry.registerFluid(fluid = (Fluid)new ModFluid("yellorium", BigReactors.createBlockResourceLocation("yelloriumstill"), BigReactors.createBlockResourceLocation("yelloriumflowing")) {
                protected void initialize() {
                    this.setDensity(100);
                    this.setGaseous(false);
                    this.setLuminosity(10);
                    this.setRarity(EnumRarity.UNCOMMON);
                    this.setTemperature(295);
                    this.setViscosity(100);
                }
            });
        }
        FluidRegistry.addBucketForFluid(fluidYellorium = fluid);
        if (null == (fluid = FluidRegistry.getFluid("cyanite"))) {
            FluidRegistry.registerFluid(fluid = (Fluid)new ModFluid("cyanite", BigReactors.createBlockResourceLocation("cyanitestill"), BigReactors.createBlockResourceLocation("cyaniteflowing")) {
                protected void initialize() {
                    this.setDensity(100);
                    this.setGaseous(false);
                    this.setLuminosity(6);
                    this.setRarity(EnumRarity.UNCOMMON);
                    this.setTemperature(295);
                    this.setViscosity(100);
                }
            });
        }
        FluidRegistry.addBucketForFluid(fluidCyanite = fluid);
        if (null == (fluid = FluidRegistry.getFluid("steam"))) {
            FluidRegistry.registerFluid(fluid = (Fluid)new ModFluid("steam", BigReactors.createBlockResourceLocation("steamstill"), BigReactors.createBlockResourceLocation("steamflowing")) {
                protected void initialize() {
                    this.setTemperature(1000);
                    this.setGaseous(true);
                    this.setLuminosity(0);
                    this.setRarity(EnumRarity.COMMON);
                    this.setDensity(6);
                }
            });
        }
        FluidRegistry.addBucketForFluid(fluidSteam = fluid);
        if (null == (fluid = FluidRegistry.getFluid("fuelcolumn"))) {
            FluidRegistry.registerFluid(fluid = (Fluid)new ModFluid("fuelcolumn", BigReactors.createBlockResourceLocation("fuelcolumnstill"), BigReactors.createBlockResourceLocation("fuelcolumnflowing")) {
                protected void initialize() {
                }
            });
        }
        fluidFuelColumn = fluid;
    }
}
