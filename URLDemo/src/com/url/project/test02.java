package com.url.project;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URLchangyongfangfa 
 */
public class test02 {

	public static void main(String[] args){
		try {
			//����һ��URLʵ��
			URL imooc = new URL("http://www.imooc.com");
			URL url = new URL(imooc,"/index.html?username=tom#test");//?������#ê��
			
			System.out.println("Э�飺"+url.getProtocol());
			System.out.println("������"+url.getHost());
			System.out.println("�˿ڣ�"+url.getPort());//δָ���˿ںţ�����Э��ѡ��Ĭ�϶˿ں�
			System.out.println("�ļ�·��"+ url.getPath());
			System.out.println("�ļ���"+url.getFile());
			System.out.println("���·��"+url.getRef());
			System.out.println("��ѯ�ַ���"+url.getQuery());
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
}
