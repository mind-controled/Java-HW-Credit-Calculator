public class CreditPaymentService {
    public int calculate(int term, int amountOfCredit) {
        double percentRate = 9.99;
        double monthlyPercentRate = percentRate / 12 / 100;
        double firstPart = Math.pow(1 + monthlyPercentRate , term);
        double secondPart = firstPart - 1;
        double thirdPart = monthlyPercentRate * firstPart / secondPart;
        int monthlyPayment = (int) (thirdPart * amountOfCredit);

        return monthlyPayment;
    }
}