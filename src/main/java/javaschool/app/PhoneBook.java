package javaschool.app;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> recordList = new ArrayList<Record>();

    @Command
    public void create(String name, String email, String... phones) {
        Record r = new Record();
        r.setName(name);
        r.addPhones(phones);
        r.setEmail(email);
        recordList.add(r);

    }

    @Command
    public List<Record> list() {
        return recordList;
    }

    @Command
    public void addPhones(int id, String phone) {
        for (Record r : recordList) {
            if (r.getId() == id)
                r.addPhones(phone);
            break;
        }
    }

    @Command
    public List<Record> find(String str) {
        str = str.toLowerCase();

        List<Record> result = new ArrayList<>();

        for (Record r : recordList) {
            String name = r.getName().toLowerCase();
            if (name.contains(str)) {
                result.add(r);
            }
        }
        return result;
    }
}