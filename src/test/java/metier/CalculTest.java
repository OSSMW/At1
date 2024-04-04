package metier; // Declaring package metier

import org.junit.Assert; // Importing Assert class from org.junit package
import org.junit.Test; // Importing Test class from org.junit package

public class CalculTest { // Declaring a public class named CalculTest

    private Calcul calcul; // Declaring a private instance variable of type Calcul

    @Test // Annotation indicating that the following method is a test case
    public void testSomme(){ // Declaring a public method named testSomme
        calcul = new Calcul(); // Instantiating the Calcul object
        double a=5; // Declaring and initializing a double variable a with value 5
        double b=9; // Declaring and initializing a double variable b with value 9
        double expected = 14; // Declaring and initializing a double variable expected with value 14
        double res = calcul.somme(a,b); // Calling the somme method of the calcul object with parameters a and b, storing the result in res
        Assert.assertTrue(res==expected); // Using Assert class to assert that res is equal to expected
    }
}
