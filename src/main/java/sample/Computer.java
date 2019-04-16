package sample;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private String name;

    public Computer() {
        name = "";
    }

    Program program = new Program();

    public List<Computer> progList = new ArrayList<>();

    public Computer(String name) {
        this.name = name;
    }

    public void input(String s) {
        program.input(progList, s);
    }

    public void delete() {
        program.delete(progList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
