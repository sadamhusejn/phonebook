package javaschool.app;

import asg.cliche.Command;
import asg.cliche.ShellFactory;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Record> recordList = new ArrayList<Record>();

    @Command
    public void create(String name, String phone, String...email) {
        Record r = new Record();
        r.setName(name);
        r.setPhone(phone);
        r.setEmail(email);
        recordList.add(r);

    }

    @Command
    public List<Record> list() {
        return recordList;
    }
    public void  addPhones(int id, String phone){
        for (Record r : recordList) {
            if (r.getId() == id)
            r.addPhones(phone);
            break;
        }
        }
    }
}
