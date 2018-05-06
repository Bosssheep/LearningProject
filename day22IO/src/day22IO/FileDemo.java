package day22IO;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		        //File构造函数演示
				String pathName = "e:\\java_code\\day22e\\hello.java";
				File f1 = new File(pathName);//将Test22文件封装成File对象。注意；有可以封装不存在文件或者文件夹，变成对象。
				System.out.println(f1);
				
				File f2 = new File("e:\\java_code\\day22e","hello.java");
				System.out.println(f2);
				
				//将parent封装成file对象。
				File dir = new File("e:\\java_code\\day22e");
				File f3 = new File(dir,"hello.java");
				System.out.println(f3);


	}

}
