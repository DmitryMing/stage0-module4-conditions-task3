package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        // Check if the month number is valid
        if (month >= 1 && month <= 12) {
            // Determine the number of days in the month
            int days;
            switch (month) {
                case 2:
                    days = 28;  // Assuming non-leap year
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    days = 31;
                    break;
            }
            // Print the number of days
            System.out.println(days);
        } else {
            // Invalid month number
            System.out.println("wrong number!");
        }
    }
}
