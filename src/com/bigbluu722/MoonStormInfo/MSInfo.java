package com.bigbluu722.MoonStormInfo;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import com.bigbluu722.MoonStormInfo.config.Config;
import com.bigbluu722.MoonStormInfo.commands.CmdMsi;


public class MSInfo extends JavaPlugin {

	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		
		getCommand("aci").setExecutor(new CmdMsi());

		logger.info(pdfFile.getName() + " has been enabled! [v" + pdfFile.getVersion()
				+ "]");
		
		Config.load();
	}

	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		logger.info(pdfFile.getName() + " has been disabled! [v" + pdfFile.getVersion()
				+ "]");
	}
}