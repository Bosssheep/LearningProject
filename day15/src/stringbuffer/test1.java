package stringbuffer;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("chy");
		sb.insert(3, "yutong");
		sb.delete(1, 4);
		System.out.println(sb);
	}

}
