package sleepandwake;
/*
 * ����̣߳�����Դ��Resource��Ա�������ֵ
 */
public class Ouput implements Runnable{

	private Resource r;
	public Ouput(Resource r){
		this.r =r;
	}
	
	public void run(){
		while(true){
			synchronized (r) {
				if(!r.flag){
					try{
						r.wait();
					}catch(Exception ex){}
					
				}
				System.out.println(r.name+".."+r.sex);
				
				//���ѶԷ��߳�
				r.flag = false;
				r.notify();
			}
			
		}
	}
}
