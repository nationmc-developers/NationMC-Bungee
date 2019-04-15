package com.wiz.plugin;

import com.wiz.plugin.commands.HubCommand;
import com.wiz.plugin.commands.MOTDCommand;
import com.wiz.plugin.listeners.Events;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
	@Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new Events());
        getProxy().getPluginManager().registerCommand(this, new HubCommand("Hub Sender Command", "bungeecord.command.hub", "hub"));
        getProxy().getPluginManager().registerCommand(this, new MOTDCommand("MOTD Override Command", "bungeecord.admin", "motd"));
    }

}
