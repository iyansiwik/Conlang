package me.iyansiwik.conlangorg;

public class Reference {
	
	public static final String TITLE = "Conlang Organizer";

	public static final int DEV_STAGE = 0; //0 = Alpha
	public static final int MAJOR_VERSION = 0;
	public static final int MINOR_VERSION = 0;
	public static final int BUILD_VERSION = 0;
	
	public static final String getVersion() {
		return MAJOR_VERSION + "." + MINOR_VERSION + "." + BUILD_VERSION + "a";
	}
}
