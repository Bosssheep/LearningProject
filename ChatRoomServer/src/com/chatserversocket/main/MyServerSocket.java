package com.chatserversocket.main;
/**
 * 服务端启动程序
 * @author HYChan
 *
 */
public class MyServerSocket {

	public static void main(String[] args){
		
		//打开监听器线程，监听器中建立socket连接
		ServerListener listener = new ServerListener();
		System.out.println("打开监听器");
		listener.start();
	}
}
