import java.util.ArrayList;
import java.util.Scanner;

/*
 *   超市管理系统主类
 *   实现：
 *   	1、商品数据化初始化
 *      2、用户菜单选择
 *      3、根据选择执行不同功能
 *          3.1 Read    查看商品
 *      	3.2 Create：添加商品
 *      	3.3 Delete  删除商品
 *      	3.4 Update  更新商品
 *   
 *   定义方法实现
 */
public class Shopping {

	public static void main(String[] args) {
	
		//创建ArrayList集合，存储商品集合
		ArrayList<FruitItem> array = new ArrayList<FruitItem>();
		//初始化商品集合
		init(array);
		
		while(true){
			int choose = mainMenu();
			switch(choose){
			case 1:
				//货物清单
				showFruitList(array);
				break;
			case 2:
				//添加货物
				addFruitItem(array);
				break;
			case 3:
				//删除货物
				deleteFruitItem(array);
				break;
			case 4:
				//修改货物
				updateFruitItem(array);
				break;
			default:
				System.out.println("输入有误！");
				break;
			}
			
		}
	}


	//定义方法，实现商品初始化
	public static void init(ArrayList<FruitItem> array){
		//创建出多个FruitItem类型
		FruitItem fruit1 = new FruitItem();
		fruit1.ID = 9527;
		fruit1.name = "西凤酒";
		fruit1.price = 12.7;

		FruitItem fruit2 = new FruitItem();
		fruit2.ID = 9528;
		fruit2.name = "羊肉泡馍";
		fruit2.price = 20;
		
		FruitItem fruit3 = new FruitItem();
		fruit3.ID = 9529;
		fruit3.name = "胡辣汤";
		fruit3.price = 6.5;
			
		array.add(fruit1);
		array.add(fruit2);
		array.add(fruit3);
	}
	
	//定义方法，实现主菜单，提示用户选择功能,并返回用户选择序号
	public static int mainMenu(){
		System.out.println();
		System.out.println("==============欢迎IT超市==============");
		System.out.println("1、货物清单   2、添加货物   3、删除货物  4、修改货物  5、退出");
		System.out.println("请您输入要操作的功能序号：");
		
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	//显示货物清单功能
	public static void showFruitList(ArrayList<FruitItem> array){
		System.out.println();
		System.out.println("==============商品库存清单==============");
		System.out.println("编号      商品名称    单价");
		//遍历集合
		for (int i = 0; i < array.size(); i++) {
			//通过get方法，获取每个变量
			FruitItem item = array.get(i);
			System.out.println(item.ID+"    "+item.name+"    "+item.price);
		}
	}
	
	//添加货物功能
	public static void addFruitItem(ArrayList<FruitItem> array){
		FruitItem fruit = new FruitItem();
		
		System.out.println("欢迎进入商品添加功能！");
		Scanner sc = new Scanner(System.in);
		
		//输入商品编号
		System.out.println("请输入商品编号：");
		fruit.ID = sc.nextInt();
		
		//输入商品名字
		System.out.println("请输入商品名字：");
		fruit.name = sc.next();
		
		//输入商品单价
		System.out.println("请输入商品单价：");
		fruit.price = sc.nextDouble();
		
		array.add(fruit);
	}
	
	//商品删除功能
	public static void deleteFruitItem(ArrayList<FruitItem> array){
		System.out.println("欢迎进入商品删除功能！");
		System.out.println("请输入商品编号");
		Scanner sc = new Scanner(System.in);
		
		int ID = sc.nextInt();
		for (int i = 0; i < array.size(); i++) {
			FruitItem item = array.get(i);
			if(ID==item.ID){
				array.remove(i);
			    System.out.println("删除成功");
			    return;
			}
		}
		System.out.println("对不起，没有此商品");
	}
	
	//商品修改功能
	public static void updateFruitItem(ArrayList<FruitItem> array){
		System.out.println("欢迎进入商品修改功能！");
		System.out.println("请输入要修改的商品编号：");
		Scanner sc = new Scanner(System.in);
		
		int ID = sc.nextInt();
		for (int i = 0; i < array.size(); i++) {
			FruitItem item = array.get(i);
			if(ID == item.ID){
				System.out.println("请输入新的商品编号：");
				item.ID = sc.nextInt();
				
				System.out.println("请输入新的商品名字:");
				item.name = sc.next();
				
				System.out.println("新的商品价格：");
				item.price = sc.nextDouble();
				
				System.out.println("修改成功");
				return;
			}
		}
		System.out.println("商品不存在");
	}
}

