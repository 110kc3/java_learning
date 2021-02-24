package a.c;

import java.lang.*; //always included - redundant
import a.c.ImportTests; //redundant

//import a.*; //importing classes in a but not in a.b

import a.b.PackageTests;

public class ImportTests {
    public static void main(String[] args){

        System.out.println("Import tests");
        PackageTests.main(args);
    }
}
