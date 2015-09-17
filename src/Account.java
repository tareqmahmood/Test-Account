/**
 * Created by Tareq on 9/13/2015.
 */
public class Account {
    private Customer customer;
    private int accountNumber;
    private double balance;
    private String branch;

    public Account(Customer customer, int accountNumber, double balance)
    {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account(Customer customer, int accountNumber, String branch)
    {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.balance = 0;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    public Customer getCustomer()
    {
        return customer;
    }
    public String getBranch()
    {
        return branch;
    }
    public String getCustomerName()
    {
        return customer.getName();
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void print()
    {
        System.out.println("Customer: " + getCustomerName() + " Branch: " + branch + " A\\C no: " + accountNumber + " Balance: " + balance);
    }
    public void credit(double a)
    {
        balance = balance + a;
    }
    public void debit(double a)
    {
        if(a <= balance) balance = balance - a;
        else System.out.println("Amount withdrawn exceeds the current balance!");
    }
}
