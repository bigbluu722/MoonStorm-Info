package com.bigbluu722.MoonStormInfo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class CmdMsi implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandString, String[] args) {
		if(args.length == 0) {
			if(sender instanceof ConsoleCommandSender) {
				sender.sendMessage("t");
			} else {
				
			}	

		}
		return true;
	}
}