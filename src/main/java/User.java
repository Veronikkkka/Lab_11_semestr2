import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

enum Gender {
    MALE, FEMALE
}

@SuperBuilder
@ToString
public class User extends Human{
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular(value = "work")
    private List<String> occupation;



}