package winzinger.samples;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by rwinzing on 13.11.15.
 */
public class Customer {
    private int id;
    private String firstname;
    private String lastname;
    private LocalDate birthday;

    public Customer(int id, String firstname, String lastname, LocalDate birthday) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
