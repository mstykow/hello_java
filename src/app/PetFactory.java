package app;

import java.awt.Color;

/*
* Make instances of pets (pet factory)
*/

public class PetFactory {
    public static void main(String[] args) throws Exception {
        PetClass myPet = new PetClass("Timmie", 8, Color.black, "cat");
        System.out.println(myPet.petColor);
        System.out.println(myPet.name);
        myPet.changePetName("Mouse");
        System.out.println(myPet.name);
    }
}