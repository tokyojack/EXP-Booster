package me.tokyojack.expbooster.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import me.tokyojack.expbooster.Core;

public class MobDie implements Listener {

	public MobDie(Core core) {
		// TODO Auto-generated constructor stub
	}

	@EventHandler
	public void onDeath(EntityDeathEvent event) {
		int amount = Core.getPlugin().getCurrentEXPMultiplier();

		if (amount == 1)
			return;

		event.setDroppedExp(event.getDroppedExp() * amount);
	}

}
