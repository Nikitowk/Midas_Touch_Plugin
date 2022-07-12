package me.kiernan.learn.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class ItemManager {

    public static ItemStack midasTouch;


    public static void init(){
        createMidasTouch();
    }

    private static void createMidasTouch(){
        ItemStack item = new ItemStack(Material.GOLD_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Midas' Touch");
        item.setItemMeta(meta);
        midasTouch = item;
    }

}
