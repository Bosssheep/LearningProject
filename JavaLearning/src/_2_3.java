/*2.3�������Ѻծ */


import javax.swing.JOptionPane;

public class _2_3 {

	public static void main(String[] args){
		
		double annualInterestRate;
		int numOfYears;
		double loanAmount;
		
		//����
		String  annualInterestRateString = JOptionPane.showInputDialog(null,"����������,�� 8.25","Example 2.3",JOptionPane.QUESTION_MESSAGE);
		annualInterestRate = Double.parseDouble(annualInterestRateString);
		
		double monthlyInterestRate = annualInterestRate/1200;
		
		String numOfYearsString = JOptionPane.showInputDialog(null,"��������","Example 2.3",JOptionPane.QUESTION_MESSAGE);
		numOfYears = Integer.parseInt(numOfYearsString);
		
		String loanAmountString = JOptionPane.showInputDialog(null,"��������ܶ�","Example 2.3",JOptionPane.QUESTION_MESSAGE);
		loanAmount = Double.parseDouble(loanAmountString);
		
		//����
		double monthlyPay = (loanAmount*monthlyInterestRate)/(1-(1/Math.pow(1+monthlyInterestRate, numOfYears*12)));
		double totalPay = monthlyPay*numOfYears*12;
		//���ȵ�С�������λ
		monthlyPay = (int)(monthlyPay*100)/100.0;
		totalPay = (int)(totalPay*100)/100.0;
		//���
		String output = "monthly pay: "+ monthlyPay +"  total pay: "+ totalPay;
		JOptionPane.showMessageDialog(null, output,"Example 2.3",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
}
