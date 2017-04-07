package baithuchanh1;

import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		float a,b,c;
		int n;
		String s;
		GiaiPhuongTrinh giaiPhuongTrinh=new GiaiPhuongTrinh();
		System.out.println("Nhập Xâu s = ");
		s=sc.nextLine();
		DaoXau(s);
		
		System.out.println("Nhập Số phần tử của mảng n = ");
		n=sc.nextInt();
		TinhTong(n);
		
		System.out.println("Nhập a = ");
		a=sc.nextFloat();
		System.out.println("Nhập b = ");
		b=sc.nextFloat();
		giaiPhuongTrinh.GiaiPhuongTrinh(a, b);
		
		System.out.println("Nhập c = ");
		c=sc.nextFloat();
		giaiPhuongTrinh.GiaiPhuongTrinh(a, b, c);
		
		giaiPhuongTrinh.GiaiPhuongTrinhTSMD(a);
	}

	private static void TinhTong(int n) {
		int []a;
		int s=0;
		Scanner sc=new Scanner(System.in);
		a=new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"]=");
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			s+=a[i];
		}
		System.out.println("Tổng các phần tử của mảng là :"+s);
	}

	private static String DaoTu(String s) {
		int r=0;
		String a=" " ;
		for (int i=0; s.length()>i; i++) 
		{
			if (s.substring(i, i+1).compareTo(" ")==0) 
			{	
				
				a=s.substring(r,i)+" "+a;
				System.out.println(a);
				r=i;
			}
			
		}
		a=s.substring(r,s.length())+" "+a;
		a = a.substring(1);
		return a.trim();
	}
		
	private static void DaoXau(String s) {
		
		String sA=new StringBuffer(s).reverse().toString();
		System.out.println("Xâu ban đầu : "+s);
		System.out.println("Xâu sau khi đảo ngược : "+sA);
	}
	
}
