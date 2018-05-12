/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reaper59.pyrotech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import reaper59.pyrotech.Main;
import reaper59.pyrotech.init.ModBlocks;
import reaper59.pyrotech.init.ModItems;
import reaper59.pyrotech.util.IHasModel;

/**
 * TODO doc this class
 * <p>
 * @author Reaper59
 * <p>
 * <pre>Expression copyright is undefined on line 15, column 11 in Templates/Classes/Class.java.</pre>
 */
public class BlockBase extends Block implements IHasModel
{
  public BlockBase(final String name,
                   final Material material)
  {
    super(material);
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    ModBlocks.BLOCKS.add(this);
    ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
  }

  @Override
  public void registerModels()
  {
    Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
  }
}
