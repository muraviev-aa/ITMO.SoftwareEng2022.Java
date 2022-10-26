package itmo.lab6.Task2;

public class BankEmployee extends Human implements Test{

    protected String bankname;


    public BankEmployee(String firstname, String lastname, String bankname) {
        super(firstname, lastname);
        this.bankname = bankname;
    }

    @Override
    public void methodOut() {
        System.out.println("BankEmployee{" +
                "bankname='" + bankname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "BankEmployee{" +
                "bankname='" + bankname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
