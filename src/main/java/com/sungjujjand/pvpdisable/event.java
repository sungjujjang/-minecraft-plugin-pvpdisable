package com.sungjujjand.pvpdisable;

import org.bukkit.entity.Animals;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class event implements Listener {

    public static boolean pvp;
    public static boolean animalhit;

    //disable pvp
    @EventHandler
    public void onPlayerDamage(EntityDamageByEntityEvent event) {
        //if pvp is disabled
        if (!pvp) {
            if (event.getDamager() instanceof Player && event.getEntity() instanceof Player) {
                //print message
                Player player = (Player) event.getDamager();
                player.sendMessage("PVP is disabled");
                event.setCancelled(true);
            }
        }
    }
    //if animalhit is disabled
    @EventHandler
    public void onAnimalDamage(EntityDamageByEntityEvent event) {
        if (!animalhit) {
            if (event.getDamager() instanceof Player && event.getEntity() instanceof Animals) {
                //print message
                Player player = (Player) event.getDamager();
                player.sendMessage("Animal hit is disabled");
                event.setCancelled(true);
            }
        }
    }
}
