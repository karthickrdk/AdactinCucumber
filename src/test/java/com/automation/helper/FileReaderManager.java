package com.automation.helper;

public class FileReaderManager {

	private FileReaderManager() {
	}

	
	public static FileReaderManager getInstaceFr() {
	FileReaderManager fr=new FileReaderManager();
	return fr;
	}
	
	

	public ConfigurationReader getInstaceCr() throws Throwable {
		ConfigurationReader cr=new ConfigurationReader();
		return cr;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
