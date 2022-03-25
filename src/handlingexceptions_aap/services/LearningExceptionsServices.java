/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handlingexceptions_aap.services;

import handlingexceptions_aap.entities.WineLabel_2learnExceptions;
import handlingexceptions_aap.exceptions.WineLabel_learningExceptions_Exception;
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class LearningExceptionsServices {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    // INPUT
    
    public WineLabel_2learnExceptions inputWineLabelinDatabase(){
        
        // label
        System.out.println("Winery name as shown on the label:");
        String label = sc.next();
        
        // Wine name
        System.out.println("Name of the wine/line of wine:");
        String wineName = sc.next();
        
        // Vintagle
        System.out.println("Vintage: ");
        int vintage = sc.nextInt();
        
        // Alchol level in %
        System.out.println("Alcohol level expressed in % :");
        double alcohol = sc.nextDouble();
        
        // object WineLabel to be returned
        return new WineLabel_2learnExceptions(label, wineName, vintage, alcohol);
    }
    
    public WineLabel_2learnExceptions inputWineLabelWithoutAskingQuestions(String winery, String labelName, int vintage, double alc) throws WineLabel_learningExceptions_Exception{
        /*
        private String wineLabelWinery;
        private String wineLabelName;
        private Integer wineLabelVintage;
        private Double wineLabelAlcohol;
        */
        
        try {
            
            /*
            We are creating an object with class 'WineLabelException' for each of the attributes in the class Wine Label
            
            */
            
            if (winery.isEmpty()){
                throw new WineLabel_learningExceptions_Exception("Don't forget to specify the name of the winery");
            }
            
            if (labelName.isEmpty()){
                throw new WineLabel_learningExceptions_Exception("Wine Label name is empty");
            }
            
            if (vintage <= 0){
                throw new WineLabel_learningExceptions_Exception("Number doesn't correspond to a vintage");
            }
            
            if (alc <= 10d) {
                throw new WineLabel_learningExceptions_Exception("The low level of alcohol can only correspond to a special wine");
            }
            
            WineLabel_2learnExceptions label2return = new WineLabel_2learnExceptions();
            label2return.setWineLabelWinery(winery);
            label2return.setWineLabelName(labelName);
            label2return.setWineLabelVintage(vintage);
            label2return.setWineLabelAlcohol(alc);
            
        } catch (WineLabel_learningExceptions_Exception e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new WineLabel_learningExceptions_Exception("System error, please revise your code");
        }
        
        
        return new WineLabel_2learnExceptions(winery, labelName, vintage, alc);
    }
    
    // OUTPUT
    
    public void displayWineLabelInConsole (WineLabel_2learnExceptions label){
        System.out.println("       *");
        System.out.println("---------------");
        System.out.println("Wine Label Info");
        System.out.println("---------------");
        System.out.println(label.getWineLabelWinery() + " " + label.getWineLabelName());
        System.out.println("Vintage: " + label.getWineLabelVintage() + " | " + label.getWineLabelAlcohol() + " %/V");
        System.out.println("");
    }
    
}
