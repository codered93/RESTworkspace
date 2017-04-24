package org.himanshu.javamaster.messenger.database;
import java.util.HashMap;
import java.util.Map;

import org.himanshu.javamaster.messenger.model.Message;
import org.himanshu.javamaster.messenger.model.Profile;

public class DatabaseClass {
	
	private static Map<Long,Message> messages=new HashMap<>();
	private static Map<String,Profile> profile=new HashMap<>();
	
	public static Map<Long,Message> getMessages(){
		return messages;
	}
	public static Map<String,Profile> getProfiles(){
		return profile;
	}
}
