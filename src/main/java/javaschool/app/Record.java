package javaschool.app;


import asg.cliche.Command;

import java.util.Arrays;

public class Record {
    private static int count = 0;
    private int id;
    private String name;
    private String phone;
    private String email;

    public Record() {
        id = count++;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;


    }


    public void addPhones(String... phones) {
        this.phone.addAll(Arrays.asList(phones));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + email + count;
    }
}
