##### Objective 
Today, we're delving into Inheritance. Check out the attached tutorial for learning materials and an instructional video!

##### Task 
You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

* A Student class constructor, which has  parameters:
    1.  A string, *firstName*.
    2.  A string, *lastName*.
    3.  An integer, .
    4.  An integer array (or vector) of test scores, *scores*.
*   A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average.

    
##### Input Format

The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments. It also calls the calculate method (which takes no arguments).

You are not responsible for reading the following input from stdin: 
The first line contains *firstName*, *lastName*, and *id*, respectively. The second line contains the number of test scores. The third line of space-separated integers describes *scores*.

##### Constraints
* 1 <= |*firstName*|, |*lastName*| <= 10
* |*id*| = 7
* 0 <= *score, average* <= 100

##### Output Format

This is handled by the locked stub code in your editor. Your output will be correct if your Student class constructor and calculate() method are properly implemented.

##### Sample Input
```
Heraldo Memelli 8135627
2
100 80
```
##### Sample Output
```
 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
 ```
##### Explanation

This student had 2 scores to average: 100 and 80. The student's average grade is (100 + 80)/2 = 90. An average grade of 90 corresponds to the letter grade *O*, so our calculate() method should return the character```'O'```.

```java
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

```