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
		if (!commandSender.isOp()) {
			commandSender.sendMessage(ChatColor.RED + "You cannot do that command!");
			return false;
		}

		if (args.length <= 0) {
			commandSender.sendMessage(
					ChatColor.GREEN + "Current EXP multiplier: " + Core.getPlugin().getCurrentEXPMultiplier());
			return true;
		}

		Core.getPlugin().setCurrentEXPMultiplier(Integer.parseInt(args[0]));
		commandSender.sendMessage(ChatColor.GREEN + "EXP multiplier set to: " + args[0]);

		return true;
	}

}
