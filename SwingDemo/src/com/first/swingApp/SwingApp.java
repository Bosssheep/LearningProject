package com.first.swingApp;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class SwingApp extends JFrame{

	public SwingApp(){
		super();
		initUI();
		
	}
	private void initUI() {
		
		//创建一个容器
		JPanel contentPanel = new JPanel();
		
		//1.设置容器布局 为 流式布局
		/*contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		//添加button
		JButton oneBtn1 = new JButton("按钮1");
		JButton oneBtn2 = new JButton("按钮2");
		contentPanel.add(oneBtn1);
		contentPanel.add(oneBtn2);*/
		
		//2.设置容器布局 为 边界布局  BorderLayout(左右边界，上下边界)
	/*	contentPanel.setLayout(new BorderLayout(10,20));
		JButton oneBtn1 = new JButton("按钮1");
		JButton oneBtn2 = new JButton("按钮2");
		JButton oneBtn3 = new JButton("按钮3");
		JButton oneBtn4 = new JButton("按钮4");
		JButton oneBtn5 = new JButton("按钮5");
		contentPanel.add(BorderLayout.EAST,oneBtn1);
		contentPanel.add(BorderLayout.WEST,oneBtn2);
		contentPanel.add(BorderLayout.SOUTH,oneBtn3);
		contentPanel.add(BorderLayout.NORTH,oneBtn4);
		contentPanel.add(BorderLayout.CENTER,oneBtn5);*/
		
		//3.设置容器布局为 格布局
		/*
		 * 将整个画布空间分成指定的若干个等面积的小格子，
		 * 我们随后向画布中添加的控件会被逐个添加到这些格子中，
		 * 如果格子数量不够，其会保持指定行数不变，自动扩充列数。
		 * GridLayout 4个参数 （rows,cols,hgap,vgap）
		 */
		contentPanel.setLayout(new GridLayout(3,2,10,20));
		JButton oneBtn1 = new JButton("按钮1");
		JButton oneBtn2 = new JButton("按钮2");
		JButton oneBtn3 = new JButton("按钮3");
		JButton oneBtn4 = new JButton("按钮4");
		JButton oneBtn5 = new JButton("按钮5");
		contentPanel.add(oneBtn1);
		contentPanel.add(oneBtn2);
		contentPanel.add(oneBtn3);
		contentPanel.add(oneBtn4);
		contentPanel.add(oneBtn5);
		
		//将容器放进窗口中
		getContentPane().add(contentPanel);
		
		
		
	}
	public static void main(String[] args) {
	
		SwingApp mainWindow = new SwingApp();
		mainWindow.setTitle("聊天窗口");
		mainWindow.setSize(600,400);
		
		//设置为不可伸缩大小
		mainWindow.setResizable(Boolean.FALSE);
		
		//设置最后显示的应用窗口运行时居中显示
		mainWindow.setLocationRelativeTo(null);
		
		//点击右上角按钮的动作为应用关闭并退出
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainWindow.setVisible(Boolean.TRUE);

	}

}
