public class CreditPaymentService {
    public double calculate(int creditAmount, int creditTerm, double interestRate) {

        // Аннуитетный платёж рассчитывается по формуле: Сумма кредита × Коэффициент аннуитета
        //Коэффициент рассчитывается следующим образом:
        // (m × (1 + m)ⁿ) / ((1 + m)ⁿ — 1)
        // где m — процентная ставка в месяц, равная годовой ставке, поделённой на 12
        // n — количество платежей

        int n = (creditTerm * 12); // Срок кредита (мес)
        double m = (interestRate / 12) /100; // процентная ставка (мес)
        double exponent = Math.pow((1 + m), n);
        double coefficient = (m * exponent) / (exponent - 1); // итоговый коэффициент
        return (creditAmount * coefficient); // аннуитетный платеж
    }

}
