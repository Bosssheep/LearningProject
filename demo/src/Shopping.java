import java.util.ArrayList;
import java.util.Scanner;

/*
 *   ���й���ϵͳ����
 *   ʵ�֣�
 *   	1����Ʒ���ݻ���ʼ��
 *      2���û��˵�ѡ��
 *      3������ѡ��ִ�в�ͬ����
 *          3.1 Read    �鿴��Ʒ
 *      	3.2 Create�������Ʒ
 *      	3.3 Delete  ɾ����Ʒ
 *      	3.4 Update  ������Ʒ
 *   
 *   ���巽��ʵ��
 */
public class Shopping {

	public static void main(String[] args) {
	
		//����ArrayList���ϣ��洢��Ʒ����
		ArrayList<FruitItem> array = new ArrayList<FruitItem>();
		//��ʼ����Ʒ����
		init(array);
		
		while(true){
			int choose = mainMenu();
			switch(choose){
			case 1:
				//�����嵥
				showFruitList(array);
				break;
			case 2:
				//��ӻ���
				addFruitItem(array);
				break;
			case 3:
				//ɾ������
				deleteFruitItem(array);
				break;
			case 4:
				//�޸Ļ���
				updateFruitItem(array);
				break;
			default:
				System.out.println("��������");
				break;
			}
			
		}
	}


	//���巽����ʵ����Ʒ��ʼ��
	public static void init(ArrayList<FruitItem> array){
		//���������FruitItem����
		FruitItem fruit1 = new FruitItem();
		fruit1.ID = 9527;
		fruit1.name = "�����";
		fruit1.price = 12.7;

		FruitItem fruit2 = new FruitItem();
		fruit2.ID = 9528;
		fruit2.name = "��������";
		fruit2.price = 20;
		
		FruitItem fruit3 = new FruitItem();
		fruit3.ID = 9529;
		fruit3.name = "������";
		fruit3.price = 6.5;
			
		array.add(fruit1);
		array.add(fruit2);
		array.add(fruit3);
	}
	
	//���巽����ʵ�����˵�����ʾ�û�ѡ����,�������û�ѡ�����
	public static int mainMenu(){
		System.out.println();
		System.out.println("==============��ӭIT����==============");
		System.out.println("1�������嵥   2����ӻ���   3��ɾ������  4���޸Ļ���  5���˳�");
		System.out.println("��������Ҫ�����Ĺ�����ţ�");
		
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	//��ʾ�����嵥����
	public static void showFruitList(ArrayList<FruitItem> array){
		System.out.println();
		System.out.println("==============��Ʒ����嵥==============");
		System.out.println("���      ��Ʒ����    ����");
		//��������
		for (int i = 0; i < array.size(); i++) {
			//ͨ��get��������ȡÿ������
			FruitItem item = array.get(i);
			System.out.println(item.ID+"    "+item.name+"    "+item.price);
		}
	}
	
	//��ӻ��﹦��
	public static void addFruitItem(ArrayList<FruitItem> array){
		FruitItem fruit = new FruitItem();
		
		System.out.println("��ӭ������Ʒ��ӹ��ܣ�");
		Scanner sc = new Scanner(System.in);
		
		//������Ʒ���
		System.out.println("��������Ʒ��ţ�");
		fruit.ID = sc.nextInt();
		
		//������Ʒ����
		System.out.println("��������Ʒ���֣�");
		fruit.name = sc.next();
		
		//������Ʒ����
		System.out.println("��������Ʒ���ۣ�");
		fruit.price = sc.nextDouble();
		
		array.add(fruit);
	}
	
	//��Ʒɾ������
	public static void deleteFruitItem(ArrayList<FruitItem> array){
		System.out.println("��ӭ������Ʒɾ�����ܣ�");
		System.out.println("��������Ʒ���");
		Scanner sc = new Scanner(System.in);
		
		int ID = sc.nextInt();
		for (int i = 0; i < array.size(); i++) {
			FruitItem item = array.get(i);
			if(ID==item.ID){
				array.remove(i);
			    System.out.println("ɾ���ɹ�");
			    return;
			}
		}
		System.out.println("�Բ���û�д���Ʒ");
	}
	
	//��Ʒ�޸Ĺ���
	public static void updateFruitItem(ArrayList<FruitItem> array){
		System.out.println("��ӭ������Ʒ�޸Ĺ��ܣ�");
		System.out.println("������Ҫ�޸ĵ���Ʒ��ţ�");
		Scanner sc = new Scanner(System.in);
		
		int ID = sc.nextInt();
		for (int i = 0; i < array.size(); i++) {
			FruitItem item = array.get(i);
			if(ID == item.ID){
				System.out.println("�������µ���Ʒ��ţ�");
				item.ID = sc.nextInt();
				
				System.out.println("�������µ���Ʒ����:");
				item.name = sc.next();
				
				System.out.println("�µ���Ʒ�۸�");
				item.price = sc.nextDouble();
				
				System.out.println("�޸ĳɹ�");
				return;
			}
		}
		System.out.println("��Ʒ������");
	}
}

