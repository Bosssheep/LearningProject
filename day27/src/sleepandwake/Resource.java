package sleepandwake;
/*
 * 定义资源类 有两个成员变量
 * name sex
 * 同时有两个线程对资源中的变量操作，一个赋值，一个输出打印
 */
public class Resource {

	public String name;
	public String sex;
	public boolean flag=false;
	
}
