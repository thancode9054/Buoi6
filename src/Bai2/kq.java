package Bai2;

import java.util.Scanner;

public class kq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv = new SinhVien();

        System.out.println("input ma sinh vien: ");
        int maSV = sc.nextInt();
        sc.nextLine();
        sv.setMaSV(maSV);

        System.out.println("input ho va ten sinh vien: ");
        String hoTen = sc.nextLine();
        sv.setHoTen(hoTen);

        System.out.println("input diem ly thuyet: ");
        float diemLT = sc.nextFloat();
        sv.setDiemLT(diemLT);

        System.out.println("input diem thuc hanh vao");
        float diemTH = sc.nextFloat();
        sv.setDiemTH(diemTH);
        System.out.printf("%-5s%-30s%-10s%-10s%-10s\n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println(sv.toString());
    }
}
