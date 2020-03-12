public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountOfCredit = 1_000_000;

        int monthlyPaymentOneYearCredit = service.calculate(12 , amountOfCredit);
        System.out.println(monthlyPaymentOneYearCredit);

        int monthlyPaymentTwoYearsCredit = service.calculate(24 , amountOfCredit);
        System.out.println(monthlyPaymentTwoYearsCredit);

        int monthlyPaymentThreeYearsCredit = service.calculate(36 , amountOfCredit);
        System.out.println(monthlyPaymentThreeYearsCredit);
    }
}