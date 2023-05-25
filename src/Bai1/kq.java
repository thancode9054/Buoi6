package Bai1;

import java.util.Scanner;

public class kq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HinhChuNhat hcn = new HinhChuNhat();
        System.out.println("input height in : ");
        int chieuDai = input.nextInt();
        hcn.setChieuDai(chieuDai);
        System.out.println("input width in: ");
        int chieuRong = input.nextInt();
        hcn.setChieuRong(chieuRong);
        System.out.println(hcn.toString());
        input.close();
    }
}