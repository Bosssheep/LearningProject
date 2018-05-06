package Offer;

public class Test {

	public static void main(String[] args) {
		Finllay test = new Finllay();
		System.out.println(test.test());

	}

}
class Finllay{
    int i = 0;
	public  int test(){
		try{
			return ++i;
		}finally{
			
			System.out.println("this is finally:i="+i);
			return i+10;
		}
	}
}