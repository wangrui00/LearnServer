package com.java.util;

import java.util.UUID;

public class UUIDFactory {
	/**
	 * ²úÉúUUID
	 * **/
	public static String produceUUID(){
		return UUID.randomUUID().toString();
	}
	
	public static String getMeeting(){	
		return produceUUID();
	}
}
