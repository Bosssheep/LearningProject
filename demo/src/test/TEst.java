package test;
import java.util.ArrayList;
import java.util.Scanner;
public class TEst {
	
	
		/*������������������ʵ����ĿҪ��Ĺ���
		��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ 
		******************************��ʼд����******************************/
		static int[] solve(int[] a) {
			int[] res = new int[a.length];
			int i = 0;
			for(;i < a.length-1;i++){
				res[i] = a[i]+a[i+1];
			}
			res[i] = a[i];
			return res;
	    }
		/******************************����д����******************************/


		    public static void main(String[] args){
		        Scanner in = new Scanner(System.in);
		        int[] res;
		            
		        int _a_size = 0;
		        _a_size = Integer.parseInt(in.nextLine().trim());
		        int[] _a = new int[_a_size];
		        int _a_item;
		        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
		            _a_item = Integer.parseInt(in.nextLine().trim());
		            _a[_a_i] = _a_item;
		        }
		  
		        res = solve(_a);
		        for(int res_i=0; res_i < res.length; res_i++) {
		            System.out.println(String.valueOf(res[res_i]));
		        }

		    }
     
}
