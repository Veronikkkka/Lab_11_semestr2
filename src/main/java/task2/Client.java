package task2;

import lombok.Getter;
import lombok.Setter;

public class Client {
    @Getter
    private int id;
    @Setter @Getter
    private String name;
    @Setter @Getter
    private int age;
    @Setter @Getter
    private Gender sex;
    private static int count = 0;

    public Client(String name, Gender sex, int age){
        id = ++count;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
