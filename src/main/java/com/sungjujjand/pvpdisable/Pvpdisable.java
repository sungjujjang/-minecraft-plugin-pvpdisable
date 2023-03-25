package com.sungjujjand.pvpdisable;

import org.bukkit.plugin.java.JavaPlugin;

public final class Pvpdisable extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //make consle message
        getLogger().info("Pvpdisable has been enabled!");
        //register event
        getServer().getPluginManager().registerEvents(new event(), this);
        //register command
        getCommand("pvp").setExecutor(new pvpcommand());
        getCommand("animalhit").setExecutor(new animalcommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //make consle message
        getLogger().info("Pvpdisable has been disabled!");
    }
}
