final class Currency {
    private final String code;
    private final String symbol;
    private final double exchangeRate;
    public Currency(String code, String symbol, double exchangeRate) {
        this.code = code;
        this.symbol = symbol;
        this.exchangeRate = exchangeRate;
    }
    public String getCode() {
        return code;
    }
    public String getSymbol() {
        return symbol;
    }
    public double getExchangeRate() {
        return exchangeRate;
    }
    public double convertToBase(double amount) {
        return amount * exchangeRate;
    }
}
public class CurrencyDemo {
    public static void main(String[] args) {
        Currency usd = new Currency("USD", "$", 1.0);
        Currency eur = new Currency("EUR", "€", 0.85);
        System.out.println("Currency: " + usd.getCode() + ", Symbol: " + usd.getSymbol() + ", Exchange Rate: " + usd.getExchangeRate());
        System.out.println("Currency: " + eur.getCode() + ", Symbol: " + eur.getSymbol() + ", Exchange Rate: " + eur.getExchangeRate());
        double amountInEur = 100;
        double amountInUsd = eur.convertToBase(amountInEur);
        System.out.println(amountInEur + " " + eur.getCode() + " is equivalent to " + amountInUsd + " " + usd.getCode());
    }
}