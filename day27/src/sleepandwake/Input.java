package sleepandwake;
/*
 * �����̣߳�����Դ����Resource�еĳ�Ա������ֵ
 * һ�θ�ֵ����������
 * �ڶ��θ�ֵ�����ģ�Ů
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
				//flagΪtrue���ȴ�
				if(r.flag){
					try{
						r.wait();
					}catch(Exception ex){
						
					}
				}
				
				if(i%2==0){
					r.name = "����";
					r.sex = "��";
				}else{
					r.name = "����";
					r.sex = "Ů";
				}
				//���ѶԷ��߳�
				r.flag = true;
				r.notify();
			}
			i++;
		}
	}
}
