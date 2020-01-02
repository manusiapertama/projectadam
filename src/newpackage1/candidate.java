package newpackage1;
import java.util.*;

public class candidate {
    private String name, qualification, status;
    private int age;
    
    public void getCandidatesDetails(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("enter your qualification");
        qualification = sc.next();
        System.out.println("enter your age");
        age = sc.nextInt();
        AgeValidation obj =  new AgeValidation();
        obj.validateAge();
              
    }
    private class AgeValidation{
        public void validateAge(){
            if(age>=21 && age<=25){
                status="selected";
            }
            else{
                status="rejected";
            }
        }
    }
public void printCandidatesDetails(){
System.out.println("name: "+name);
System.out.println("Qualification: "+qualification);
System.out.println("Age: "+age);
System.out.println("selection status: "+status);
}
public static void main (String args[]){
candidate candidate = new candidate();
candidate.getCandidatesDetails();
candidate.printCandidatesDetails();
}
}
