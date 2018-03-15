package com.bigbluu722.MoonStormInfo.config;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;

import com.google.common.base.Optional;

public class Config {
	private static final File CONFIG = new File("plugins/MSInfo/config.yml");

	public static void load() {
		FileConfiguration fConfig = Bukkit.getPluginManager().getPlugin("MSInfo").getConfig();
		
		fConfig.set("Vote.Links.1", "vote1.com");
		fConfig.set("Vote.Links.2", "vote2.com");
		fConfig.set("Vote.Links.3", "vote3.com");
		fConfig.set("Vote.Links.4", "vote4.com");
		fConfig.set("Vote.Links.5", "vote5.com");
		fConfig.set("Forum.Link", "testsite.com");
		fConfig.set("Donate.Link", "testsite.com");
		fConfig.set("Staff.Link", "testsite.com");
		fConfig.set("FAQ.Link", "testsite.com");
		fConfig.set("Bending.Link", "testsite.com");
		fConfig.set("Discord.Link", "testsite.com");
		fConfig.set("Changelog.Link", "testsite.com");

		try {
			if (!CONFIG.exists()) {
				fConfig.save(CONFIG);
				Bukkit.getServer().getLogger().info("[MSInfo] The config file has been created!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Optional<FileConfiguration> getFileConfig() {
		FileConfiguration fConfig = Bukkit.getPluginManager().getPlugin("MSInfo").getConfig();
		try {
			fConfig.load(CONFIG);
			return Optional.of(fConfig);
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		}
		return Optional.absent();
	}
}
