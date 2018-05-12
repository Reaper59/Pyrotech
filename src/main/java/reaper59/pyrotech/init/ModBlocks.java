/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reaper59.pyrotech.init;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import reaper59.pyrotech.blocks.BlockBase;

/**
 * TODO doc this class
 * <p>
 * @author Reaper59
 * <p>
 * <pre>Expression copyright is undefined on line 15, column 11 in Templates/Classes/Class.java.</pre>
 */
public class ModBlocks
{
  public static final List<Block> BLOCKS = new ArrayList<>();
  public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
}
