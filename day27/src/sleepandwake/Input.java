package sleepandwake;
/*
 * 输入线程，对资源对象Resource中的成员变量赋值
 * 一次赋值：张三，男
 * 第二次赋值，李四，女
 */
public class Input implements Runnable {

	private Resource r;
	boolean flag = false;
	public Input(Resource r){
		this.r =r;
	}
	@Override
	public void run() {
		int i = 0;
		while(true){
			synchronized (r) {
				//flag为true，等待
				if(r.flag){
					try{
						r.wait();
					}catch(Exception ex){
						
					}
				}
				
				if(i%2==0){
					r.name = "张三";
					r.sex = "男";
				}else{
					r.name = "李四";
					r.sex = "女";
				}
				//唤醒对方线程
				r.flag = true;
				r.notify();
			}
			i++;
		}
	}
}
