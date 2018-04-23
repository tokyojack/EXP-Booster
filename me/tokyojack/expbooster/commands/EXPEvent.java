package me.tokyojack.expbooster.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import me.tokyojack.expbooster.Core;
import me.tokyojack.expbooster.utils.kommand.Kommand;

public class EXPEvent extends Kommand {

	public EXPEvent() {
		super("EXPEvent command");
	}

	@Override
	public boolean execute(CommandSender commandSender, String label, String[] args) {
		
		// If the player is not op'ed
		if (!commandSender.isOp()) {
			commandSender.sendMessage(ChatColor.RED + "You cannot do that command!");
			return false;
		}

		if (args.length <= 0) {
			commandSender.sendMessage(
					ChatColor.GREEN + "Current EXP multiplier: " + Core.getPlugin().getCurrentEXPMultiplier());
			return true;
		}
		
		int newMultiplierAmount = Integer.parseInt(args[0]);

		Core.getPlugin().setCurrentEXPMultiplier(newMultiplierAmount);
		commandSender.sendMessage(ChatColor.GREEN + "EXP multiplier set to: " + newMultiplierAmount);

		return true;
	}

}
