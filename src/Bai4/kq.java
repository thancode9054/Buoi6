package Bai4;

public class kq {
    public static void main(String[] args) {
        Account account1 = new Account(123456, "Đồng văn Đạt");
        Account account2 = new Account(654321, "Đồng Văn Kế", 1000000);

        System.out.println(account1.toString());
        System.out.println(account2.toString());

        account1.deposit(50000);
        account2.withdraw(200000, 50000);
        account1.transfer(account2, 50000);

        account1.mature();
        account2.mature();

        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
