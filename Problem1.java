/* Problem Statement:
Write a Java program that, given as input name, age and chronicCondition of some patients, prints the filtered stream of patients whose age is below 30 and chronicCondition is Diabetes. Complete the program as specified below.
• Class Patient has/should have the following members:
– Private instance variables String name, int age and String chronicCondition
– A constructor to initialize instance variables
– Method toString to print in the format shown in the test cases
– Accessor methods for age and chronicCondition
– MethodpatientProcessorshouldtakeanArrayListofPatientobjectsasinput and returns a filtered stream of diabetic patients who are below 30 years.
• Class StreamTest has the following members:
– Method main creates an ArrayList of Patient objects by taking input in the or- der of name, age and chronicCondition then invokes the method patientProcessor to filter patients whose age is below 30 and chronicCondition is Diabetes and finally display those patients.
*/

import java.util.*;
import java.util.stream.*;
class Patient{
    private String name;
    private int age;
    private String chronicCondition;
    public Patient(String n, int a, String cC){
        name = n;
        age = a;
        chronicCondition = cC;
    }
    public String toString(){
        return name + " - " + age;
    }
    public int getAge(){
        return age;
    }
    public String getChronicCondition(){
        return chronicCondition;
    }
    //Answer Starts
    public static Stream<Patient> patientProcessor(ArrayList<Patient> Patients){
        return Patients.stream().filter(Patient -> Patient.getAge() < 30 && Patient.getChronicCondition().equals("Diabetes"));
    }
    //Answer Ends
}
public class Problem1{
    public static void main(String[] args) {
        ArrayList<Patient> Patients = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i <4; i++){
            Patient obj = new Patient(sc.next(), sc.nextInt(), sc.next());
            Patients.add(obj);
        }
        Stream<Patient> filteredPatients = Patient.patientProcessor(Patients);
        filteredPatients.forEach(System.out::println);
        sc.close();
    }
}