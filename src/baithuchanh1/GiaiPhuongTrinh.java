package baithuchanh1;

public class GiaiPhuongTrinh {
	public  void GiaiPhuongTrinh(float a,float b) {
		float x=0;
		if (a!=0) {
			x+=-b/a;
		}
		else {
			System.out.println("đây không phải là phương trình bậc nhất ");
		}
		System.out.println("kết quả phương trình bậc nhất ="+x);
		
	}
	public  void GiaiPhuongTrinh(float a,float b,float c)
	{
		float x;
		float denta;
		Double x1,x2;
		denta=b*b-(4*a*c);
		if (a!=0) {
			if (denta>0) {
				System.out.println("Phương trình có hai nghiệm phân biệt ");
				x1=(-b-Math.sqrt(denta))/2*a;
				x2=(-b+Math.sqrt(denta))/2*a;
				System.out.println("x1 = "+x1); 
				System.out.println("x2 = "+x2);
			}
			if (denta==0) {
				System.out.print("phuong trinh co nghiem kep "); 
				x=-b/(2*a); 
				System.out.println("x=x1=x2= "+x);
			}
			if (denta<0) {
				System.out.println("Phương trình vô nghiệm");
				
			}
			
		} else {
			System.out.println("Đây không phải phương trình bậc 2");
		}
		
	}
	public  void GiaiPhuongTrinhTSMD(float ...a){
		if (a.length==2) {
			GiaiPhuongTrinh(a[0],a[1]);
			
		}
		if (a.length==3) {
			GiaiPhuongTrinh(a[0], a[1], a[2]);
		}
		
	}
}
