package itmo.lab6.Task2;

public abstract class Human {

    protected String firstname;
    protected String lastname;

    public Human(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

}
