package CB;

import java.util.Scanner;

public class laisuat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double a,b,c;		
Scanner key= new Scanner(System.in);
System.out.println("Nhap so tien");
a= key.nextDouble();
System.out.println("Nhap so thang ban muon gui");
b=key.nextDouble();
if (b<6) {
	c=(a*106)/100;
	System.out.println("Tong tien goc lan lai la"+c);
}
if (b<12&&b>=6)
{
	c=(a*107)/100;
			System.out.println("Tong tien la"+c);
}
if(b>12){
	c=(a*108)/100;
	System.out.println("Tong so tien la"+c);
}
	}

}
