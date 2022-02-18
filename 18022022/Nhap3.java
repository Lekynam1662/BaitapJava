import java.util.Scanner;

public class Nhap3 {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a va b:");
		byte a = sc.nextByte();
		byte b = sc.nextByte();
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
