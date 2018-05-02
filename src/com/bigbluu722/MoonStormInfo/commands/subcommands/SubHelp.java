package com.bigbluu722.MoonStormInfo.commands.subcommands;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import com.bigbluu722.MoonStormInfo.templates.Messages;

public class SubHelp {
	public static final void handle(CommandSender sender, String[] args) {
		if(sender instanceof ConsoleCommandSender) {
			if(args.length > 1) { //ran as console
				sender.sendMessage(Messages.consoleTooManyArgs);
			} else {
				sender.sendMessage(Messages.consoleHelp);
			}
		}else {
			if(args.length > 1) { //ran as player
				Messages.tooManyArgs(sender);
			} else {
				Messages.commandsHelp(sender);
			}
		}
	}
}
