package com.url.project;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * �������ˣ�ʵ�ֻ���UDP���û���½
 * @author HYChan
 *
 */
public class UDPServer {
	public static void main(String[] args) throws IOException {
		/**
		 * ���ܿͻ��˷��͵�����
		 */
		//1.������������DatagramSocket,ָ���˿�
		DatagramSocket socket = new DatagramSocket(8800);
		int count = 0;
		
		System.out.println("���������Ѿ�����");
		while(true){
			
			//2.�������ݰ�,���ڽ���
			byte[] data = new byte[1024];// �����ֽ����飬ָ�����ܵ����ݱ��Ĵ�С
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			//3.���ܿͻ��˷��͵�����
			socket.receive(packet);//�˷����ڽ������ݰ�֮ǰ��һֱ����
			UDPServerThread serverthread = new UDPServerThread(socket, packet);
			serverthread.start();
			count++;
			System.out.println("�ͻ�������������"+count);
		}
		
/*		//4.��ȡ����
		String info = new String(data,0,packet.getLength());
		System.out.println("���Ƿ��������ͻ��˸���˵��"+info);
		
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "��ӭ����½~".getBytes();
		
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length,address,port);
		
		socket.send(packet2);*/
		
		
	}
}
