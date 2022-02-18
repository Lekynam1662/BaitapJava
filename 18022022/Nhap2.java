import java.util.Scanner;

public class Nhap2 {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a va b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		}catch (Exception e) {
		System.out.print("Nhap sai du lieu.");
	}
	
	}
}
