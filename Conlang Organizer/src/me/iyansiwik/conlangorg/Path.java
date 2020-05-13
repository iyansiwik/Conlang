package me.iyansiwik.conlangorg;

import net.harawata.appdirs.AppDirsFactory;

public class Path {

	public static String getDataFolder() {
		return AppDirsFactory.getInstance().getUserDataDir("conOrg", "1.0.0", "iyansiwik");
	}
}
