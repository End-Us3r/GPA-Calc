package gpa_calculator_project_atkinsjames;
//James Atkins
//CSC-151-0901
//05-02-2022
/*This project is used to calculate and display a person's GPA for the
current semester, as well as Cumulative GPA*/
import java.util.Arrays;
import javax.swing.JOptionPane;

public class GPA_Calculator_Project_AtkinsJames {
    
    public static int userInputCredits(){
        String input;
        int credits;
        input = JOptionPane.showInputDialog("Enter the credits.");
        credits = Integer.parseInt(input);
        
        return(credits);
    }
    
    public static String userLetterGrade(){
        String input;
        String letterGrade;
        input = JOptionPane.showInputDialog("Enter the letter grade.");
        letterGrade = input;
        if(letterGrade.equalsIgnoreCase("A")){
            letterGrade = "A";
            return(letterGrade);
        }
        else if(letterGrade.equalsIgnoreCase("B")){
            letterGrade = "B";
            return(letterGrade);
        }
        else if(letterGrade.equalsIgnoreCase("C")){
            letterGrade = "C";
            return(letterGrade);
        }
        else if(letterGrade.equalsIgnoreCase("D")){
            letterGrade = "D";
            return(letterGrade);
        }
        else if(letterGrade.equalsIgnoreCase("F")){
            letterGrade = "F";
            return(letterGrade);
        }
        else
        
       return(letterGrade);
    }
    
    public static void main(String[] args) {
        int i;
        int numClasses;
        double runningNumCredits;
        double totalCredits = 0.0;
        double gradePoints = 0.0;
        double totalGradePoints = 0.0;
        String[] letterGrades = new String[8];
        String input;
        
        JOptionPane.showMessageDialog(null,"This calculator will determine "
                + "your GPA for a single semester and Cumulative GPA.");
        input = JOptionPane.showInputDialog("First, enter the total number of "
                + "classes taken for the semester.");
        numClasses = Integer.parseInt(input);
        runningNumCredits = userInputCredits();
        
        for(i = 1; i <= numClasses; i++){
            JOptionPane.showMessageDialog(null, "For Class " + i + " enter the "
                    + "following: ");
            runningNumCredits = userInputCredits();
            totalCredits = (totalCredits + runningNumCredits) + 0;          
            letterGrades[i] = userLetterGrade();
            if("A".equals(letterGrades[i])){
                gradePoints = 4.0;
            }
            else if("B".equals(letterGrades[i])){
                gradePoints = 3.0;
            }
            else if("C".equals(letterGrades[i])){
                gradePoints = 2.0;
            }
            else if("D".equals(letterGrades[i])){
                gradePoints = 1.0;
            }
            else if("F".equals(letterGrades[i])){
                gradePoints = 0.0;
            }
            totalGradePoints = (totalGradePoints + gradePoints);
            
        }
        double points = gradePoints * totalCredits;
        double GPA = points / totalCredits;
        //System.out.println(letterGrades[i]);
        //System.out.println(totalGradePoints);
            
        JOptionPane.showMessageDialog(null,"Your grades for the semester are:");
        JOptionPane.showMessageDialog(null,letterGrades);
        //int totalUserCredits = totalCredits;
        JOptionPane.showMessageDialog(null,"You have attempted a total of "
                + "" + totalCredits + " credit hours.");
        JOptionPane.showMessageDialog(null, "Your running GPA is: "
                + GPA);
        //totalCredits = userInputCredits();
    
    }
    
}
