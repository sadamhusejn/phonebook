package javaschool.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Person extends Record {
    private String email;
    private List<String> phones = new ArrayList<>();
    public List<String> getPhones() {
        return phones;
    }


    public void addPhones(String... phones) {
        this.phones.addAll(Arrays.asList(phones));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + phones + " " + email ;
    }
}
