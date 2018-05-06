package com.immoc.template;
/**
 * 具体子类，实现茶的具体实现
 * @author HYChan
 *
 */
public class Tea extends RefreshDrink {

	@Override
	protected void brew() {
		System.out.println("用80度的热水浸泡茶叶5分钟");

	}

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬");

	}
	
	/*
	 * 子类通过覆盖的形式，选择钩子函数
	 * @see com.immoc.template.RefreshDrink#isCustomerWantsCondiments()
	 */
	protected boolean isCustomerWantsCondiments(){
		return false;
	}

}
