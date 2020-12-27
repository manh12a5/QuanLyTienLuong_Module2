import Teacher.Salary;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class ManagerTeacher {

    //Danh sách thuộc tính
    List<Salary> arrTeacher = new LinkedList<>();

    //Danh sách phương thức
    public void addNewTeacher() {
        Salary salary = new Salary();
        salary.addNewSalary();
        arrTeacher.add(salary);
    }

    public void displayAll() {
        for (int i = 0; i < arrTeacher.size(); i++) {
            System.out.println(arrTeacher.get(i));
            System.out.print("\n");
        }
    }

    public void checkSalary() {
        int count = 0;
        for (int i = 0; i < arrTeacher.size(); i++) {
            if (arrTeacher.get(i).getTotalSalary() >= 8000000) {
                System.out.println(arrTeacher.get(i));
                System.out.print("\n");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy");
            System.out.print("\n");
        }
    }

    public void showTotalSalary() {
        Scanner scanner = new Scanner(System.in);
        Salary salary = new Salary();
        System.out.print("Nhập tên giáo viên cần tính tổng tiền thực lĩnh: ");
        String searchName = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < arrTeacher.size(); i++) {
            if (arrTeacher.get(i).getName().contains(searchName)) {
                System.out.println("Tổng tiền của giáo viên " + searchName + " là: " + arrTeacher.get(i).getTotalSalary());
                System.out.print("\n");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy");
            System.out.print("\n");
        }
    }

}
