package javaschool.app;


import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Record {
    private static int count = 0;
    private int id;
    private String name;
    private List<String> phones = new ArrayList<>();
    private String email;

    public Record() {

        id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
        return id + " " + name + " " + phones + " " + email + count;
    }
}
