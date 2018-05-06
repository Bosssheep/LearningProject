package com.chatclient.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
    private JPanel chatpanel;


    private JTextArea show_area; //聊天的消息文本框
	private JTextArea input_area;//发送消息文本框
	private JButton sendbutton;//发送按钮
	
    public MainWindow() {
    	 setAlwaysOnTop(true);
         setTitle("聊天窗口");
         setSize(600,400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
         chatpanel = new JPanel();
         chatpanel.setLayout(new FlowLayout());
         setContentPane(chatpanel);
         
     
         
         show_area = new JTextArea(10,50);
     	 input_area = new JTextArea(7,50);
     	 
 		
     	sendbutton = new JButton("send");
 		//为发送按钮添加事件监听器
 		ActionListener listener = new ActionListener(){
 			public void actionPerformed(ActionEvent event){
 				ChatManager.getChatManager().send(input_area.getText());
 				
 				appendText("我说: "+input_area.getText());
 				show_area.setLineWrap(true);
 				input_area.setText("");
 				
 			}
 		};
 		sendbutton.addActionListener(listener);
         
 		chatpanel.add(show_area);
		chatpanel.add(input_area);
		chatpanel.add(sendbutton);
		
		ChatManager.getChatManager().connect();
	}
    
    /*客户端发送的内容添加到show_area控件中*/
    public void appendText(String in){
        show_area.append("\n" + in);
    }
}
