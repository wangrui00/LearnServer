package com.java.util;

import java.util.UUID;

public class UUIDFactory {
	/**
	 * ����UUID
	 * **/
	public static String produceUUID(){
		return UUID.randomUUID().toString();
	}

}
