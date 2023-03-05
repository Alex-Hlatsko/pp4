import java.util.*;
public class Classes {
    ArrayList<String> students = new ArrayList<String>();
    String name;
    int maxCount = 10;
    
    public boolean controll(){
        if(students.size()<=10){
            return true;
        } else {
            return false;
        }
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void addStudent(String name){
        if (students.size()<=10){
            students.add(name);
        }
        else {
            System.out.println("The class is full!");
        }
    }
    public String showStudents(){
        return "Students in the class are: "+String.join(", ", students);
    }
    public static void main(String[] args) {
        Classes cl = new Classes();
        int n = 0;
        while (n<cl.getMaxCount()){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter student's name:");

            String name = myObj.nextLine();
            cl.addStudent(name);
            n++;
        }
        System.out.println(cl.showStudents());
    }
}