package murach;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String heardFrom;
    private String updates;
    private String contactVia;

    public User() {}

    public User(String firstName, String lastName, String email,
                String heardFrom, String updates, String contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.heardFrom = heardFrom;
        this.updates = updates;
        this.contactVia = contactVia;
    }

    // Getters & Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getHeardFrom() { return heardFrom; }
    public void setHeardFrom(String heardFrom) { this.heardFrom = heardFrom; }
    public String getUpdates() { return updates; }
    public void setUpdates(String updates) { this.updates = updates; }
    public String getContactVia() { return contactVia; }
    public void setContactVia(String contactVia) { this.contactVia = contactVia; }
}
