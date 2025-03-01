import java.util.Scanner;

public class Showroom implements utility {
    String sname;
    String sadd;
    String mname;
    int totemp;
    int totcar=0;


    @Override
    public void get_details() {
     System.out.println("SHOWROOM NAME : "+sname);   
     System.out.println("SHOWROOM ADDRESS : "+sadd);   
     System.out.println("MANAGER NAME : "+mname);   
     System.out.println("TOTAL EMPLOYEES : "+totemp);   
     System.out.println("TOTAL CARS IN STOCK : "+totcar);   
     
    }
    @Override
    public void set_details() {
        Scanner sc= new Scanner(System.in);
        System.out.println("=====================*****WELCOME TO SHOWROOM MANAGEMENT SYSTEM*****=====================");
        System.out.println("=============================*****ENTER SHOWROOM DETAILS*****============================");
        System.out.println();
        System.out.print(("SHOWROOM NAME : "));
        sname= sc.nextLine();
        System.out.print(("SHOWROOM ADDRESS : "));
        sadd= sc.nextLine();
        System.out.print(("MANAGER NAME : "));
        mname= sc.nextLine();
        System.out.print(("TOTAL EMPLOYEES : "));
        totemp= sc.nextInt();
        System.out.print(("TOTAL CARS IN STOCK : "));
        totcar= sc.nextInt();
    }
    
}
