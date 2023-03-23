package Bai1;

public class Xenoithanh extends Xe {
	
	int Sochuyen;
	float Sokmdiduoc;
	float Doanhthu;
	public void Xenoithanh() {
		
	}
	public void Xenoithanh(int Sochuyen,float Sokmdiduoc,float Doanhthu) {
		this.Sochuyen=Sochuyen;
		this.Sokmdiduoc=Sokmdiduoc;
		this.Doanhthu=Doanhthu;
	}
	public int getSochuyen() {
		return Sochuyen;	
	}
	public void setSochuyen(int Sochuyen) {
		this.Sochuyen=Sochuyen;
	}
	public float getSokmdiduoc() {
		return Sokmdiduoc;	
	}
	public void setSokmdiduoc(float Sokmdiduoc) {
		this.Sochuyen=Sochuyen;
	}
	@Override
	public float getDoanhthu() {
		return 3000;	
	}
	@Override
	public void setDoanhthu(float Doanhthu) {
		this.Doanhthu=Doanhthu;
	}
	@Override
	public void xuat() {
		System.out.println("Mã số chuyến:"+getMSchuyen()+"||Tên tài xế:"+getTentai()+"||Số xe:"+getSoxe()+"Số chuyến:"+getSochuyen()+"Số km đi dược:"+getSokmdiduoc()+"||Doanh thu"+getDoanhthu());
	}
	@Override
	public void nhap() {
		System.out.println("Nhập mã số chuyến: ");
		MSchuyen=sc.nextLine();
		System.out.println("Nhập tên tài xế: ");
		Tentai=sc.nextLine();
		System.out.println("Nhập số xe: ");
		Soxe=sc.nextLine();
		System.out.println("Nhập số chuyến: ");
		Sochuyen=sc.nextInt();
		System.out.println("Nhập số km đi được: ");
		Sokmdiduoc=sc.nextFloat();
	}
}
