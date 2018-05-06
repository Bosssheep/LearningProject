package com.url.project;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 服务器端，实现基于UDP的用户登陆
 * @author HYChan
 *
 */
public class UDPServer {
	public static void main(String[] args) throws IOException {
		/**
		 * 接受客户端发送的数据
		 */
		//1.创建服务器端DatagramSocket,指定端口
		DatagramSocket socket = new DatagramSocket(8800);
		int count = 0;
		
		System.out.println("服务器端已经启动");
		while(true){
			
			//2.创建数据包,用于接受
			byte[] data = new byte[1024];// 创建字节数组，指定接受的数据报的大小
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//3.接受客户端发送的数据
			socket.receive(packet);//此方法在接受数据包之前会一直阻塞
			UDPServerThread serverthread = new UDPServerThread(socket, packet);
			serverthread.start();
			count++;
			System.out.println("客户端连接数量："+count);
		}
		
/*		//4.读取数据
		String info = new String(data,0,packet.getLength());
		System.out.println("我是服务器，客户端跟我说："+info);
		
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "欢迎您登陆~".getBytes();
		
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length,address,port);
		
		socket.send(packet2);*/
		
		
	}
}
