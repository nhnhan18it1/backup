package CB;

import java.util.Scanner;

public class demsoss2 {
public static void dem() {
	int a,b,c,d;
	Scanner key=new Scanner(System.in);
	System.out.println("Nhap so can xac dinh :");
	int s=key.nextInt();
	a=s/1000;
	b=(s-a*1000)/100;
	c=(s-a*1000-b*100)/10;
	d=(s-a*1000-b*100-c*10);
	switch (a) {
	case 0 :System.out.print(" "); break;
	case 1: System.out.print(" Mot Nghin"); break;
	case 2:System.out.print(" Hai Nghin"); break;
	case 3:System.out.print(" Ba Nghin"); break;
	case 4:System.out.print(" Bon Nghin"); break;
	case 5:System.out.print(" Nam Nghin"); break;
	case 6:System.out.print(" Sau Nghin"); break;
	case 7:System.out.print(" Bay Nghin"); break;
	case 8:System.out.print(" Tam Nghin"); break;
	case 9:System.out.print(" Chin Nghin"); break;
	}
	switch (b) {
	case 0 :if(a>0) System.out.print(" Khong Tram") ; break;
	case 1: System.out.print(" Mot Tram"); break;
	case 2:System.out.print(" Hai Tram"); break;
	case 3:System.out.print(" Ba Tram"); break;
	case 4:System.out.print(" Bon Tram"); break;
	case 5:System.out.print(" Nam Tram"); break;
	case 6:System.out.print(" Sau Tram"); break;
	case 7:System.out.print(" Bay Tram"); break;
	case 8:System.out.print(" Tam Tram"); break;
	case 9:System.out.print(" Chin Tram"); break;
	}
	switch (c) {
	case 0 :System.out.print(" ") ; break;
	case 1: System.out.print(" Muoi"); break;
	case 2:System.out.print(" Hai Muoi"); break;
	case 3:System.out.print(" Ba Muoi"); break;
	case 4:System.out.print(" Bon Muoi"); break;
	case 5:System.out.print(" Nam Muoi"); break;
	case 6:System.out.print(" Sau Muoi"); break;
	case 7:System.out.print(" Bay Muoi"); break;
	case 8:System.out.print(" Tam Muoi"); break;
	case 9:System.out.print(" Chin Muoi"); break;
	}
	if (c==0&&b!=0||a!=0&&c==0&&b==0) {
		switch (d) {
		case 0 :System.out.print(" ") ; break;
		case 1: System.out.print(" le Mot"); break;
		case 2:System.out.print(" le Hai "); break;
		case 3:System.out.print(" le Ba "); break;
		case 4:System.out.print(" le Bon "); break;
		case 5:System.out.print(" le Nam "); break;
		case 6:System.out.print(" le Sau "); break;
		case 7:System.out.print(" le Bay "); break;
		case 8:System.out.print(" le Tam "); break;
		case 9:System.out.print(" le Chin"); break;
		}
	}
	if (c!=0) {
		switch (d) {
		case 0 :System.out.print(" ") ; break;
		case 1: System.out.print(" Mot"); break;
		case 2:System.out.print(" Hai "); break;
		case 3:System.out.print(" Ba "); break;
		case 4:System.out.print(" Tu "); break;
		case 5:System.out.print(" Lam "); break;
		case 6:System.out.print(" Sau "); break;
		case 7:System.out.print(" Bay "); break;
		case 8:System.out.print(" Tam "); break;
		case 9:System.out.print(" Chin"); break;
		}
	}
	if (c==0&&b==0&&c==0&&a==0) {
		switch (d) {
		case 0 :System.out.print("Khong") ; break;
		case 1: System.out.print(" Mot"); break;
		case 2:System.out.print(" Hai "); break;
		case 3:System.out.print(" Ba "); break;
		case 4:System.out.print(" Bon "); break;
		case 5:System.out.print(" Nam "); break;
		case 6:System.out.print(" Sau "); break;
		case 7:System.out.print(" Bay "); break;
		case 8:System.out.print(" Tam "); break;
		case 9:System.out.print(" Chin"); break;
		}
	}
}
public static void chanle() {
	Scanner key= new Scanner(System.in);int z=0;
	System.out.println("\nnhap N=");
	int n=key.nextInt();
		if (n%2==0) {
			System.out.println("So "+n+" la so chan");
		}
		if (n%2!=0) {
			System.out.println("So "+n+" la so le");
		}
}

	public static void main(String[] args) {
			dem();	
		chanle();
	}
}
