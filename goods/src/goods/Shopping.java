/*
 	实现库存管理案例；
 	1、存储商品信息，添加
 	2、查看库存清单，遍历
 */

package goods;
import java.util.ArrayList;

public class Shopping {
	public static void main(String[] args){
		ArrayList<Goods> GoodList = new ArrayList<Goods>();
		
		addGoods(GoodList);
	}
	
	/*
	 	定义方法
	 */
	
	public static void addGoods(ArrayList<Goods> array){
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		
		g1.brand = "MacBook";
		g1.size = 13.3;
		g1.price = 9999;
		g1.count = 3;

		g2.brand = "ThinkPad";
		g2.size = 15.6;
		g2.price = 5600;
		g2.count = 10;
		
		array.add(g1);
		array.add(g2);		
	}
	
	
}
