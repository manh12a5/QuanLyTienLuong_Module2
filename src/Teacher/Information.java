package Teacher;

import java.util.Scanner;

public class Information {

    //Danh sách thuộc tính
    private String name;
    private String date;
    private String country;

    //Danh sách phương thức
    public Information() {
    }

    public Information(String name, String date, String country) {
        this.name = name;
        this.date = date;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addNewInfo() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        name = scanner.nextLine();
        do {
            System.out.println("Nhập ngày sinh (dd/MM/yyyy): ");
            date = scanner1.nextLine();
        } while (date.length() < 8);
        System.out.println("Nhập quê quán: ");
        country = scanner.nextLine();
    }

    @Override
    public String toString() {
        return " ---- Thông tin ---- " + "\n" +
                "Họ Tên: " + name + "\n" +
                "Ngày sinh: " + date + "\n" +
                "Quê quán: " + country + "\n";
    }

}
