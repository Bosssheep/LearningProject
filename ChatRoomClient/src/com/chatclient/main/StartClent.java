package com.chatclient.main;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 从这里启动一个客户端
 * @author HYChan
 *
 */
public class StartClent {

	public static void main(String[] args) {
			 
		/*先新建一个jframe*/
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow frame = new MainWindow();
                    
                    frame.setVisible(true);
                    //创建完这个frame以后，传一份window的引用到ChatManager去
                    ChatManager.getChatManager().setWindow(frame);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });			
	}
}
