package day21;

public class demo2 {

	public static void main(String[] args) {
		
		try{
			int[] arr = new int[3];
			System.out.println( arr [5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�쳣������");
		}
		finally{
			System.out.println("����");
		}
		System.out.println("���н��");
			
	}
}
