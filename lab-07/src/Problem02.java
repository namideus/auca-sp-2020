import java.util.Scanner;

public class Problem02 {

    private static final int[] monthDays = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Month: ");
            String month = scan.next();

            if(month.equals("^Z"))
                System.exit(2);

            System.out.print("Year: ");
            int year = scan.nextInt();

            System.out.println("Days: " + getNumberOfDays(Integer.parseInt(month), year));
        }
    }

    // Is leap year
    private static boolean isLeapYear(int year)
    {
        return year%4==0 && year%100>0 || year%400==0;
    }

    // Get the number of days in a particular month
    private static int getNumberOfDays(int month, int year)
    {
        // February and leap year?
        return (month==2 && isLeapYear(year)) ? monthDays[month-1]+1 : monthDays[month-1];
    }
}

















//        if(month<1 || month>12)
//        {
//            System.out.println(month + " is not a correct month!");
//            System.exit(2);
//        }
//        if(year<1)
//        {
//            System.out.println(year + " is not a correct year!");
//            System.exit(2);
//        }
