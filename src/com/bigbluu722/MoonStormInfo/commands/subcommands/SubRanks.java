package com.bigbluu722.MoonStormInfo.commands.subcommands;

import org.bukkit.command.CommandSender;

import com.bigbluu722.MoonStormInfo.templates.Messages;

public class SubRanks {
	public static final void handle(CommandSender sender, String[] args) {
		if(args.length > 1) {
			Messages.tooManyArgs(sender);
		} else {
			Messages.rankList(sender);
		}
	}
}
