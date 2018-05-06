package day23IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;;

/*
 * 字节流复制文件
 * 采用数组缓冲提高效率
 * 读取字节数组
 * 读取字节数组
 */
public class copy2 {

	public static void main(String[] args) {
		 FileInputStream fis = null;
		 FileOutputStream fos = null;
		 
		 try{
			 fis = new FileInputStream("d:\\adt-bundle-windows-x86_64-20140321.zip");
			 fos = new FileOutputStream("d:\\z.zip");
			 
			 byte[] bytes = new byte[1024];
			 int len = 0 ;
			 while((len = fis.read(bytes))!=-1){
				 fos.write(bytes,0,len);
			 }
		 }catch(IOException ex){
			    System.out.println(ex);
				throw new RuntimeException("copy error");
		 }finally{
			//关流
			 try{
				  if(fos!=null) fos.close();
				}
			 catch(IOException ex){
					throw new RuntimeException("close fos error");
				}
			 finally{
					try{
						if(fis!=null)
							fis.close();
					}
					catch(IOException ex){
						throw new RuntimeException("close fis error");
					}
					 
		     }
         }
	}
}
