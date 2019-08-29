/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytasks;

import java.util.Arrays;

/**
 *
 * @author CPP_Curriculum
 */
public class ArrayTasks {

    private static int gradesArraySize = 5;
    private static int subjectsArraySize = 3;
    public static char [] studentGrades = new char[gradesArraySize];
    public static String [] subjectNames = new String[gradesArraySize];
 
    public static void main(String[] args) {
        //TASK 1: Adding array elements
        studentGrades[0] = 'A';
        studentGrades[1] = 'B';
        studentGrades[2] = 'D';
        studentGrades[3] = 'F';
        
        //TASK 1: displaying original grades array
        System.out.println("Original grades array: ");
        displayCharArray(studentGrades);
        
        //TASK 1: as shifting indexes is not possible in arrays, creating new array to store grades 
        char [] newStudentGrades = new char[gradesArraySize];
        //TASK 1: as arrays are fixed size, creating new array to store subjects 
        String[] newSubjectsArray;
        
        
        //TASK 1: copying first 2 elements from original to final grades array
        System.arraycopy(studentGrades, 0, newStudentGrades, 0, 2);
        //TASK 1: adding missing grade to the middle of the array
        newStudentGrades[2] = 'C';
        //TASK 1: copying remaining elements from original to final grades array
        System.arraycopy(studentGrades, 2, newStudentGrades, 3, 2);
        
        //TASK 1: displaying final grades array
        System.out.println("Final grades array: ");
        displayCharArray(newStudentGrades);        

        //TASK 2: Adding array elements
        subjectNames[0] = "Mathematics";
        subjectNames[1] = "Science";
        subjectNames[2] = "Physical Education";
        
        //TASK 2: displaying second elements of the subjects array
        System.out.println("Second element in subjects array: " + subjectNames[1] + "\n");
        
        //TASK 2: adding two more elements to the newSubjects array
        newSubjectsArray = Arrays.copyOf(subjectNames, 5);
        newSubjectsArray[3] = "English";
        newSubjectsArray[4] = "Fine Arts";        
               
        //TASK 2: displaying final subjects array
        System.out.println("Final subjects array: ");
        for (String newSubjectsArray1 : newSubjectsArray) {
            System.out.println(newSubjectsArray1);
        }
    }
    
    //displays array elements to the console for the given array of characters  
    public static void displayCharArray(char[] arrayToDisplay){
        for (int i = 0; i< arrayToDisplay.length; i++){
            System.out.println(arrayToDisplay[i]);
        }
        System.out.println("\n");
    }
    
}
