package com.url.project;

public class Methods {

	public  Boolean Method(String a ,String b){
		if(a.length() != b.length()){
			return false;
		}

		for(int i = 0;i < b.length();i++){
			if(a.charAt(0)==b.charAt(i)){
				//a去掉首字母，b去掉中存在于a中的元素后，再次进行比较
				return  Method(Function(a,0),Function(b,i));
			}
		}
		return  b.length() == 0;
	}
	
	//去掉s中第j个元素
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
