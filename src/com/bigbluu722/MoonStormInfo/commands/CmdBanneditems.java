package com.bigbluu722.MoonStormInfo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.bigbluu722.MoonStormInfo.templates.Banneditems;
import com.bigbluu722.MoonStormInfo.templates.Messages;

public class CmdBanneditems implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandString, String[] args) {
		if(args.length == 0) {
			Banneditems.bannedItems(sender);	
		} else {
			Messages.tooManyArgs(sender);
		} 
		return true;
	}
}
