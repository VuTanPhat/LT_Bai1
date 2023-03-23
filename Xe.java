package Bai1;

import java.util.Scanner;

public class Xe 
{
	String MSchuyen;
	String Tentai;
	String Soxe;
	float Doanhthu;
	Scanner sc=new Scanner(System.in);
	public void Xe() {
		
	}
	public Xe() 
	{
		this.MSchuyen=MSchuyen;
		this.Tentai=Tentai;
		this.Soxe=Soxe;
		this.Doanhthu=Doanhthu;
	}
	public String getMSchuyen() {
		return this.MSchuyen;
	}
	public void setMSchuyen(String MSchuyen) {
		this.MSchuyen=MSchuyen;
	}
	public String getTentai() {
		return this.Tentai;
	}
	public void setTentai(String Tentai) {
		this.Tentai=Tentai;
	}
	public String getSoxe() {
		return this.Soxe;
	}
	public void setSoxe(String Soxe) {
		this.Soxe=Soxe;
	}
	public float getDoanhthu() {
		return this.Doanhthu;
	}
	public void setDoanhthu(float Doanhthu) {
		this.Doanhthu=Doanhthu;
	}
	public void nhap() {
		System.out.println("Nhập mã số chuyến: ");
		MSchuyen=sc.nextLine();
		System.out.println("Nhập tên tài xế: ");
		Tentai=sc.nextLine();
		System.out.println("Nhập số xe: ");
		Soxe=sc.nextLine();
	}
	public void xuat() {
		System.out.println("Mã số chuyến:"+getMSchuyen()+"||Tên tài xế:"+getTentai()+"||Số xe:"+getSoxe()+"||Doanh thu"+getDoanhthu());
		
	}
}
