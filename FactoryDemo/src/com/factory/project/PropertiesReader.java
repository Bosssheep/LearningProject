package com.factory.project;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties文件读取工具
 * @author HYChan
 *
 */
public class PropertiesReader {

	public Map<String,String> getProperties(){
		
		Properties props = new Properties();
		Map<String,String> map = new HashMap<String,String>();
		try{
			//将文件加载到Properties类对象中
			InputStream in = getClass().getResourceAsStream("type.properties");
		    props.load(in);
		    
		    //按行读取
		    Enumeration en = props.propertyNames();
		    while(en.hasMoreElements()){
		    	//以等号为分割 划分 key 和 property
		    	String key = (String)en.nextElement();
		    	String property = props.getProperty(key);
		    	map.put(key, property);
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
		return map;
	}
}
