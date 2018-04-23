package me.tokyojack.expbooster.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import me.tokyojack.expbooster.Core;

public class MobDeath implements Listener {

	@EventHandler
	public void onEntityDeath(EntityDeathEvent event) {
		int currentEXPMultiplier = Core.getPlugin().getCurrentEXPMultiplier();

		if (currentEXPMultiplier == 1)
			return;

		event.setDroppedExp(event.getDroppedExp() * amount);
	}

}
