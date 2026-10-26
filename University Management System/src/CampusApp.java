import java.util.ArrayList;
import java.util.Scanner;

public class CampusApp {
    public static void main(String[] args){
        ArrayList<Person> campusList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int input = 0;
        while(input != 5){
            System.out.println("1: Add a Student \n" +
                                "2: Add a Staff Member \n" +
                                "3: View all Campus Members \n" +
                                "4: Search Person by ID\n"+
                                "5: Exit");
            input = scan.nextInt();
            if(input == 1){
                System.out.println("Enter Student details: ");
                System.out.println("ID: ");
                String ID = scan.next();
                System.out.println("Name: ");
                String name = scan.next();
                System.out.println("Email: ");
                String email = scan.next();
                System.out.println("Gpa: ");
                double gpa = scan.nextDouble();
                System.out.println("Course: ");
                String course = scan.next();
                Student student = new Student(ID, name, email, gpa, course);
                campusList.add(student);
                }else if(input == 2){
                System.out.println("Enter Staff details: ");
                System.out.println("ID: ");
                String ID = scan.next();
                System.out.println("Name: ");
                String name = scan.next();
                System.out.println("Email: ");
                String email = scan.next();
                System.out.println("Department: ");
                String department = scan.next();
                System.out.println("Salary: ");
                double salary = scan.nextDouble();
                Staff staff = new Staff(ID, name, email, department, salary);
                campusList.add(staff);
            }else if(input == 3){
                for(Person person : campusList){
                    System.out.println(person.getDetails());
                }
            }else if(input == 4){
                  System.out.println("Enter ID of Person: ");
                  String ID = scan.next();
                  for (Person person : campusList){
                      if(person.getID().equals(ID)){
                          System.out.println(person.getDetails());
                      }
                  }
            } else{
                System.out.println("Ending System>>>>>......: ");
                break;
            }
        }
    }
}
