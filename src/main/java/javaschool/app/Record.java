package javaschool.app;


import asg.cliche.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Record {
    private static int count = 0;
    private int id;
    private String name;

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


}
