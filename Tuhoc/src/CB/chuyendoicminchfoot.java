package CB;

import java.util.Scanner;

public class chuyendoicminchfoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		int n;
Scanner i=new Scanner(System.in);
System.out.println("Nhap chieu dai can chuyen(cm)");
a=i.nextDouble();
System.out.println("chon dang chuyen 1-cm-->inch||2-cm-->foot");
n=i.nextInt();

switch (n) {
case 1:
	c=a*(1/(2.54));
	break;
case 2:
	c=a*(1/(12*2.54));
	System.out.println("Ket qua chuyen doi la"+c);
	break;
default:
	System.out.println("Ban nhap sai cu phap");
	break;
}
	}

}
