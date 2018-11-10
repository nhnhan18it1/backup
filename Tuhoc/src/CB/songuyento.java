package CB;

import java.util.Scanner;

public class songuyento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner key= new Scanner(System.in);int z=0;
System.out.println("nhap N=");
int n=key.nextInt();
	if (n<1) {
		System.out.println("so ban vua nhap ko phai la so nguyen to");
	}
	if (n>=1) {
		for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				z=z+1;
			}
		
	}
}
	if (z<=2) {
		System.out.println("so N la so nguyen to");
	}
	if (z>2) {
		System.out.println("so N ko phai la so nguyen to");
	}
	}
}


