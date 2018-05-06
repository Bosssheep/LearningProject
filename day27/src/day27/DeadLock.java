package day27;

public class DeadLock implements Runnable{
 
	private int i = 0;
	
	public void run(){
		while(true){
			if(i%2==0){
				//�Ƚ���Aͬ������Bͬ��
				synchronized (LockA.locka) {
					System.out.println("if....locka");
					synchronized (LockB.lockb) {
						System.out.println("if...lockb");
					}
				}
			}else{
				//�Ƚ���Bͬ������Aͬ��
				synchronized (LockB.lockb) {
					System.out.println("else....lockb");
					synchronized (LockA.locka) {
						System.out.println("else...locka");
					}
				}
			}
			i++;
		}
	}
}
