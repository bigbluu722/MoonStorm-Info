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

	public static final String VERSION = ChatColor.GREEN + "Version " + ChatColor.GOLD + version + ChatColor.GREEN + " by bigbluu722 " + ChatColor.WHITE;
		
	public static void commandsHelp(CommandSender player) {
		new FancyMessage(PREFIX + VERSION)
		.send(player);
		new FancyMessage("» ")
		.then("/msi ")
		  .color(GOLD)
		  .suggest("/msi")
		.then(" - ")
		.then("Displays this menu.")
		  .color(GREEN)
		.send(player);
		new FancyMessage("» ")
		.then("/banneditems")
		  .color(GOLD)
		  .suggest("/banneditems")
		.then(" - ")
		.then("Shows banned items.")
		  .color(GREEN)
		.send(player);
		new FancyMessage("» ")
		.then("/msi ")
		  .color(GOLD)
		  .suggest("/msi changelog")
		.then("changelog")
		  .color(YELLOW)
		  .suggest("/msi changelog")
		.then(" - ")
		.then("Link to changelogs.")
		  .color(GREEN)
		.send(player);
		new FancyMessage("» ")
		.then("/msi ")
		  .color(GOLD)
		  .suggest("/msi discord")
		.then("discord")
		  .color(YELLOW)
		  .suggest("/msi discord")
		.then(" - ")
		.then("Join our discord!")
		  .color(GREEN)
		.send(player);
		new FancyMessage("» ")
		.then("/msi ")
		  .color(GOLD)
		  .suggest("/msi forum")
		.then("forum")
		  .color(YELLOW)
		  .suggest("/msi forum")
		.then(" - ")
		.then("Join our forum for the latest info!")
		  .color(GREEN)
		.send(player);
		new FancyMessage("» ")
		.then("/msi ")
		  .color(GOLD)
		  .suggest("/msi help")
		.then("help")
		  .color(YELLOW)
		  .suggest("/msi help")
		.then(" - ")
		.then("Displays this menu.")
		  .color(GREEN)
		.send(player);
		new FancyMessage("» ")
		.then("/msi ")
		  .color(GOLD)
		  .suggest("/msi ranks")
		.then("ranks")
		  .color(YELLOW)
		  .suggest("/msi ranks")
		.then(" - ")
		.then("Displays info on server ranks.")
		  .color(GREEN)
		.send(player);
		new FancyMessage("» ")
		.then("/msi ")
		  .color(GOLD)
		  .suggest("/msi staff")
		.then("staff")
		  .color(YELLOW)
		  .suggest("/msi staff")
		.then(" - ")
		.then("Apply for staff.")
		  .color(GREEN)
		.send(player);
		new FancyMessage("» ")
		.then("/msi ")
		  .color(GOLD)
		  .suggest("/msi vote")
		.then("vote")
		  .color(YELLOW)
		  .suggest("/msi vote")
		.then(" - ")
		.then("Vote for our server!")
		  .color(GREEN)
		.send(player);
	}
	
	public static void unknownCMD(CommandSender player) {
		new FancyMessage(PREFIX)
		.then("Unknown command! Please consult ")
		  .color(RED)
		.then("/msi")
		  .color(GOLD)
		  .suggest("/msi")
		.then(".")
		  .color(RED)
		.send(player);
	}
	
	public static void tooManyArgs(CommandSender player) {
		new FancyMessage(PREFIX)
		.then("Too many arguments! Please consult ")
		  .color(RED)
		.then("/msi")
		  .color(GOLD)
		  .suggest("/msi")
		.then(".")
		  .color(RED)
		.send(player);
	}
	
	public static void forumLink(CommandSender player) {
		new FancyMessage(PREFIX)
		.then("Interested in joining our forums? Click ")
		  .color(GREEN)
		.then("here ")
		  .color(GOLD)
		  .link("https://moonstorm.info/")
		.then("to join for the latest info for the community or server overall.")
		  .color(GREEN)
		.send(player);
	}
	
	public static void changelogLink(CommandSender player) {
		new FancyMessage(PREFIX)
		.then("Looking for updates or the latest changes? Checkout our ")
		  .color(GREEN)
		.then("forum ")
		  .color(GOLD)
		  .link("https://moonstorm.info/forums/changelogs/")
		.then("or our ")
		  .color(GREEN)
		.then("github")
		  .color(GOLD)
		  .link("https://github.com/bigbluu722/MoonStorm-Modded-Minecraft")
		.then(".")
		  .color(GREEN)
		.send(player);
	}
	
	public static void discordLink(CommandSender player) {
		new FancyMessage(PREFIX)
		.then("Join our ")
		  .color(GREEN)
		.then("discord ")
		  .color(GOLD)
		  .link("https://discord.gg/syqJ7ta")
		.then("to chat with the community or people on the server!")
		  .color(GREEN)
		.send(player);
	}
	
	public static void rankList(CommandSender player) {
		new FancyMessage(PREFIX)
		.send(player);
	}

	public static void staffLink(CommandSender player) {
		new FancyMessage(PREFIX)
		.then("Looking to apply for staff? Look no further, head to our ")
		  .color(GREEN)
		.then("forum ")
		  .color(GOLD)
		  .link("https://moonstorm.info/forums/applications/")
		.then("to apply today.")
		  .color(GREEN)
		.send(player);
	}
	
	public static void voteLinks(CommandSender player) {
		new FancyMessage(PREFIX)
		.then("Vote for our server! Links below:")
		  .color(GREEN)
		.send(player);
		new FancyMessage("» ")
		  .color(GOLD)
		.then("Link 1")
		  .color(AQUA)
		  .link("http://test.com")
		.send(player);
	}
}