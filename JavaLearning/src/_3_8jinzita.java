
public class _3_8jinzita {

	public static void main(String[] args){
		
		final int NUM_OF_LINES = 5;
		
		for(int row=1;row<=NUM_OF_LINES;row++){
			
			//��ӡÿ���׿հ�
			for(int column=1;column<=NUM_OF_LINES-row;column++)
				System.out.print(" ");
			//��ӡһ������
			for(int num=row;num>=1;row--)
				System.out.print(num);
			//��ӡʣ��һ��
			for(int num=2;num<=row;num++)
				System.out.print(num);
			//����
			System.out.println();
		}
	}
}
