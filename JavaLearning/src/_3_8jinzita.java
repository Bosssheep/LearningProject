
public class _3_8jinzita {

	public static void main(String[] args){
		
		final int NUM_OF_LINES = 5;
		
		for(int row=1;row<=NUM_OF_LINES;row++){
			
			//打印每行首空白
			for(int column=1;column<=NUM_OF_LINES-row;column++)
				System.out.print(" ");
			//打印一半数字
			for(int num=row;num>=1;row--)
				System.out.print(num);
			//打印剩下一半
			for(int num=2;num<=row;num++)
				System.out.print(num);
			//换行
			System.out.println();
		}
	}
}
