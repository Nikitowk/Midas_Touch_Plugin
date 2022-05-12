package me.kiernan.learn;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class BukkitListener implements Listener {
    @EventHandler
    public void onPlayerSneak(PlayerToggleSneakEvent event){
        Player player = event.getPlayer();

    }
}
