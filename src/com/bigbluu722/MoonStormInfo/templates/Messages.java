package com.bigbluu722.MoonStormInfo.templates;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;

import mkremins.fanciful.FancyMessage;
import static org.bukkit.ChatColor.*;

public class Messages {
	final static PluginDescriptionFile pdfFile = Bukkit.getPluginManager().getPlugin("MSInfo").getDescription();
	static String version = pdfFile.getVersion();
	
	public static final String PREFIX = ChatColor.GOLD + "[" + ChatColor.BLUE + "Moon" + ChatColor.GREEN + "Storm " + ChatColor.YELLOW + "Info" + ChatColor.GOLD + "] ";

	public static final String VERSION = ChatColor.GREEN + "Version " + ChatColor.GOLD + version + ChatColor.GREEN + " by bigbluu722 \n" + ChatColor.WHITE;
	
	public static final String consoleTooManyArgs = PREFIX + "";
	
	public static final String consoleHelp = PREFIX + "";
	
	public static void commandsHelp(CommandSender player) {
		new FancyMessage(PREFIX + VERSION)
		.then("How the fuck did I do this right")
		
		.send(player);
	}
	
	public static void unknownCMD(CommandSender player) {
		new FancyMessage(PREFIX)
		.then("Unknown command! Please consult ")
		  .color(RED)
		.then("/aci")
		  .color(GOLD)
		  .suggest("/aci")
		.then(".")
		  .color(RED)
		.send(player);
	}
	
	public static void tooManyArgs(CommandSender player) {
		new FancyMessage(PREFIX)
		.send(player);
	}
	
	public static void forumLink(CommandSender player) {
		new FancyMessage(PREFIX)
		.then("Interested in joining our forums? Click ")
		  .color(GREEN)
		.then("here ")
		  .color(GOLD)
		  .link("https://moonstorm.info/")
		.then("to join us for the latest info for the community or server overall.")
		  .color(GREEN)
		.send(player);
	}
}
