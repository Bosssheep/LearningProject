package homework2_2;
/**
 * Class Substring
 * @author HYChan 2018-4-3
 *
 */
public class Substring {

	public static void main(String[] args) {
		String str = args[0];
		int begin = Integer.parseInt(args[1]);
		int end = begin+Integer.parseInt(args[2]);
		
	    System.out.println("str="+str + " begin="+begin+" end="+end);
	    String res = str.substring(begin, end);
	    System.out.println("res="+res);
	}
}
