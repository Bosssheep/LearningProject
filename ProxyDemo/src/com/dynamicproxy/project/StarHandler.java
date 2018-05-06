package com.dynamicproxy.project;
/**
 * 明星的代理处理器
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
  
	private Star realStar;//真实明星
	
	//通过构造器来初始化真实角色
    public StarHandler(Star realStar) {
        super();
        this.realStar = realStar;
    }
    
    /**
     * 所有的流程控制都在invoke方法中
     * proxy：代理类
     * method：正在调用的方法
     * args：方法的参数
     */	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		System.out.println("真实角色调用之前的处理.....");
		 if (method.getName().equals("sing")) {
	            object = method.invoke(realStar, args);//激活调用的方法
	        }
		 System.out.println("真实角色调用之后的处理.....");
		return object;
	}

}
