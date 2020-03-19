package com.rnat.chat.server;


public class ServerMain {	
	
	private int port;
	private Server server;
	
	public ServerMain(int port)
	{
		this.port = port;
		server = new Server(8191);
	}
	
	public static void main(String[] args)
	{		
		
		new ServerMain(8192);
	}
	
	

}