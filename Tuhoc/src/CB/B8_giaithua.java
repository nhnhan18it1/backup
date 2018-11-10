package CB;

import java.util.Scanner;

public class B8_giaithua {
public static long fact(int k) {
	int z=1;
	for (int i = 2; i <=k; i++) 
		z=z*i;
	
	return z;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0,z1=1,z2=0;
		Scanner key= new Scanner(System.in);
		n=key.nextInt();
		for (int j = 1; j <=n; j++) {
			for (int k = 1; k <= j; k++) {
				z1=z1*k;
			}
			z2=z2+z1;
			z1=1;
		}
		System.out.println("KQ="+z2);
		
		//***************
	long s=0;
		System.out.println("nhap so phan tu cua ham");
		
		
		int [] arr=new int [n];
		System.out.println("nhap gt trong mang");
		for (int i = 0; i < arr.length; i++) {
			arr[i]= key.nextInt();}
for (int i = 0; i <=n-1; i++) {
	 s=s+fact(arr[i]);
}System.out.println(s);
		}
	}


