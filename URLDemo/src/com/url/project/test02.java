package com.url.project;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * URLchangyongfangfa 
 */
public class test02 {

	public static void main(String[] args){
		try {
			//创建一个URL实例
			URL imooc = new URL("http://www.imooc.com");
			URL url = new URL(imooc,"/index.html?username=tom#test");//?参数；#锚点
			
			System.out.println("协议："+url.getProtocol());
			System.out.println("主机："+url.getHost());
			System.out.println("端口："+url.getPort());//未指定端口号，根据协议选择默认端口号
			System.out.println("文件路径"+ url.getPath());
			System.out.println("文件名"+url.getFile());
			System.out.println("相对路径"+url.getRef());
			System.out.println("查询字符串"+url.getQuery());
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
}
