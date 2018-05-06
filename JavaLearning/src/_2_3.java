/*2.3、计算抵押债 */


import javax.swing.JOptionPane;

public class _2_3 {

	public static void main(String[] args){
		
		double annualInterestRate;
		int numOfYears;
		double loanAmount;
		
		//输入
		String  annualInterestRateString = JOptionPane.showInputDialog(null,"输入年利率,如 8.25","Example 2.3",JOptionPane.QUESTION_MESSAGE);
		annualInterestRate = Double.parseDouble(annualInterestRateString);
		
		double monthlyInterestRate = annualInterestRate/1200;
		
		String numOfYearsString = JOptionPane.showInputDialog(null,"输入年数","Example 2.3",JOptionPane.QUESTION_MESSAGE);
		numOfYears = Integer.parseInt(numOfYearsString);
		
		String loanAmountString = JOptionPane.showInputDialog(null,"输入贷款总额","Example 2.3",JOptionPane.QUESTION_MESSAGE);
		loanAmount = Double.parseDouble(loanAmountString);
		
		//计算
		double monthlyPay = (loanAmount*monthlyInterestRate)/(1-(1/Math.pow(1+monthlyInterestRate, numOfYears*12)));
		double totalPay = monthlyPay*numOfYears*12;
		//精度到小数点后两位
		monthlyPay = (int)(monthlyPay*100)/100.0;
		totalPay = (int)(totalPay*100)/100.0;
		//输出
		String output = "monthly pay: "+ monthlyPay +"  total pay: "+ totalPay;
		JOptionPane.showMessageDialog(null, output,"Example 2.3",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
