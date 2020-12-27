import Teacher.Salary;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ManagerTeacher managerTeacher = new ManagerTeacher();

    public static void main(String[] args) {
        int choice;
        System.out.println("Thông tin giáo viên");
        do {
            listSwitch();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Nhập thông tin
                    managerTeacher.addNewTeacher();
                    break;
                case 2:
                    //Hiển thị toàn bộ thông tin
                    managerTeacher.displayAll();
                    break;
                case 3:
                    //Tính lương thực lĩnh
                    managerTeacher.showTotalSalary();
                    break;
                case 4:
                    //In danh sách lương trên 8 triệu
                    managerTeacher.checkSalary();
                    break;
            }
        } while (choice != 0);
        System.exit(0);
    }

    private static void listSwitch() {
        System.out.println("1. Nhập thông tin giáo viên");
        System.out.println("2. Hiển thị toàn bộ thông tin giáo viên");
        System.out.println("3. Tính lương thực lĩnh");
        System.out.println("4. Danh sách các giáo viên có lương trên 8 triệu");
        System.out.println("0. Exit");
        System.out.print("Choice number: ");
    }

}
