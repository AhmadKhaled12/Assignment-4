package bonus;
import java.util.Scanner;
public class Bonus
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the department name:");
        String d1_name = input.nextLine();
        System.out.println("Enter the Staff position name:");
        String p1_name = input.nextLine();
        
        Search sh1 = new Search();
        Department d1 = sh1.get_department(d1_name);
        Staff s1 = d1.get_Staff(p1_name);
        s1.details();
        
        System.out.println();
        System.out.println();
        
        System.out.println("Enter the department name:");
        String d2_name = input.nextLine();
        System.out.println("Enter the Staff position name:");
        String p2_name = input.nextLine();
        
        Search sh2 = new Search();
        Department d2 = sh2.get_department(d2_name);
        Staff s2 = d2.get_Staff(p2_name);
        s2.details();
        
        System.out.println();
        System.out.println();
        
        System.out.println("Enter the department name:");
        String d3_name = input.nextLine();
        System.out.println("Enter the Staff position name:");
        String p3_name = input.nextLine();
        
        Search sh3 = new Search();
        Department d3 = sh3.get_department(d3_name);
        Staff s3 = d3.get_Staff(p3_name);
        s3.details();
    }
    
}
