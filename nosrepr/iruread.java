public static void calculateTaxOfRate(int inputMoney) {
    double taxRate = 0.10; // 10% tax rate
    double taxAmount = inputMoney * taxRate;
    System.out.println("Tax amount for $" + inputMoney + " at " + (taxRate * 100) + "% rate: $" + taxAmount);
}
