package me.kiernan.learn.commands;

import me.kiernan.learn.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.Locale;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }

        Player player = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("midas") ){
            //adds the item to the players inventory
            player.getInventory().addItem(ItemManager.midasTouch);
        }

     return true;
    }
}
