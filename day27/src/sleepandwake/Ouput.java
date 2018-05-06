package sleepandwake;
/*
 * 输出线程，对资源类Resource成员变量输出值
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
				
				//唤醒对方线程
				r.flag = false;
				r.notify();
			}
			
		}
	}
}
