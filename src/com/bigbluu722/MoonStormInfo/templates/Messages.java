package com.bigbluu722.MoonStormInfo.templates;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;

public class Messages {
	final static PluginDescriptionFile pdfFile = Bukkit.getPluginManager().getPlugin("AuroraInfo").getDescription();
	static String version = pdfFile.getVersion();
	
	public static final String PREFIX = ChatColor.WHITE + "[" + ChatColor.LIGHT_PURPLE + "Au" + ChatColor.DARK_PURPLE
			+ "ro" + ChatColor.DARK_BLUE + "ra" + ChatColor.BLUE + "C" + ChatColor.DARK_AQUA + "ra" + ChatColor.AQUA
			+ "ft " + ChatColor.GOLD + "Info" + ChatColor.WHITE + "] ";

	public static final String VERSION = ChatColor.GREEN + "Version " + ChatColor.GOLD + version + ChatColor.GREEN
			+ " by bigbluu722" + ChatColor.WHITE + "\n";
}
