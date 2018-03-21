package me.tokyojack.expbooster;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import lombok.Setter;
import me.tokyojack.expbooster.commands.EXPEvent;
import me.tokyojack.expbooster.events.MobDie;
import me.tokyojack.expbooster.utils.kommand.KommandManager;


public class Core extends JavaPlugin {


	private static Core plugin;

	public static Core getPlugin() {
		return plugin;
	}

	@Getter
	@Setter
	private int currentEXPMultiplier = 1;
	
	public void onEnable() {
		plugin = this;

		new KommandManager().addCommand(new EXPEvent()).build();

		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new MobDie(this), this);

	}

}