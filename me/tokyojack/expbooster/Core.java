package me.tokyojack.expbooster;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import lombok.Setter;

import me.tokyojack.expbooster.commands.EXPEvent;
import me.tokyojack.expbooster.events.MobDeath;
import me.tokyojack.expbooster.utils.kommand.KommandManager;

@Getter
public class Core extends JavaPlugin {

	@Getter
	private static Core plugin;

	@Setter
	private int currentEXPMultiplier = 1;
	
	public void onEnable() {
		plugin = this;

		new KommandManager().addCommand(new EXPEvent()).build();

		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new MobDeath(), this);
	}

}