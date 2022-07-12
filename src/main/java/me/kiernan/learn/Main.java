package me.kiernan.learn;

import me.kiernan.learn.commands.Commands;
import me.kiernan.learn.events.Events;
import me.kiernan.learn.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

import java.util.Objects;

public class Main extends JavaPlugin {
    @Override
    public void onEnable(){
        Commands commands = new Commands();
        ItemManager.init();
        getServer().getPluginManager().registerEvents(new Events(), this);
        getCommand("midas").setExecutor(commands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin is enabled.");
    }
    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Plugin is disabled.");
    }
}

