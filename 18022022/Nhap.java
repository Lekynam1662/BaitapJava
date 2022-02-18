import java.util.Scanner;

public class Nhap {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a va b:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
			
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		}catch (Exception e) {
	    	System.out.print("Nhap sai du lieu.");}
			}
		}
