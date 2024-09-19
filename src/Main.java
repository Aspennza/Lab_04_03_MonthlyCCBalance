public class Main
{
    public static void main(String[] args)
    {
        final double INTEREST_RATE = 0.17;
        double creditCardBalance = 5000.00;
        double firstMonthInt = 0.00;
        double secondMonthInt = 0.00;

        firstMonthInt = creditCardBalance * INTEREST_RATE;

        System.out.println("The interest due on your credit card balance in the first month is $" + firstMonthInt + ".");

        secondMonthInt = (creditCardBalance + firstMonthInt) * INTEREST_RATE;

        System.out.println("The interest due on your credit card balance in the second month is $" + secondMonthInt + ".");
    }
}