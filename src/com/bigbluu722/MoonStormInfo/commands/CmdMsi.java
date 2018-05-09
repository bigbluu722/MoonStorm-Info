package com.bigbluu722.MoonStormInfo.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.bigbluu722.MoonStormInfo.commands.subcommands.SubChangelog;
import com.bigbluu722.MoonStormInfo.commands.subcommands.SubDiscord;
import com.bigbluu722.MoonStormInfo.commands.subcommands.SubForum;
import com.bigbluu722.MoonStormInfo.commands.subcommands.SubHelp;
import com.bigbluu722.MoonStormInfo.commands.subcommands.SubRanks;
import com.bigbluu722.MoonStormInfo.commands.subcommands.SubStaff;
import com.bigbluu722.MoonStormInfo.commands.subcommands.SubVote;
import com.bigbluu722.MoonStormInfo.templates.Messages;

public class CmdMsi implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandString, String[] args) {
		if(args.length == 0) {
			Messages.commandsHelp(sender);
		} else {
			switch(args[0].toLowerCase()) {
			case "forum":
				SubForum.handle(sender, args);
			break;
			case "changelog":
				SubChangelog.handle(sender, args);
			break;
			case "discord":
				SubDiscord.handle(sender, args);
			break;
			case "help":
				SubHelp.handle(sender, args);
			break;
			case "ranks":
				SubRanks.handle(sender, args);
			break;
			case "staff":
				SubStaff.handle(sender, args);
			break;
			case "vote":
				SubVote.handle(sender, args);
			break;
			default:
				Messages.unknownCMD(sender);
			}
		}
		return true;
	}
}