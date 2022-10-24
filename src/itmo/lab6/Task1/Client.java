package itmo.lab6.Task1;

public class Client extends Human{

    protected String bankname;

    public Client(String firstname, String lastname, String bankname) {
        super(firstname, lastname);
        this.bankname = bankname;
    }

    @Override
    public void methodOut() {
        System.out.println("Client{" +
                "bankname='" + bankname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankname='" + bankname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
