package CB;

import java.util.Scanner;

public class b7_sapxeptangdan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int [5];
		Scanner key= new Scanner(System.in);
		System.out.println("nhap gt trong mang");
		for (int i = 0; i < arr.length; i++) {
		arr[i]= key.nextInt();

		}
		for (int i = 0; i < arr.length-1; i++) {
			int p = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					arr[i]=arr[j];
					arr[j]=p;
					p=arr[i];
				}
			}
		}
		System.out.println("gt mang dc sap xep tawnh dan la");
			for (int x:arr) {
				System.out.println(x);
			}

	}

}
