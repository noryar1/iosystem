/*****************************************************************
 * Copyright (c) 2017 www.noryar.com Inc. All rights reserved.
 *****************************************************************/
package com.nio.client;

public class TimerClient {

	public static void main(String[] args) {
		new Thread(new Client("127.0.0.1", 8080), "timeclient-01").start();;
	}
	
}
