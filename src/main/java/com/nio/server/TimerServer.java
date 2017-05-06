/*****************************************************************
 * Copyright (c) 2017 www.noryar.com Inc. All rights reserved.
 *****************************************************************/
package com.nio.server;

/**
 * 类描述:时间服务器.
 * 
 * @author leon.
 */
public class TimerServer {

	public static void main(String[] args) {
		int port = 8080;
		MultiplexerTimerServer multiplexerTimerServer = new MultiplexerTimerServer(port);
		new Thread(multiplexerTimerServer, "server-01").start();
	}

}
