/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reaper59.pyrotech.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import reaper59.pyrotech.Main;
import reaper59.pyrotech.init.ModItems;
import reaper59.pyrotech.util.IHasModel;

/**
 * TODO doc this class
 * <p>
 * @author Reaper59
 * <p>
 * <pre>Expression copyright is undefined on line 15, column 11 in Templates/Classes/Class.java.</pre>
 */
public class ItemBase extends Item implements IHasModel
{
  public ItemBase(final String name)
  {
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(CreativeTabs.MATERIALS);
    ModItems.ITEMS.add(this);
  }

  @Override
  public void registerModels()
  {
    Main.proxy.registerItemRenderer(this, 0, "inventory");
  }
}
