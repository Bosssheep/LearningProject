package com.url.project;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * �ͻ���
 */
public class Client {

	public static void main(String[] args) {
		
		try {
			//1.�����ͻ���Socket��ָ����������ַ�Ͷ˿�
			Socket socket = new Socket("localhost",8888);
			
			//2.���������������������͵�½��Ϣ
			OutputStream os = socket.getOutputStream();
			
			PrintWriter pw = new PrintWriter(os);//�������װ�ɴ�ӡ��
			pw.write("�û������ɰ��ĳ�  ���룺123456");
			pw.flush();
			
			/*ObjectOutputStream oos = new ObjectOutputStream(os);
			User user = new User("admin","key");
			oos.writeObject(user);*/
			
			socket.shutdownOutput();
			
			//3.��ȡ����������ȡ�������˵���Ӧ��Ϣ
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String info = null;
			while((info = br.readLine())!=null){
				System.out.println("�����ǿͻ��ˣ�����������˵��"+info);
			}
			//4.�ر���Դ
			pw.close();
			os.close();
			socket.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
