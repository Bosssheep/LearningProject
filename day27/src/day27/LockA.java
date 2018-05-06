package day27;

public class LockA {

	//确保类唯一性
	private LockA(){}
	
	public final static LockA locka = new LockA();
}
