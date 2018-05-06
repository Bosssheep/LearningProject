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
 * 客户端
 */
public class Client {

	public static void main(String[] args) {
		
		try {
			//1.创建客户端Socket，指定服务器地址和端口
			Socket socket = new Socket("localhost",8888);
			
			//2.创建输出流，向服务器发送登陆信息
			OutputStream os = socket.getOutputStream();
			
			PrintWriter pw = new PrintWriter(os);//输出流包装成打印流
			pw.write("用户名：可爱的陈  密码：123456");
			pw.flush();
			
			/*ObjectOutputStream oos = new ObjectOutputStream(os);
			User user = new User("admin","key");
			oos.writeObject(user);*/
			
			socket.shutdownOutput();
			
			//3.获取输入流，读取服务器端的响应信息
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String info = null;
			while((info = br.readLine())!=null){
				System.out.println("这里是客户端，服务器对我说："+info);
			}
			//4.关闭资源
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
