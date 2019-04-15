package com.wiz.plugin.listeners;

import com.wiz.plugin.functions.F;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.event.ServerSwitchEvent;
import net.md_5.bungee.api.plugin.Event;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class Events implements Listener {
	@EventHandler
	public void onServerSwitch(ServerSwitchEvent e)
	{
		e.getPlayer().addGroups("default");
		if (e.getPlayer().getName().equalsIgnoreCase("Wiz_Techno"))
		{
			e.getPlayer().addGroups("admin");
		}
		e.getPlayer().sendMessage(new TextComponent(F.main("Portal", "You have been sent from" + F.value(e.getPlayer().getServer().getInfo().getName(), "to") + F.value(e.getPlayer().getPendingConnection().getVirtualHost().getHostString(),"."))));
	}
}
