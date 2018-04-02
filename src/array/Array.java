/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Cefnar
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] maleStudents = new String[5];
        
        maleStudents[0] = "Juan";
        maleStudents[1] = "John";
        maleStudents[2] = "David";
        maleStudents[3] = "Joseph";
        maleStudents[4] = "Charles";
        
        System.out.println("Male Students: ");
        
        for (int sequence = 0; sequence < maleStudents.length; sequence ++){
        
            System.out.println(sequence + 1 + ". "+ maleStudents[sequence]);
        }
        
        String femaleStudents[] = {"Mary", "Susan","Michelle","Sarah","Asheley"};
        System.out.println("Female Students: ");
        
        for (int sequence = 0; sequence < femaleStudents.length; sequence++){
        
            System.out.println(sequence +1+ ". "+ femaleStudents[sequence]);
        
        }
        
        String [] studentList = new String []{"Jason","Gloria","Paul","Lisa"};
        
        System.out.println("Student List");
        int sequence = 1;
        for (String student:studentList){
            System.out.println(sequence +". "+ student);
            sequence ++;
        }
        
   
        
    }
    
}
