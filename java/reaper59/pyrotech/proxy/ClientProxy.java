/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reaper59.pyrotech.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * TODO doc this class
 * <p>
 * @author Reaper59
 * <p>
 * <pre>Expression copyright is undefined on line 15, column 11 in Templates/Classes/Class.java.</pre>
 */
public class ClientProxy extends CommonProxy
{
  @Override
  public void registerItemRenderer(Item item,
                                   int meta,
                                   String id)
  {
    ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(
      item.getRegistryName(), id));
  }
}
