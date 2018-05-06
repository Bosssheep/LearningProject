import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weeks = sc.nextInt();
        
        if(n < 0||n>400||weeks <0 || weeks >6){
        	System.out.println(-1);
        	return;
        }
        	
        
        int[] a = new int[7];
        int week = 6;
        for (int i = 1900; i < 1900 + n; i++) {
            for (int j = 1; j <= 12; j++) {
                a[week % 7]++;
                week += get(i, j);
            }
        }
        
        System.out.print(a[weeks]);
	}
	
	 public static int get(int y, int m) {
        int i;
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
            i = 1;
        else
            i = 0;
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            return 31;
        else if (m == 2) {
            if (i == 1)
                return 29;
            else
                return 28;
        }
        return 30;
    }
}
