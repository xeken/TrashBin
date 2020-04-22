package kr.hs.dgsw.hw02;

public class User {

    private String PersonalID;
    private String Name;
    private String Email;

    public User(){}

    public User(String PersonalID, String Name, String Email) {

        this.PersonalID = PersonalID;
        this.Name = Name;
        this.Email = Email;
    }










    public String getPersonalID() {
        return PersonalID;
    }

    public void setPersonalID(String personalID) {
        PersonalID = personalID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
