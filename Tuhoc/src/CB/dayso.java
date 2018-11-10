package CB;

import java.util.Scanner;

public class dayso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 0;
Scanner key= new Scanner(System.in);
System.out.println(".....");
n=key.nextInt();
int [] arr=new int [n];
System.out.println("nhap gt trong mang");
for (int i = 0; i < arr.length; i++) {
arr[i]= key.nextInt();

}
		int s=0;
		for (int i = 0; i <n; i++) {
		 s=s+arr[i];
		}
		int tb=s/n;
		System.out.println("Tb cua cac so vua nhap ="+tb);
		int s1=0;
		for (int i = 0; i <n; i++) {
		if (arr[i]%2==0) {
			s1=s1+arr[i];
		}
		}
		System.out.println("Tong cac so chan trong day vua nhap ="+s1);
	}

}
