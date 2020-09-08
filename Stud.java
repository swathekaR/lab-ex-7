
package stud;
import java.util.*;
public class Stud {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        list.add(new student("Ram","A1",9.5));
        list.add(new student("Meena","A2",9.7));
        list.add(new student("samson","A3",9.6));
        list.add(new student("daniel","A4",9.94));
        list.add(new student("shreyas","A5",9.4));
        list.add(new student("gopal","A6",9.56));
        list.add(new student("sundar","A7",8.9));
        list.add(new student("sneha","A8",8.8));
        list.add(new student("shiny","A9",8.7));
        list.add(new student("manesh","A10",8.63));
        list.add(new student("rohit","A11",9));
        list.add(new student("suresh","A12",9.8));
        list.add(new student("kamali","A13",9.2));
        list.add(new student("deepak","A14",8.4));
        list.add(new student("rahul","A15",8.75));
        list.add(new student("dulquer","A16",9.67));
        list.add(new student("bharani","A17",8.32));
        list.add(new student("Dharani","A18",9.14));
        list.add(new student("Divya","A19",9.36));
        list.add(new student("Ramesh","A20",9.59));
        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println("\nName in Descending Order:"+list);
    }
    
}
class student
{
    String name,rollno;
    double cgpa;
    student(String n,String r,double c)
    {
        name=n;
        rollno=r;
        cgpa=c;
    }
    public String toString()
    {
        return "\nStudent Name:"+name+"\tRoll No:"+rollno+"\tCgpa:"+cgpa;
    }
}
class namesort implements Comparator<student>
{
    public int compare(student s1,student s2)
    {
        return s2.name.compareTo(s1.name);
    }
}