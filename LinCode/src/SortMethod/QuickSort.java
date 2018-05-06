package SortMethod;
/*
 * ��������
 */
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[]{5,3,4,2};
		quickSort(A,0,A.length-1);
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
	}
	
	public static void quickSort(int[] arr,int low,int high){
		if(low >= high)
			return;
		
		int temp = arr[low];//����ѡȡ�Ļ���
		int i = low;
		int j = high;
		
		while(i < j){
			while(arr[j]>=temp && i < j)
				j--;
			while(arr[i]<=temp && i < j)
				i++;
			if(i < j){
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		//������λ
		arr[low] = arr[i];
		arr[i] = temp;
		
		//�ݹ�
		quickSort(arr,low,i-1);
		quickSort(arr,i+1,high);
	}
	

}
