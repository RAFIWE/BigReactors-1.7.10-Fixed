package erogenousbeef.bigreactors.common.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import erogenousbeef.bigreactors.common.BigReactors;

public class BlockBROreM extends Block {
    private IIcon iconMallorite;

    public BlockBROreM()
    {
        super(Material.rock);
        this.setCreativeTab(BigReactors.TAB);
        this.setBlockName("brOreM");
        this.setBlockTextureName(BigReactors.TEXTURE_NAME_PREFIX + "oreMallorite");
        this.setHardness(2f);
    }

    @Override
    public IIcon getIcon(int side, int metadata)
    {
        return this.iconMallorite;
    }

    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.iconMallorite = par1IconRegister.registerIcon(BigReactors.TEXTURE_NAME_PREFIX + "oreMallorite");
    }

    @Override
    public int damageDropped(int metadata)
    {
        return metadata;
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(item, 1, 0));
    }
}
