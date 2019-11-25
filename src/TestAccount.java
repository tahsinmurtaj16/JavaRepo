import java.util.Date;

public class TestAccount {
        public static void main(String[] args) {
            Account a = new Account(1122,20000);
            a.setAnnualInterestRate(4.5);
            a.withdraw(2500);
            a.deposit(3000);
            System.out.println("Balance is "+a.getBalance()+" , monthly Interest is "+a.getMonthlyInterest()+" ,and date is "+a.getDateCreated());
        }
    }

        class Account {
            private int id;
            private double balance;
            private double annualInterestRate;
            private Date dateCreated;

            public Account() {
                this.dateCreated = new java.util.Date();
            }
            public Account(int id,double balance)
            {
               this();
                this.balance = balance;
                this.id= id;
                //this();
            }

            public int getId() {
                return this.id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public double getBalance() {
                return this.balance;
            }

            public void setBalance(double balance) {
                this.balance = balance;
            }

            public double getAnnualInterestRate() {
                return this.annualInterestRate;
            }

            public void setAnnualInterestRate(double annualInterestRate) {
                this.annualInterestRate = annualInterestRate / 100;
            }

            public String getDateCreated() {
                return this.dateCreated.toString();
            }

            public double getMonthlyInterestRate() {
                double monthlyInterestRate;
                monthlyInterestRate = getAnnualInterestRate() / 12;
                return monthlyInterestRate;
            }

            public double getMonthlyInterest() {
                double monthlyInterest;
                monthlyInterest = getBalance() * getMonthlyInterestRate();
                return monthlyInterest;
            }

            public void withdraw(double balance) {
                this.balance -= balance;
            }

            public void deposit(double balance) {
                this.balance += balance;
            }

        }
