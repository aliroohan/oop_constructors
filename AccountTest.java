class Account{
    private String accountid;
    private String name;
    private String CNIC;
    private int age;
    private double balance;

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 35)
            setBalance(0);
        else if (age > 30)
            setBalance(10000);
        else if (age > 25)
            setBalance(25000);
        else if (age > 20)
            setBalance(50000);
        else
            System.out.println("Underage Account cannot be created");      
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String accountid)
    {
        setAccountid(accountid);
    }

    public Account(String name, String CNIC, int age)
    {
        setName(name);
        setCNIC(CNIC);
        setAge(age);
    }

    public void deposit(double amount)
    {
        if (amount < 0)
            System.out.println("Invalid Amount");
        else
            setBalance(getBalance() + amount);
    }

    public void withdraw(double amount)
    {
        if (getBalance() - amount < 0)
            System.out.println("Insufficient Balance");
        else
            setBalance(getBalance() - amount);
    }
}
public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("12345");
        Account a2 = new Account("Ali","12345-1234567-1",25);
        a2.deposit(10000);
        a2.withdraw(6000);
        a1.deposit(50000);
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
        

    }
    
}
