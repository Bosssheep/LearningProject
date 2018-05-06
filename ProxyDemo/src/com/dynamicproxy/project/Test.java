package com.dynamicproxy.project;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		//真实的明星 毛不易
		Star realStar = new RealStar("毛不易");
		//毛不易的代理处理器
		 StarHandler handler = new StarHandler(realStar);
		 //提供了sing（）代理类 
		 Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
	     //调用代理类的唱歌方法：其实调用的是真实角色的唱歌方法
		 proxy.sing();
	}
}
