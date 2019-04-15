package com.wiz.plugin.commands;

import com.wiz.plugin.functions.F;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class HubCommand extends Command {


    public HubCommand(String name, String permission, String... aliases) {
        super(name, permission, aliases);
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer p = (ProxiedPlayer) sender;
        ServerInfo server = ProxyServer.getInstance().getServers().get("lobby");
        p.connect(server);
        sender.sendMessage(new ComponentBuilder(F.main("Portal", "You have been sent to a hub.")).create());
    }
}
