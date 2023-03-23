package Bai1;

public class Xengoaithanh extends Xe {
	
	String Noiden;
	int Songaydiduoc;
	float Doanhthu;
	public void Xengoaithanh() {
		
	}
	public void Xengoaithanh(int Songaydiduoc,String Noiden,float Doanhthu) {
		this.Noiden=Noiden;
		this.Songaydiduoc=Songaydiduoc;
		this.Doanhthu=Doanhthu;
	}
	public String getNoiden() {
		return Noiden;	
	}
	public void setNoiden(String Noiden) {
		this.Noiden=Noiden;
	}
	public int getSongaydiduoc() {
		return Songaydiduoc;	
	}
	public void setSongaydiduoc(int Songaydiduoc) {
		this.Songaydiduoc=Songaydiduoc;
	}
	@Override
	public float getDoanhthu() {
		return (getSongaydiduoc()*100000);	
	}
	@Override
	public void setDoanhthu(float Doanhthu) {
		this.Doanhthu=Doanhthu;
	}
	@Override
	public void xuat() {
		System.out.println("Mã số chuyến:"+getMSchuyen()+"||Tên tài xế:"+getTentai()+"||Số xe:"+getSoxe()+"Nơi đến:"+getNoiden()+"Số ngay đi dược:"+getSongaydiduoc()+"||Doanh thu"+getDoanhthu());
	}
	@Override
	public void nhap() {
		System.out.println("Nhập mã số chuyến: ");
		MSchuyen=sc.nextLine();
		System.out.println("Nhập tên tài xế: ");
		Tentai=sc.nextLine();
		System.out.println("Nhập số xe: ");
		Soxe=sc.nextLine();
		System.out.println("Nhập nơi đến: ");
		Noiden=sc.nextLine();
		System.out.println("Nhập số ngay đi được: ");
		Songaydiduoc=sc.nextInt();
	}
}