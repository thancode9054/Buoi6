package Bai2;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
        maSV = 0;
        hoTen = "";
        diemLT = 0.0f;
        diemTH = 0.0f;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float diemTrungBinh() {
        return (diemLT + diemTH) / 2;
    }

    public String toString() {
        return String.format("%-5d%-30s%10.2f%10.2f%10.2f", maSV, hoTen, diemLT, diemTH,diemTrungBinh());
    }

}