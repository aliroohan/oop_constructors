class Account{
    private String accountid;
    private String name;
    private String CNIC;
    private int age;
    private double balance;

    private String getAccountid() {
        return accountid;
    }

    private void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getCNIC() {
        return CNIC;
    }

    private void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
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

    private double getBalance() {
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
}
public class AccountTest {
    
}
