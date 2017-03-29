package javaschool.app;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> recordList = new ArrayList<Record>();
    Note m = new Note();

    @Command
    public void createPerson(String name, String email, String... phones) {
        Person r = new Person();
        r.setName(name);
        r.addPhones(phones);
        r.setEmail(email);
        recordList.add(r);
    }

    @Command
    public void createNote(String name, String note) {
        m.setName(name);
        m.setText(note);
    }

    @Command
    public List<Record> list() {
        return recordList;
    }

    @Command
    public String note() {
        return m.getText();
    }

    @Command
    public void addPhones(int id, String phone) {
        for (Record r : recordList) {
            if (r instanceof Person && r.getId() == id) {
                Person p = (Person) r;
                p.addPhones(phone);
            }

        }
    }

    @Command
    public List<Record> find(String str) {
        str = str.toLowerCase();

        List<Record> result = new ArrayList<>();

        for (Record r : recordList) {
            String name = r.getName().toLowerCase();
            String email;
            if (r instanceof Person) {
                Person p = (Person) r;
                email = p.getEmail().toLowerCase();

            } else {
                email = "";
            }
            if (name.contains(str) || email.contains(str)) {
                result.add(r);
            }
        }
        return result;
    }
}