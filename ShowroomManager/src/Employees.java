
import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility {

    String empid;
    String ename;
    int eage;
    String edept;
    @Override
    public void get_details() {
       System.out.println("EMPLOYEE ID : "+empid);
       System.out.println("EMPLOYEE NAME : "+ename);
       System.out.println("EMPLOYEE AGE : "+eage);
       System.out.println("EMPLOYEE DEPARTMENT :"+edept);
       System.out.println("SHOWROOM NAME : "+sname);
    }
    @Override
    public void set_details() {
       Scanner sc= new Scanner(System.in);
       UUID uuid = UUID.randomUUID();
       empid= String.valueOf(uuid);
       System.out.println("=====================*****WELCOME TO SHOWROOM MANAGEMENT SYSTEM*****=====================");
       System.out.println("=============================*****ENTER EMPLOYEE DETAILS*****============================");
       System.out.println();
       System.out.print(("EMPLOYEE NAME : "));
       ename=sc.nextLine();
       System.out.print(("EMPLOYEE AGE : "));
       eage=sc.nextInt();
       System.out.print(("EMPLOYEE DEPARTMENT : "));
       edept=sc.nextLine();
       System.out.print(("SHOWROOM NAME : "));
       sname=sc.nextLine();


    }
    
    
}
