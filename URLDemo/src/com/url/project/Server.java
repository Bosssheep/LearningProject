package com.url.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ����TCPЭ���Socketͨ��,ʵ���û���½
 * ��������
 */
public class Server {

	public static void main(String[] args) {
		
		try {
			//1.����һ��ServerSocket��ָ���󶨶˿�
			ServerSocket serverSocket = new ServerSocket(8888);
			Socket socket = null;
			int count = 0;
			
			System.out.println("***�����������������ȴ��ͻ��˵�����***");
			
			//2.ѭ�������ȴ��ͻ��˵�����
			while(true){
				//����accept����������ʼ�������ȴ��ͻ��˵�����
				socket = serverSocket.accept();
				//����һ���µ��߳�
				ServerThread serverThread = new ServerThread(socket);
				//�����߳�
				serverThread.start();
				count++;
				System.out.println("�ͻ��˵�������"+count);
				InetAddress address = socket.getInetAddress();
				System.out.println("�ͻ��˵�IP��"+address.getHostAddress());
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
