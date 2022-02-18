import java.util.Scanner;
public class DienTichChuViHT {
	    public static double ChuVi(double r){
	        return r * 2 * 3.14;
	    }
	    public static void main(String[] args) {
	    	try {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhap ban kinh hinh tron: ");
	        double  r = scanner.nextDouble();
	        System.out.println("Chu vi hinh tron la: "+ ChuVi(r));
	    	}catch (Exception e) {
	    		System.out.print("Nhap sai du lieu.");
	    	}

	    }
}
