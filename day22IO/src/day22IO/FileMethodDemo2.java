package day22IO;

import java.io.File;
import java.io.IOException;

public class FileMethodDemo2{

	public static void main(String[] args) throws IOException {
		File file = new File("e:\\file.txt");
		
 
		// 创建文件，如果文件不存在，创建,返回 true；如果文件存在，则不创建返回 false。 如果路径错误，IOException。
		boolean iscreate = file.createNewFile();
		System.out.println("is create?:" + iscreate);
		
		//-----------删除文件操作-------注意：不去回收站。慎用------
		boolean isdelete  = file.delete();
		System.out.println("is delete?:" + isdelete);
		
		//-----------需要判断文件是否存在------------
		boolean isexist = file.exists();
		System.out.println("is exists?:" + isexist);
		
		
		//-----------对目录操作 创建，删除，判断------------
		boolean iscreatedir = file.mkdir();
		System.out.println(iscreatedir);
		
		
		
	}

}
