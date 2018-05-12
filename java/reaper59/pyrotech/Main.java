/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reaper59.pyrotech;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import reaper59.pyrotech.proxy.CommonProxy;
import reaper59.pyrotech.util.Reference;
import static reaper59.pyrotech.util.Reference.CLIENT_PROXY_CLASS;
import static reaper59.pyrotech.util.Reference.COMMON_PROXY_CLASS;

/**
 * TODO doc this class
 * <p>
 * @author Reaper59
 * <p>
 * <pre>Expression copyright is undefined on line 15, column 11 in Templates/Classes/Class.java.</pre>
 */
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
  @Instance
  public static Main instance;
  @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
  public static CommonProxy proxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
  }

  @EventHandler
  public void init(FMLInitializationEvent event)
  {
  }

  @EventHandler
  public void PostInit(FMLPostInitializationEvent event)
  {
  }
}
