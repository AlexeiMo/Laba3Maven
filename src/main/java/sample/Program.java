package sample;

import java.util.List;
import java.util.stream.Collectors;

public class Program extends AbstractFile {
    private String name;

    public Program() {
        name = "";
    }

    //Метод добавления.
    public void input(List<Computer> f2, String s) {

        List<String> abc = f2.stream()
                .map(Computer::getName)
                .sorted()
                .collect(Collectors.toList());

        boolean b = f2.stream()
                .anyMatch(c -> c.getName().contains("abc"));

        Computer p = new Computer(s);
        f2.add(f2.size(), p);
    }

    //Метод удаления.
    public void delete(List<Computer> f1) {
        Computer f = f1.get(f1.size() - 1);
        f1.remove(f1.size() - 1);
    }
}
