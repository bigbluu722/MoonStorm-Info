package com.bigbluu722.MoonStormInfo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import com.bigbluu722.MoonStormInfo.commands.subcommands.SubForum;
import com.bigbluu722.MoonStormInfo.templates.Messages;

public class CmdMsi implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandString, String[] args) {
		if(args.length == 0) {
			if(sender instanceof ConsoleCommandSender) {
				sender.sendMessage("fuck off console");
			} else {
				Messages.commandsHelp(sender);
			}	
		} else {
			switch(args[0].toLowerCase()) {
			case "bending":
				SubForum.handle(sender, args);
			break;
			default:
				Messages.unknownCMD(sender);
			}
		}
		return true;
	}
}