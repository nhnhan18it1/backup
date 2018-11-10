package CB;

import java.util.Scanner;

public class mode7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner key= new Scanner(System.in);
double a,b,c,d,e,m,n,p,q,r,x,ct,cd,z,i,s;
System.out.println("ham co dang aX^m+bX^n+cX^p+dX^q+eX^r");

System.out.println("nhap GT dau");
cd=key.nextDouble();
System.out.println("nhap GT cuôi");
ct= key.nextDouble();
System.out.println("nhap buoc nhay");
z=key.nextDouble();
System.out.println("nhap cac gt trong ham");
System.out.print("a=");
a=key.nextDouble();
System.out.print("m=");
m=key.nextDouble();
System.out.print("b=");
b=key.nextDouble();
System.out.print("n=");
n=key.nextDouble();
System.out.print("c=");
c=key.nextDouble();
System.out.print("p=");
p=key.nextDouble();
System.out.print("d=");
d=key.nextDouble();
System.out.print("q=");
q=key.nextDouble();
System.out.print("e=");
e=key.nextDouble();
System.out.print("r=");
r=key.nextDouble();
 if (ct<cd) {
	System.out.println("nhap sai so lieu");
}
 if (ct>cd) {
	for (i = cd; i <= ct; i=i+z) {
		s=a*Math.pow(i, m)+b*Math.pow(i, n)+c*Math.pow(i, p)+d*Math.pow(i, q)+e*Math.pow(i, r);
	System.out.println("x="+i+" F(x)="+s);
	}
}
	}
}
