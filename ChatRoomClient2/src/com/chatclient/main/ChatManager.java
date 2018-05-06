package com.chatclient.main;
/*
 * ChatManager（需要单例化的类）管理socket，实现聊天的输入输出功能
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatManager {

	 private static final ChatManager instance=new ChatManager();
	 private ChatManager(){}
	 
	 public static ChatManager getChatManager(){
	     return instance;
	 }
	 
	 //界面相关属性
	 private MainWindow window;
	 
	 //连接相关属性
	 private Socket socket;   
	 private String IP;
	 private int port;
	 
	 //消息相关属性
	 private BufferedReader bReader; //输入流
	 private PrintWriter pWriter;//输出流
	 
	 public void setWindow(MainWindow window) {
		 this.window = window;
	     System.out.println("window和chatmanager已经连接好了");
	 }
	 
	 public void connect() {
		 
		 	IP = "localhost";
		 	port = 12345;
	        
	        new Thread(){

	            @Override
	            public void run() {
	                //实现网络方法
	                try {
	                    socket = new Socket(IP, port);
	                    
	                    //输出流
	                    pWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
	                    //输入流
	                    bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

	                    String line = null;
	                    //如果输入流的数据不为空，则打印到window窗口中
	                    while ((line = bReader.readLine())!=null) {
	                    	System.out.println("收到： "+line);
	                        window.appendText("收到： "+line);
	                    }
	                    //读完数据之后要关闭
	                    pWriter.close();
	                    bReader.close();
	                    

	                } catch (UnknownHostException e) {
	                    e.printStackTrace();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }.start();
	    }

	 	public void send(String sendMsg){
	        if (pWriter!=null) {
	            pWriter.write(sendMsg+"\n");
	            pWriter.flush();
	        } else {
	            window.appendText("当前链接已经中断...");
	        }
	    }
}
