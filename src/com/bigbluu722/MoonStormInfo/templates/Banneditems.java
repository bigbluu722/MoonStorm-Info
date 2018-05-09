package com.bigbluu722.MoonStormInfo.templates;

import static org.bukkit.ChatColor.*;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import mkremins.fanciful.FancyMessage;

public class Banneditems {
	public static final String PREFIX_IRES = ChatColor.GOLD + "[" + ChatColor.BLUE + "Moon" + ChatColor.GREEN + "Storm " + ChatColor.YELLOW + "IRes" + ChatColor.GOLD + "] ";
	
	public static void bannedItems(CommandSender player) {
		new FancyMessage(PREFIX_IRES)
		.then("Banned Items:")
		  .color(GREEN)
		.send(player);
		new FancyMessage("[Continuum Orb] (Aether II) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Progression breaking; Able to get any item.")
		  .color(RED)
		.send(player);
		new FancyMessage("[Teru Teru Bozu] (Botania) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Weather control.")
		  .color(RED)
		.send(player);
		new FancyMessage("[Sun Dial] (Draconic Evolution) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Time control.")
		  .color(RED)
		.send(player);
		new FancyMessage("[Weather Controller] (Draconic Evolution) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Weather control.")
		  .color(RED)
		.send(player);
		new FancyMessage("[Shard of Laputa {Any}] (Botania)")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Grief/troll potential.")
		  .color(RED)
		.send(player);
		new FancyMessage("[Imbued Fire {Any}] (Thaumic Tinkerer) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Grief/troll potential.")
		  .color(RED)
		.send(player);
		new FancyMessage("[Lucky Bell] (Aether II) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Gives presents on mob kills. (Presents are banned)")
		  .color(RED)
		.send(player);
		new FancyMessage("[Present {Any}] (Aether II ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Pression breaking; Able to get any item.")
		  .color(RED)
		.send(player);
		new FancyMessage("[Bedrock] (Minecraft) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Grief/troll potential. (Placement Banned)")
		  .color(RED)
		.send(player);
		new FancyMessage("[Filing Cabinet {Any} (Extra Utilities) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Duping/item stacking explots.")
		  .color(RED)
		.send(player);
		new FancyMessage("[Wand Focus: Time] (Tainted Magic) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Time control.")
		  .color(RED)
		.send(player);
		new FancyMessage("[Wand Focus: Meteorology] (Tainted Magic) ")
		  .color(DARK_RED)
		.then("Reason: ")
		  .color(GOLD)
		.then("Weather control.")
		  .color(RED)
		.send(player);
	}
}
