package com.url.project;

public class Methods {

	public  Boolean Method(String a ,String b){
		if(a.length() != b.length()){
			return false;
		}

		for(int i = 0;i < b.length();i++){
			if(a.charAt(0)==b.charAt(i)){
				//aȥ������ĸ��bȥ���д�����a�е�Ԫ�غ��ٴν��бȽ�
				return  Method(Function(a,0),Function(b,i));
			}
		}
		return  b.length() == 0;
	}
	
	//ȥ��s�е�j��Ԫ��
	public  String Function(String s,int j){
		char[] ret = new char[s.length()-1];
		int d = 0;
		for(int k = 0;k < s.length();k++){
			if(k == j)
				d = 1;
			else
				ret[k-d] = s.charAt(k);
		}
		return new String(ret);
	}
	
	public static Boolean MyThods(String a,String b){
		if(a.length()!=b.length())
			return false;
		for(int i = 0;i<a.length();i++){
			if(a.charAt(i)==a.charAt(i))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		
	}
}
