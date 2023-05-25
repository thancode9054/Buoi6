package Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        Vehicle[] vc = new Vehicle[3];

        while (true) {
            System.out.println("-------- Sở Giao Thông --------");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.print("Vui lòng chọn công việc (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự newline sau khi đọc số

            switch (choice) {
                case 1:
                    for (int i = 0; i < vc.length; i++) {
                        System.out.println(vc.length);
                        System.out.println("\nNhập thông tin cho xe " + (i + 1));
                        System.out.print("Tên chủ xe: ");
                        String name = scanner.nextLine();
                        System.out.print("Giá xe: ");
                        double price = scanner.nextDouble();
                        System.out.print("Dung tích xy lanh: ");
                        int cylinderCapacity = scanner.nextInt();
                        scanner.nextLine(); 

                        vc[i] = new Vehicle(name, price, cylinderCapacity);
                    }
                    break;
                case 2:
                    System.out.println("\nBảng kê khai tiền thuế trước bạ của các xe:");
                    System.out.println("------------------------------------------------");
                    System.out.println("|    Tên chủ xe    |  Giá xe  |  Thuế trước bạ  |");
                    System.out.println("------------------------------------------------");
                    for (Vehicle vehicle : vc) {
                        if (vehicle != null) {
                            double tax = vehicle.taxCollection();
                            System.out.printf("|  %-12s| %,9.2f |    %,11.2f  |\n", vehicle.getName(),
                                    vehicle.getPrice(), tax);
                        }
                    }
                    System.out.println("------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}