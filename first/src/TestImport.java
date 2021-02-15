//import garden.vegetable.VineVegetable;

import garden.vegetable.*;
import nursery.vegetable.*;

public class TestImport {

    public static void main(String[] args) {

        //string class imported in java.lang package
        String s ="Testing ways to import classes";
        System.out.println(s);

        //using simple name because of import
        VineVegetable.main(args);

        nursery.vegetable.VineVegetable.main(args);


    }
}

class VineVegetable {
    public static void main(String[] args) {

        System.out.println("I am local VineVegetable");
    }}
