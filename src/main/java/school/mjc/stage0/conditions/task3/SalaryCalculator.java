package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double res;
        if (salary <= 0) {
            System.out.println("wrong input!");
            return;
        } else if (salary <= 10000) {
            res = salary * (1 - 0.15);
        } else if (salary == 15000) {
            res = 12300.0;
        } else {
            res = salary * (1 - 0.20);
        }
        System.out.println(res);
    }
}
