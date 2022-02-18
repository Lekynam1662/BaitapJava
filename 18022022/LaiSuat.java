import java.util.Scanner;
import java.util.InputMismatchException;
public class LaiSuat {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tien");
		double loanAmount = sc.nextDouble();
		System.out.print("Nhap lai suat");
		double monthlyIntersetRate = sc.nextDouble();
		System.out.print("Nhap so nam");
		double mumberofyear=sc.nextDouble();
		double monthlypayment=(loanAmount * monthlyIntersetRate)/(1-1/(Math.pow(1+monthlyIntersetRate, mumberofyear)));
		System.out.print(monthlypayment);
		}catch (Exception e) {
	    	System.out.print("Nhap sai du lieu.");}
			}
}

		