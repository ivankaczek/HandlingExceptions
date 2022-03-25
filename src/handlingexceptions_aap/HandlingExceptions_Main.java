/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlingexceptions_aap;

import handlingexceptions_aap.entities.WineLabel_2learnExceptions;
import handlingexceptions_aap.services.LearningExceptionsServices;

/**
 *
 * @author Ivan
 */
public class HandlingExceptions_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LearningExceptionsServices serv = new LearningExceptionsServices();
        
//        int intValue = Integer.valueOf("a");    // the idea in the method Integer.valueOf("42"); is to return an integer
                                                // that for wathever reason had a String, exemple, it's a substring of an email
           
/*
let's take a look on the result in the console
                                                
run:
Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.valueOf(Integer.java:766)
	at handlingexceptions_aap.HandlingExceptions_Main.main(HandlingExceptions_Main.java:18)
C:\Users\Ivan\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)          
                                                
                                                Basically what is happening here is that different methods are throwing
                                                exceptions and each of those exceptions, let's say "things that go wrong"
                                                accumulate in a "pila" (of do we say this in English?) of errors.
                                                This is also called the 'hierarchy tree of exceptions'
                                                
*/
        System.out.println("----------------------------------------");
        System.out.println("Exception #1: 'Number Fortmat Exception'");
        System.out.println("----------------------------------------");

        int intValue02 = 5;
        System.out.println("an integer was set in '5'");
        
        try {
            // now try with a letter instead of a number
            String string2convert = "q";
            System.out.println("Let's try to convert '" + string2convert +  "' into an integer number" ) ;
            intValue02 = Integer.valueOf(string2convert);
            System.out.println("the string was succesfully converted into the integer " + intValue02);
        } catch(NumberFormatException e){
            System.out.println("The String to convert is not actually a number");
        }
        
        System.out.println("");
        System.out.println("---------------------------------------------------------");
        System.out.println("Exception #2: 'Exception', the most general possible case");
        System.out.println("---------------------------------------------------------");
        try {
            String string2convert02 = "q";
            int intValue3 = Integer.valueOf(string2convert02);
            System.out.println("The corresponding integer value is " + intValue3);
        } catch (Exception e) {
            System.out.println("The previous input throws an exception, please check the corresponding code lines");
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Part #3: 'Finally', will be excecuted with or without the exception happening");
        System.out.println("-----------------------------------------------------------------------------");
        String string2convert03 = "z";
        System.out.println("We have a String '" + string2convert03 + " ' that we want to transform into an integer number");
        
        
        /*
        Here it's important to notice that you can have a 'cascade' of exceptions, and so, you can code more that one 'catch'
        */
        
        try {
            int intValue05 = Integer.valueOf(string2convert03);
            System.out.println("Integer convertion was succesfull");
        } catch (NumberFormatException e){
            System.out.println("The input String doesn't correspond to an integer number");
        } catch (Exception e){
            System.out.println("The previous input throws an exception, please check the corresponding code lines");
        } finally {
            int intValue06 = 100;
            System.out.println("By default, you can use the integer " + intValue06 + " which is stored in the variable intValue06 ");
        }
        
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Exception handling in my own code: input of a wine label in my database");
        System.out.println("-----------------------------------------------------------------------");
        
        // we can input a new Wine Label answering a few questions or...
//        WineLabel_2learnExceptions label01 = serv.inputWineLabelinDatabase();
//        System.out.println(label01);
        
        // we can create a new Label manually, using the Wine Label Class constructor
        WineLabel_2learnExceptions label02 = new WineLabel_2learnExceptions("Luis Jadot", "Vosne Romanee", 2013, 12d);
        serv.displayWineLabelInConsole(label02);
        
        try {
            // we try to input a new label in database, but we forget to specify the alcohol level
            WineLabel_2learnExceptions label03 = serv.inputWineLabelWithoutAskingQuestions("Domaine de la Poule d'Or", "Morey StDenis", 2018, 0);
        }catch (Exception objectOfClassException) {
            System.out.println("You've got an excpetion");
        }
        
        
    }
    
}

/*
Syntax 
    try { block of code with the possible instruction which would derivate into an exception }
If the exception happens indeed, the program execution will be directed to the first 'catch' block of code.
If the class of the execption in the 'try' code matches the class/subclass in 'catch', and the 'catch' code is executed.

try {
BloqueDeIntrucciones
} catch (TipoExcepción nombreVariable) {
BloqueCatch
} catch (TipoExcepción nombreVariable) {
BloqueCatch
}

*/