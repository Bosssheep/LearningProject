package com.url.project;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServerThread extends Thread {

	private DatagramSocket socket;
	private DatagramPacket packet;
	
	public UDPServerThread(DatagramSocket socket,DatagramPacket packet){
		this.socket = socket;
		this.packet = packet;
	}
	
	public void run(){
		/**
		 * 读取客户端数据
		 */
		String info = new String(packet.getData(), 0, packet.getLength());
		System.out.println("我是服务器，客户端跟我说："+info);
		
		/**
		 * 向客户端发送消息
		 */
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "欢迎您登陆~".getBytes();
		
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length,address,port);
		
		try {
			socket.send(packet2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
