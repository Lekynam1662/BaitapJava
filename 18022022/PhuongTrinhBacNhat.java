import java.util.Scanner;
public class PhuongTrinhBacNhat {
	public static void main(String[]args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		float a= sc.nextFloat();
		System.out.print("Nhap b: ");
		
		float b= sc.nextFloat();
		
	if (a==0 && b!=0) {
			System.out.print("Phuong Trinh Vo Nghiem");
		}else if (a==0 && b==0) {
			System.out.print("Phuong Trinh Vo So Nghiem");
	}else {
			System.out.print("Phuong Trinh Co Nghiem La:"+(-b/a));
	}
	}catch (Exception e) {
		System.out.print("Nhap sai du lieu.");
	}
	}
}
