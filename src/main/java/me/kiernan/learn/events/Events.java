package me.kiernan.learn.events;

import me.kiernan.learn.items.ItemManager;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;

import org.bukkit.event.player.PlayerInteractEvent;


public class Events implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(ItemManager.midasTouch.getItemMeta())) {
                    Block block = event.getClickedBlock();
                    block.getWorld().setType(block.getLocation(), Material.GOLD_BLOCK);
                }
            }
        }
    }
}
