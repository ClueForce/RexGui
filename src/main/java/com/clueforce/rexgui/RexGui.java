package com.clueforce.rexgui;

import com.clueforce.rexgui.commands.GUICommand;
import com.clueforce.rexgui.events.ClickEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class RexGui extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Has been Enabled!");

        getCommand("gui").setExecutor(new GUICommand() );

        getServer().getPluginManager().registerEvents(new ClickEvent(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Has been Disabled!");
    }
}