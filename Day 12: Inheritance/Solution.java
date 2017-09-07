import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    public void printPerson(){
         System.out.println(
                "Name: " + lastName + ", " + firstName 
            +   "\nID: " + idNumber); 
    }
     
}

class Student extends Person{
    private int[] testScores;
    String firstName;
    String lastName;
    int identification;

    
    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
        
        
        public String calculate(){
            int sum = 0;
            int avg;
            String grade = "";
            int size = testScores.length;
            for(int i = 0; i < testScores.length; i++){
                sum = sum + testScores[i];
            }
            avg = sum/size;
            if(avg>=90 && avg <= 100){
                grade = "O";
            }
            else if(avg>=80 && avg < 90){
                grade = "E";
            }
            else if(avg>=70 && avg <80){
                grade = "A";
            }
            else if(avg>=55 && avg <70){
                grade = "P";
            }
            else if(avg>=40 && avg <55){
                grade = "D";
            }
            else if(avg < 40){
                grade = "T";
            }
            
            return grade;
            
        }
        
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();
        
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}