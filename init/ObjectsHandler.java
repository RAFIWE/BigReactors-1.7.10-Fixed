// 
// Decompiled by Procyon v0.5.36
// 

package erogenousbeef.bigreactors.init;

import net.minecraft.util.datafix.IFixableData;
import net.minecraft.util.datafix.FixTypes;
import net.minecraft.init.Items;
import zero.temp.RecipeHelper2;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import it.zerono.mods.zerocore.util.OreDictionaryHelper;
import net.minecraftforge.oredict.OreDictionary;
import erogenousbeef.bigreactors.common.item.ItemWrench;
import erogenousbeef.bigreactors.common.item.ItemGeneric;
import net.minecraft.item.Item;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbineController;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbineComputerPort;
import erogenousbeef.bigreactors.common.multiblock.tileentity.creative.TileEntityTurbineCreativeSteamGenerator;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbineRotorBlade;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbineRotorShaft;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbineRotorBearing;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbinePartGlass;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbineFluidPort;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbinePowerTapTesla;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbinePowerTapRedstoneFlux;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityTurbinePart;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorRedNetPort;
import erogenousbeef.bigreactors.common.multiblock.tileentity.creative.TileEntityReactorCreativeCoolantPort;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorCoolantPort;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorComputerPort;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorRedstonePort;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorControlRod;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorFuelRod;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorAccessPort;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorPowerTapTesla;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorPowerTapRedstoneFlux;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorController;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorGlass;
import erogenousbeef.bigreactors.common.multiblock.tileentity.TileEntityReactorPart;
import net.minecraft.util.ResourceLocation;
import java.util.Locale;
import javax.annotation.Nullable;
import it.zerono.mods.zerocore.lib.data.fixer.IGameObjectDataWalker;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.material.Material;
import erogenousbeef.bigreactors.common.block.BlockBRGenericFluid;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.block.material.MapColor;
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
import erogenousbeef.bigreactors.common.multiblock.PowerSystem;
import erogenousbeef.bigreactors.common.multiblock.block.BlockMultiblockController;
import erogenousbeef.bigreactors.common.multiblock.block.BlockMultiblockGlass;
import erogenousbeef.bigreactors.common.multiblock.block.BlockMultiblockCasing;
import erogenousbeef.bigreactors.common.multiblock.PartType;
import erogenousbeef.bigreactors.common.block.BlockBRMetal;
import net.minecraftforge.registries.IForgeRegistryEntry;
import erogenousbeef.bigreactors.common.block.BlockBROre;
import erogenousbeef.bigreactors.common.BigReactors;
import javax.annotation.Nonnull;
import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistry;
import it.zerono.mods.zerocore.lib.init.IGameObjectMapper;
import it.zerono.mods.zerocore.lib.config.ConfigHandler;
import it.zerono.mods.zerocore.lib.data.fixer.TileEntityNameFixer;
import it.zerono.mods.zerocore.lib.data.fixer.ItemReplacer;
import it.zerono.mods.zerocore.lib.data.fixer.BlockReplacer;
import it.zerono.mods.zerocore.lib.init.GameObjectsHandler;

public class ObjectsHandler extends GameObjectsHandler
{
    private static final int DATA_VERSION = 1;
    private final BlockReplacer _blockReplacer;
    private final ItemReplacer _itemReplacer;
    private final TileEntityNameFixer _teFixer;
    
    public ObjectsHandler(final ConfigHandler... configs) {
        super(1, configs);
        this._blockReplacer = new BlockReplacer(1);
        this._itemReplacer = new ItemReplacer(1);
        this._teFixer = new TileEntityNameFixer(1, "minecraft:bigreactors");
        this.addBlockRemapper((IGameObjectMapper)this._blockReplacer);
        this.addItemRemapper((IGameObjectMapper)this._itemReplacer);
    }
    
    protected void onRegisterBlocks(@Nonnull final IForgeRegistry<Block> registry) {
        final boolean regCreativeParts = BigReactors.CONFIG.registerCreativeMultiblockParts;
        BrFluids.initialize();
        registry.register((IForgeRegistryEntry)new BlockBROre("oreyellorite", "oreYellorite"));
        registry.register((IForgeRegistryEntry)new BlockBROre("oreanglesite", "oreAnglesite"));
        registry.register((IForgeRegistryEntry)new BlockBROre("orebenitoite", "oreBenitoite"));
        registry.register((IForgeRegistryEntry)new BlockBRMetal("blockyellorium", "blockYellorium"));
        registry.register((IForgeRegistryEntry)new BlockBRMetal("blockcyanite", "blockCyanite"));
        registry.register((IForgeRegistryEntry)new BlockBRMetal("blockgraphite", "blockGraphite"));
        registry.register((IForgeRegistryEntry)new BlockBRMetal("blockblutonium", "blockBlutonium"));
        registry.register((IForgeRegistryEntry)new BlockBRMetal("blockludicrite", "blockLudicrite"));
        registry.register((IForgeRegistryEntry)new BlockBRMetal("blocksteel", "blockSteel"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockCasing(PartType.ReactorCasing, "reactorcasing"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockGlass(PartType.ReactorGlass, "reactorglass"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockController(PartType.ReactorController, "reactorcontroller"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockPowerTap(PartType.ReactorPowerTap, "reactorpowertaprf", PowerSystem.RedstoneFlux));
        registry.register((IForgeRegistryEntry)new BlockMultiblockPowerTap(PartType.ReactorPowerTap, "reactorpowertaptesla", PowerSystem.Tesla));
        registry.register((IForgeRegistryEntry)new BlockMultiblockIOPort(PartType.ReactorAccessPort, "reactoraccessport"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockIOPort(PartType.ReactorCoolantPort, "reactorcoolantport"));
        registry.register((IForgeRegistryEntry)new BlockReactorControlRod("reactorcontrolrod"));
        registry.register((IForgeRegistryEntry)new BlockReactorRedNetPort("reactorrednetport"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockComputerPort(PartType.ReactorComputerPort, "reactorcomputerport"));
        registry.register((IForgeRegistryEntry)new BlockReactorRedstonePort("reactorredstoneport"));
        registry.register((IForgeRegistryEntry)new BlockReactorFuelRod("reactorfuelrod"));
        if (regCreativeParts) {
            registry.register((IForgeRegistryEntry)new BlockMultiblockIOPort(PartType.ReactorCreativeCoolantPort, "reactorcreativecoolantport"));
        }
        registry.register((IForgeRegistryEntry)new BlockMultiblockGlass(PartType.TurbineGlass, "turbineglass"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockCasing(PartType.TurbineHousing, "turbinehousing"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockController(PartType.TurbineController, "turbinecontroller"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockPowerTap(PartType.TurbinePowerPort, "turbinepowertaprf", PowerSystem.RedstoneFlux));
        registry.register((IForgeRegistryEntry)new BlockMultiblockPowerTap(PartType.TurbinePowerPort, "turbinepowertaptesla", PowerSystem.Tesla));
        registry.register((IForgeRegistryEntry)new BlockMultiblockComputerPort(PartType.TurbineComputerPort, "turbinecomputerport"));
        registry.register((IForgeRegistryEntry)new BlockMultiblockIOPort(PartType.TurbineFluidPort, "turbinefluidport"));
        registry.register((IForgeRegistryEntry)new BlockTurbineRotorBearing("turbinebearing"));
        registry.register((IForgeRegistryEntry)new BlockTurbineRotorShaft("turbinerotorshaft"));
        registry.register((IForgeRegistryEntry)new BlockTurbineRotorBlade("turbinerotorblade"));
        if (regCreativeParts) {
            registry.register((IForgeRegistryEntry)new BlockMultiblockIOPort(PartType.TurbineCreativeSteamGenerator, "turbinecreativesteamgenerator"));
        }
        registry.register((IForgeRegistryEntry)new BlockBRGenericFluid(BrFluids.fluidYellorium, "yellorium", (Material)new MaterialLiquid(MapColor.field_151673_t)));
        registry.register((IForgeRegistryEntry)new BlockBRGenericFluid(BrFluids.fluidCyanite, "cyanite", Material.field_151587_i));
    }
    
    protected void registerTileEntity(@Nonnull final Class<? extends TileEntity> tileEntityClass, @Nullable final IGameObjectDataWalker walker) {
        super.registerTileEntity((Class)tileEntityClass, walker);
        final String name = tileEntityClass.getSimpleName().toLowerCase(Locale.ROOT);
        this._teFixer.addReplacement("minecraft:bigreactors" + name, new ResourceLocation(this.getModId(), name));
    }
    
    protected void onRegisterTileEntities() {
        this.registerTileEntity((Class)TileEntityReactorPart.class);
        this.registerTileEntity((Class)TileEntityReactorGlass.class);
        this.registerTileEntity((Class)TileEntityReactorController.class);
        this.registerTileEntity((Class)TileEntityReactorPowerTapRedstoneFlux.class);
        this.registerTileEntity((Class)TileEntityReactorPowerTapTesla.class);
        this.registerTileEntity((Class<? extends TileEntity>)TileEntityReactorAccessPort.class, TileEntityReactorAccessPort.getObjectDataWalker());
        this.registerTileEntity((Class)TileEntityReactorFuelRod.class);
        this.registerTileEntity((Class)TileEntityReactorControlRod.class);
        this.registerTileEntity((Class)TileEntityReactorRedstonePort.class);
        this.registerTileEntity((Class)TileEntityReactorComputerPort.class);
        this.registerTileEntity((Class)TileEntityReactorCoolantPort.class);
        this.registerTileEntity((Class)TileEntityReactorCreativeCoolantPort.class);
        this.registerTileEntity((Class)TileEntityReactorRedNetPort.class);
        this.registerTileEntity((Class)TileEntityTurbinePart.class);
        this.registerTileEntity((Class)TileEntityTurbinePowerTapRedstoneFlux.class);
        this.registerTileEntity((Class)TileEntityTurbinePowerTapTesla.class);
        this.registerTileEntity((Class)TileEntityTurbineFluidPort.class);
        this.registerTileEntity((Class)TileEntityTurbinePartGlass.class);
        this.registerTileEntity((Class)TileEntityTurbineRotorBearing.class);
        this.registerTileEntity((Class)TileEntityTurbineRotorShaft.class);
        this.registerTileEntity((Class)TileEntityTurbineRotorBlade.class);
        this.registerTileEntity((Class)TileEntityTurbineCreativeSteamGenerator.class);
        this.registerTileEntity((Class)TileEntityTurbineComputerPort.class);
        this.registerTileEntity((Class)TileEntityTurbineController.class);
    }
    
    protected void onRegisterItems(@Nonnull final IForgeRegistry<Item> registry) {
        registry.register((IForgeRegistryEntry)new ItemGeneric("ingotyellorium", "ingotYellorium"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("ingotcyanite", "ingotCyanite"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("ingotgraphite", "ingotGraphite"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("ingotblutonium", "ingotBlutonium"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("ingotludicrite", "ingotLudicrite"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("ingotsteel", "ingotSteel"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("dustyellorium", "dustYellorium"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("dustcyanite", "dustCyanite"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("dustgraphite", "dustGraphite"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("dustblutonium", "dustBlutonium"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("dustludicrite", "dustLudicrite"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("dustMallorium", "dustMallorium"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("duststeel", "dustSteel"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("mineralanglesite"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("mineralbenitoite"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("reactorcasingcores"));
        registry.register((IForgeRegistryEntry)new ItemGeneric("turbinehousingcores"));
        registry.register((IForgeRegistryEntry)new ItemWrench("wrench"));
    }
    
    protected void onRegisterOreDictionaryEntries() {
        OreDictionary.registerOre("oreYellorium", BrBlocks.oreYellorite.createItemStack());
        if (BigReactors.CONFIG.registerYelloriumAsUranium) {
            OreDictionary.registerOre("ingotUranium", ((ItemGeneric)this.getTrackedItem("ingotyellorium")).createItemStack());
            OreDictionary.registerOre("dustUranium", ((ItemGeneric)this.getTrackedItem("dustyellorium")).createItemStack());
            OreDictionary.registerOre("ingotPlutonium", ((ItemGeneric)this.getTrackedItem("ingotblutonium")).createItemStack());
            OreDictionary.registerOre("dustPlutonium", ((ItemGeneric)this.getTrackedItem("dustblutonium")).createItemStack());
            OreDictionary.registerOre("dustMallorium", ((ItemGeneric)this.getTrackedItem("dustMallorium")).createItemStack());

        }
        if (!OreDictionaryHelper.doesOreNameExist("blockSnow")) {
            OreDictionary.registerOre("blockSnow", new ItemStack(Blocks.field_150433_aE, 1));
        }
        if (!OreDictionaryHelper.doesOreNameExist("blockIce")) {
            OreDictionary.registerOre("blockIce", new ItemStack(Blocks.field_150432_aD, 1));
        }
    }
    
    protected void onRegisterRecipes(@Nonnull final IForgeRegistry<IRecipe> registry) {
        ItemStack result;
        if (BigReactors.CONFIG.registerYelloriteSmeltToUranium) {
            result = OreDictionaryHelper.getOre("ingotUranium");
            if (null == result) {
                BigReactors.getLogger().warn("Config value registerYelloriteSmeltToUranium is set to True, but there are no ores registered as ingotUranium in the ore dictionary! Falling back to using standard yellorium only.");
                result = OreDictionaryHelper.getOre("ingotYellorium");
            }
        }
        else {
            result = OreDictionaryHelper.getOre("ingotYellorium");
        }
        RecipeHelper2.addSmelting(BrBlocks.oreYellorite.createItemStack(), result, 0.5f);
        RecipeHelper2.addSmelting(BrItems.dustYellorium.createItemStack(), BrItems.ingotYellorium.createItemStack(), 0.0f);
        RecipeHelper2.addSmelting(BrItems.dustCyanite.createItemStack(), BrItems.ingotCyanite.createItemStack(), 0.0f);
        RecipeHelper2.addSmelting(BrItems.dustGraphite.createItemStack(), BrItems.ingotGraphite.createItemStack(), 0.0f);
        RecipeHelper2.addSmelting(BrItems.dustBlutonium.createItemStack(), BrItems.ingotBlutonium.createItemStack(), 0.0f);
        RecipeHelper2.addSmelting(BrItems.dustLudicrite.createItemStack(), BrItems.ingotLudicrite.createItemStack(), 0.0f);
        RecipeHelper2.addSmelting(BrItems.dustSteel.createItemStack(), BrItems.ingotSteel.createItemStack(), 0.0f);
        RecipeHelper2.addSmelting(BrItems.dustMallorium.createItemStack(), BrItems.dustMallorium.createItemStack(), 0.0f);
        result = OreDictionaryHelper.getOre("ingotGraphite");
        if (BigReactors.CONFIG.registerCoalForSmelting) {
            RecipeHelper2.addSmelting(new ItemStack(Items.field_151044_h, 1, 0), result, 1.0f);
        }
        if (BigReactors.CONFIG.registerCharcoalForSmelting) {
            RecipeHelper2.addSmelting(new ItemStack(Items.field_151044_h, 1, 1), result, 1.0f);
        }
    }
    
    protected void onRegisterDataFixers() {
        super.onRegisterDataFixers();
        this.registerDataFixer(FixTypes.CHUNK, (IFixableData)this._blockReplacer);
        this.registerDataFixer(FixTypes.ITEM_INSTANCE, (IFixableData)this._itemReplacer);
        this.registerDataFixer(FixTypes.BLOCK_ENTITY, (IFixableData)this._teFixer);
        this.registerMissingBlocksReplacements();
        this.registerMissingItemsReplacements();
    }
    
    private void registerMissingBlocksReplacements() {
        ResourceLocation missingId = BigReactors.createResourceLocation("brore");
        this._blockReplacer.addReplacement(missingId, 0, (Block)BrBlocks.oreYellorite);
        this._blockReplacer.addReplacement(missingId, 1, (Block)BrBlocks.oreAnglesite);
        this._blockReplacer.addReplacement(missingId, 2, (Block)BrBlocks.oreBenitoite);
        missingId = BigReactors.createResourceLocation("blockmetals");
        this._blockReplacer.addReplacement(missingId, 0, (Block)BrBlocks.blockYellorium);
        this._blockReplacer.addReplacement(missingId, 1, (Block)BrBlocks.blockCyanite);
        this._blockReplacer.addReplacement(missingId, 2, (Block)BrBlocks.blockGraphite);
        this._blockReplacer.addReplacement(missingId, 3, (Block)BrBlocks.blockBlutonium);
        this._blockReplacer.addReplacement(missingId, 4, (Block)BrBlocks.blockLudicrite);
        this._blockReplacer.addReplacement(missingId, 5, (Block)BrBlocks.blockSteel);
    }
    
    private void registerMissingItemsReplacements() {
        ResourceLocation missingId = BigReactors.createResourceLocation("brore");
        this._itemReplacer.addReplacement(missingId, 0, Item.func_150898_a((Block)BrBlocks.oreYellorite));
        this._itemReplacer.addReplacement(missingId, 1, Item.func_150898_a((Block)BrBlocks.oreAnglesite));
        this._itemReplacer.addReplacement(missingId, 2, Item.func_150898_a((Block)BrBlocks.oreBenitoite));
        missingId = BigReactors.createResourceLocation("minerals");
        this._itemReplacer.addReplacement(missingId, 0, (Item)BrItems.mineralAnglesite);
        this._itemReplacer.addReplacement(missingId, 1, (Item)BrItems.mineralBenitoite);
        missingId = BigReactors.createResourceLocation("blockmetals");
        this._itemReplacer.addReplacement(missingId, 0, Item.func_150898_a((Block)BrBlocks.blockYellorium));
        this._itemReplacer.addReplacement(missingId, 1, Item.func_150898_a((Block)BrBlocks.blockCyanite));
        this._itemReplacer.addReplacement(missingId, 2, Item.func_150898_a((Block)BrBlocks.blockGraphite));
        this._itemReplacer.addReplacement(missingId, 3, Item.func_150898_a((Block)BrBlocks.blockBlutonium));
        this._itemReplacer.addReplacement(missingId, 4, Item.func_150898_a((Block)BrBlocks.blockLudicrite));
        this._itemReplacer.addReplacement(missingId, 5, Item.func_150898_a((Block)BrBlocks.blockSteel));
        missingId = BigReactors.createResourceLocation("ingotmetals");
        this._itemReplacer.addReplacement(missingId, 0, (Item)BrItems.ingotYellorium);
        this._itemReplacer.addReplacement(missingId, 1, (Item)BrItems.ingotCyanite);
        this._itemReplacer.addReplacement(missingId, 2, (Item)BrItems.ingotGraphite);
        this._itemReplacer.addReplacement(missingId, 3, (Item)BrItems.ingotBlutonium);
        this._itemReplacer.addReplacement(missingId, 4, (Item)BrItems.ingotLudicrite);
        this._itemReplacer.addReplacement(missingId, 5, (Item)BrItems.ingotSteel);
        this._itemReplacer.addReplacement(missingId, 5, (Item)BrItems.ingotMallorium);
        missingId = BigReactors.createResourceLocation("dustmetals");
        this._itemReplacer.addReplacement(missingId, 0, (Item)BrItems.dustYellorium);
        this._itemReplacer.addReplacement(missingId, 1, (Item)BrItems.dustCyanite);
        this._itemReplacer.addReplacement(missingId, 2, (Item)BrItems.dustGraphite);
        this._itemReplacer.addReplacement(missingId, 3, (Item)BrItems.dustBlutonium);
        this._itemReplacer.addReplacement(missingId, 4, (Item)BrItems.dustLudicrite);
        this._itemReplacer.addReplacement(missingId, 5, (Item)BrItems.dustSteel);
        this._itemReplacer.addReplacement(missingId, 5, (Item)BrItems.dustMallorium);
    }
}
