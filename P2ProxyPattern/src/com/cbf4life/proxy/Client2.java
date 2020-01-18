package com.cbf4life.proxy;

public class Client2 {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("张三");
		IGamePlayer proxy = new GamePlayerProxy(player);
		System.out.println("start time 10:45");
		proxy.login("Zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("end time 3:40");
	}

}
