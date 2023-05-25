package Bai1;

public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat() {

    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int dienTich() {
        return chieuDai * chieuRong;
    }

    public int chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public String toString() {
        return "Height is: " + chieuDai + "\nWidth is: " + chieuRong + "\nArea is: " + dienTich() + "\nPerimeter: " + chuVi();
    }

}
