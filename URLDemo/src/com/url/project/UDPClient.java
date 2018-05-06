package com.url.project;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		/**
		 * 向服务器端发送数据
		 */
		//1.定义服务器地址、端口号、数据
		InetAddress address = InetAddress.getByName("localhost");
		int port = 8800;
		byte[] data = "我是帅气的陈".getBytes();
		
		//2.创建数据报
		DatagramPacket packet = new DatagramPacket(data, data.length, address,port);
		
		//3.创建DatagramSocket对象
		DatagramSocket socket = new DatagramSocket();
		
		//4.向服务器端发送数据报
		socket.send(packet);
		
		/**
		 * 接受服务器端的响应数据
		 */
		byte[] data2 = new byte[1024];
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
		
		socket.receive(packet2);
		
		String reply = new String(data2,0,packet2.getLength());
		System.out.println("这里是客户端，服务器跟我说："+reply);
		
		socket.close();
		
		
	}
}
