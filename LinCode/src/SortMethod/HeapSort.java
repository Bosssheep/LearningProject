package SortMethod;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{2,4,1,3,10,9};
		HeapSortFunc(arr);
		
		for(Integer i:arr){
			System.out.print(i+" ");
		}
	}
	
	//�����󶥶�
	public static void BuildHeap(int[] arr){
		for(int i = (arr.length-1)/2;i>=0;i--){
			//�����һ����Ҷ�ӽ�㿪ʼ������ֱ�����ڵ��indexΪ0
			HoldHeap(arr,i,arr.length);
		}
	}
	
	//ά�����󶥶ѵ�����
	public static void HoldHeap(int[] arr,int i,int length){
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;

			if(right< length && arr[right]>arr[i]){
				largest = right;
			}else{
				largest = i;
			}
		
			if(left < length && arr[left]>arr[i]){
				largest = left;
			}
		
			if(largest != i){
				//exchange arr[i] with arr[largest]
				int temp = arr[i];
				arr[i] = arr[largest];
				arr[largest] = temp;
			
				//continue
				HoldHeap(arr,largest,length-1);
			}
			

	}
	
	//�����Ķ������㷨���������ǰ��ֻ���̵�лл��
	public static void HeapSortFunc(int[] arr){
		
		//1�������󶥶�
		BuildHeap(arr);
		for(int i = arr.length-1;i>=0;i--){
			//2��ÿ�ΰ������Ǹ�����ĩβ�Ǹ�������
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			//3��ά����
			HoldHeap(arr,0,i-1);
		}
		
		
		
		
	}

}
