package CB;

import java.util.Scanner;

public class bactg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
Scanner i= new Scanner(System.in);
System.out.println("nhap canh a=");
a= i.nextDouble();
System.out.println("nhap canh b=");
b=i.nextDouble();
System.out.println("nhap canh c=");
c=i.nextDouble();
if (a+b<=c||b+c<=a||c+a<=b) {
	System.out.println("Ba canh ko phai 3 canh cua tam giac");
}
if (a+b>c||a+c>b||c+b>a) {
	if (a==b||a==c||b==c) {
		if (a/b==Math.sqrt(2)/2||a/c==Math.sqrt(2)/2||b/a==Math.sqrt(2)/2||
				b/c==Math.sqrt(2)/2||c/a==Math.sqrt(2)/2||c/b==Math.sqrt(2)/2) {
			System.out.println("tam giac la tam giac vuong can");
		}
		else {
			System.out.println("Tam giac la tam giac can");
		}		
	}
	if (a==b&&a==c&&b==c) {
		System.out.println("tam giac la tam giac deu");
	}
	if (Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))==c||
			Math.sqrt(Math.pow(b, 2)+Math.pow(c, 2))==a||
			Math.sqrt(Math.pow(c, 2)+Math.pow(a, 2))==b) {
		System.out.println("Tam giac la tam giac vuong");
	}
	else {
		System.out.println("Tam giac la tam giac thuong ");
	}
}

	}

}
