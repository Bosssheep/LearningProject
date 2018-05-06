package com.factory.project;

import java.util.Map;

/**
 * 发型工厂
 * @author HYChan
 *
 */
public class HariFactory {

	public HairInterface getHari(String key){
	   if("left".equals(key)){
			return new LeftHari();
		}else if("right".equals(key)){
			return new RightHari();
		}else{
			return null;
		}
	}
/**
 * 根据类名来生产对象,反射机制
 * @param className
 * @return
 */
	public HairInterface getHairByClass(String className){
		try{
			HairInterface hair = (HairInterface)Class.forName(className).newInstance();
			return hair;
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}

/**
 * 根据类名来生产对象，反射+映射
 * @param key
 * @return
 */
	public HairInterface getHairByClassKey(String key){
		try{
			Map<String, String> map = new PropertiesReader().getProperties();
			String className = map.get(key);
			HairInterface hair = (HairInterface)Class.forName(className).newInstance();
			return hair;
		}catch(InstantiationException e){
			e.printStackTrace();
		}catch(IllegalAccessException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return null;
	}
}
