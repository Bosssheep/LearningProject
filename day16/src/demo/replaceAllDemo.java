package demo;

public class replaceAllDemo {
	public static void main(String[] args) {
		replaceAll_1();
	}
	
	public static void replaceAll_1(){
		String str = "Hello Hy lover";
		str = str.replace("He", "#");
		System.out.println(str);
	}
}
