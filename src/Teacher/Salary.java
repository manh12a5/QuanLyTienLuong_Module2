package Teacher;

import java.util.Scanner;

public class Salary extends Information {
    private double salary;
    private double reward;
    private double penalty;
    private double totalSalary;

    //Danh sách phương thức
    public Salary() {
    }

    public Salary(double salary, double reward, double penalty) {
        this.salary = salary;
        this.reward = reward;
        this.penalty = penalty;
    }

    public Salary(String name, String date, String country, double salary, double reward, double penalty) {
        super(name, date, country);
        this.salary = salary;
        this.reward = reward;
        this.penalty = penalty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getTotalSalary() {
        return salary + reward - penalty;
    }

    public void addNewSalary() {
        super.addNewInfo();
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        do {
            System.out.println("Nhập lương cứng: ");
            salary = scanner2.nextDouble();
        } while (salary < 0);
        do {
            System.out.println("Nhập thưởng: ");
            reward = scanner3.nextDouble();
        } while (reward < 0);
        do {
            System.out.println("Nhập phạt: ");
            penalty = scanner2.nextDouble();
        } while (penalty < 0);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Lương: " + salary + "\n" +
                "Thưởng: " + reward + "\n" +
                "Phạt: " + penalty;
    }

}
