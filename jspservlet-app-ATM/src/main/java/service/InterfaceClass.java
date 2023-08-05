// InterfaceClass.java
package service;

public interface InterfaceClass {
    double withdrawAmount(double currentBalance, double amountToWithdraw);
    double depositAmount(double currentBalance, double amountToDeposit);
    double accountBalance(double currentBalance);
}
