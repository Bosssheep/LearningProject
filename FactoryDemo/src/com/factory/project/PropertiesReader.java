package com.factory.project;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties�ļ���ȡ����
 * @author HYChan
 *
 */
public class PropertiesReader {

	public Map<String,String> getProperties(){
		
		Properties props = new Properties();
		Map<String,String> map = new HashMap<String,String>();
		try{
			//���ļ����ص�Properties�������
			InputStream in = getClass().getResourceAsStream("type.properties");
		    props.load(in);
		    
		    //���ж�ȡ
		    Enumeration en = props.propertyNames();
		    while(en.hasMoreElements()){
		    	//�ԵȺ�Ϊ�ָ� ���� key �� property
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
