/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reaper59.pyrotech.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
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
@EventBusSubscriber
public class RegistryHandler
{
  @SubscribeEvent
  public static void onItemRegister(RegistryEvent.Register<Item> event)
  {
    event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
  }

  @SubscribeEvent
  public static void onBlockRegister(RegistryEvent.Register<Block> event)
  {
    event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
  }

  @SubscribeEvent
  public static void onModelRegister(ModelRegistryEvent event)
  {
    for (Item item : ModItems.ITEMS) {
      if (item instanceof IHasModel) {
        ((IHasModel) item).registerModels();
      }
    }
    for (Block block : ModBlocks.BLOCKS) {
      if (block instanceof IHasModel) {
        ((IHasModel) block).registerModels();
      }
    }
  }
}
