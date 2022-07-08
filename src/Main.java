public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditAmount = 1000000; // сумма кредита
        int creditTerm = 1; // срок кредита (год)
        double interestRate = 9.99; // годовая процентная ставка

        double payment = service.calculate(creditAmount, creditTerm, interestRate); // аннуитетный платеж
        String annuityPay = String.format("%.0f",payment); // аннуитетный платеж (окр.)
        System.out.println();
        System.out.println("Хочешь взять " + creditAmount + " руб. На " + creditTerm + " год(а) по кредитной ставке " + interestRate + " % годовых?!");
        System.out.println("Тогда каждый месяц будешь заносить по " + annuityPay + " руб. Иначе... Ну ты сам знаешь...");

        double payment1 = service.calculate(creditAmount, (creditTerm+1), interestRate); // аннуитетный платеж
        String annuityPay1 = String.format("%.0f",payment1); // аннуитетный платеж (окр.)
        System.out.println();
        System.out.println("Хочешь взять " + creditAmount + " руб. На " + (creditTerm+1) + " год(а) по кредитной ставке " + interestRate + " % годовых?!");
        System.out.println("Тогда каждый месяц будешь заносить по " + annuityPay1 + " руб. Иначе... Ну ты сам знаешь...");

        double payment2 = service.calculate(creditAmount, (creditTerm+2), interestRate); // аннуитетный платеж
        String annuityPay2 = String.format("%.0f",payment2); // аннуитетный платеж (окр.)
        System.out.println();
        System.out.println("Хочешь взять " + creditAmount + " руб. На " + (creditTerm+2) + " год(а) по кредитной ставке " + interestRate + " % годовых?!");
        System.out.println("Тогда каждый месяц будешь заносить по " + annuityPay2 + " руб. Иначе... Ну ты сам знаешь...");

    }

}
