package com.immoc.template;

public class RefreshDrinkTest {

	public static void main(String[] args) {
		
		System.out.println("我想要一杯咖啡");
		
		RefreshDrink coffee = new Coffee();
		coffee.prepareDrinkTemplate();
		
		System.out.println("主人，您的咖啡好了~");
		
		System.out.println("------------------");
		
		System.out.println("制备一杯茶");
		RefreshDrink tea = new Tea();
		tea.prepareDrinkTemplate();
		System.out.println("一杯茶已好，请享用");
	}
}
