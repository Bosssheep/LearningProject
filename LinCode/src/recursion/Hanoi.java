package recursion;
/*
 * ��ŵ���ݹ鷨
 * time��2018-3-22
 */
public class Hanoi {

	public static void main(String[] args) {
		//Test
		int n = 3;
		char A = 'A',B = 'B',C = 'C';
		Hanoi.hanoi(n, A, B, C);

	}
	
	public static void hanoi(int n,char A,char B,char C){
		if(n == 1)
			Hanoi.move(1,A,C);
		else{
			hanoi(n-1,A,C,B);//�ݹ飬��A���ϱ��1~n-1��Բ���Ƶ�B�ϣ���CΪ������
			Hanoi.move(1,A,C);//��A���ϱ��Ϊn��Բ���Ƶ�C��
			hanoi(n-1,B,A,C);//�ݹ飬��B���ϱ��1~n-1��Բ���Ƶ�C�ϣ���AΪ������
		}
	}
	
	public static void move(int disks,char from,char to){
		System.out.println("��"+from+"�ƶ���"+to+"��");
	}

}
