package entity;

import java.util.Date;

//用户实体类
/**
 * @author HYChan
 *
 */
public class Users {

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMypassword() {
		return mypassword;
	}
	public void setMypassword(String mypassword) {
		this.mypassword = mypassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String[] getFavorites() {
		return favorites;
	}
	public void setFavorites(String[] favorites) {
		this.favorites = favorites;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Users(){
		
	}
	private String username;
	private String mypassword;
	private String email;
	private String gender;
	private Date birthday; //生日
	private String[] favorites; //爱好
	private String introduce; //自我介绍
	private boolean flag; //是否接受协议
	 
	
}
