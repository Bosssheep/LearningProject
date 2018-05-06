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
	
	//构建大顶堆
	public static void BuildHeap(int[] arr){
		for(int i = (arr.length-1)/2;i>=0;i--){
			//从最后一个非叶子结点开始调整，直到根节点的index为0
			HoldHeap(arr,i,arr.length);
		}
	}
	
	//维护结点大顶堆的性质
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
	
	//真正的堆排序算法在这里！！！前面只是铺垫谢谢！
	public static void HeapSortFunc(int[] arr){
		
		//1、构建大顶堆
		BuildHeap(arr);
		for(int i = arr.length-1;i>=0;i--){
			//2、每次把最大的那个数和末尾那个数交换
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			//3、维护堆
			HoldHeap(arr,0,i-1);
		}
		
		
		
		
	}

}
