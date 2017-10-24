/*
  Design a class named Account that contains:

  - A private int data field named id for the account (default 0).
  - A private double data field named balance for the account (default 0).
  - A private double data field named annualInterestRate that stores the
    current interest rate (default 0). Assume all accounts have the same
    interest rate.
  - A private Date data field named dateCreated that stores the date when the
    account was created.
  - A no-arg constructor that creates a default account.
  - A constructor that creates an account with the specified id and initial
    balance.
  - The accessor and mutator methods for id, balance, and annualInterestRate.
  - The accessor method for dateCreated.
  - A method named getMonthlyInterestRate() that returns the monthly interest
    rate.
  - A method named getMonthlyInterest() that returns the monthly interest.
  - A method named withdraw that withdraws a specified amount from the account.
  - A method named deposit that deposits a specified amount to the account.

  Write a test program that creates an Account object with an account ID of
  1122, a balance of $20,000, and an annual interest rate of 4.5%. Use the
  withdraw method to withdraw $2,500, use the deposit method to deposit $3,000,
  and print the balance, the monthly interest, and the date when this account
  was created.
*/

public class E9_07 {
  public static void main(String[] args) {
    Account account = new Account(1122, 20_000);
    account.setAnnualInterestRate(4.5);
    account.withdraw(2_500);
    account.deposit(3_000);

    System.out.println(account);
  }
}
