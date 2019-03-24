package pets;

import java.awt.Color;

/*
 * Define pet class and methods
 */
public class PetClass {

    String name;
    int age;
    Color petColor;
    String type;

    public PetClass(String inputName, int inputAge, Color inputColor, String inputType) {
        this.name = inputName;
        this.age = inputAge;
        this.petColor = inputColor;
        this.type = inputType;
    }

    public void changePetName(String newName) {
        this.name = newName;
    }
}