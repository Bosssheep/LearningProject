package com.url.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端线程处理类
 * @author HYChan
 *
 */
public class ServerThread extends Thread {

	//和本线程相关的socket
	Socket socket = null;
	public ServerThread(Socket socket){
		this.socket = socket;
	}
	
	//线程执行操作，响应客户端请求
	public void run(){
		
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		PrintWriter pw = null;
		
		
		try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String info = null;
			while((info = br.readLine())!=null){
				System.out.println("客户端对我说：你好吖~");
				System.out.println(info);
			}
			socket.shutdownInput();
			
			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			pw.write("Hello,欢迎登陆");
			pw.flush();
			socket.shutdownOutput();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			try {
				if(pw!=null)
						pw.close();
				if(os!=null)
						os.close();
				if(br!=null)
						br.close();
				if(isr!=null)
					    isr.close();
				if(is!=null)
						is.close();
				if(socket!=null)
						socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
			
	}
}
