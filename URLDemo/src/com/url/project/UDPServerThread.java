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
		 * ��ȡ�ͻ�������
		 */
		String info = new String(packet.getData(), 0, packet.getLength());
		System.out.println("���Ƿ��������ͻ��˸���˵��"+info);
		
		/**
		 * ��ͻ��˷�����Ϣ
		 */
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "��ӭ����½~".getBytes();
		
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length,address,port);
		
		try {
			socket.send(packet2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
