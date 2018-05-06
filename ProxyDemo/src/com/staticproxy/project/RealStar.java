package com.staticproxy.project;
/**
 * 真实角色中其实只做了一个唱歌的操作
 * 这是真实角色真正的业务逻辑部分
 * @author HYChan
 *
 */
public class RealStar implements Star {

	private String starName;
	public RealStar(String name){
		starName = name;
	}
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }
    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }
    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }
    @Override
    public void sing() {
        System.out.println(starName+"唱歌");//真实角色的操作：真正的业务逻辑
    }
    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }

}
