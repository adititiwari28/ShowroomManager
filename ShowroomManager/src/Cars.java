import java.util.*;


public class Cars extends Showroom implements utility {
    String cname;
    String ccolor;
    String cfueltype ;
    int cprice;
    String ctype;
    //String ctransmission;



    @Override
    public void get_details() {
        System.out.println("NAME : "+cname);
        System.out.println("COLOUR : "+ccolor);
        System.out.println("FUEL TYPE : "+cfueltype);
        System.out.println("PRICE : "+cprice);
        System.out.println("TYPE : "+ctype);
        //System.out.println("TRANSMISSION"+ctransmission);
    }
    @Override
    public void set_details() {
        Scanner sc= new Scanner(System.in);
        System.out.println("=====================*****WELCOME TO SHOWROOM MANAGEMENT SYSTEM*****=====================");
        System.out.println("===============================*****ENTER CAR DETAILS*****===============================");
        System.out.println();
        System.out.print(("CAR NAME : "));
        cname=sc.nextLine();
        System.out.print(("CAR COLOUR : "));
        ccolor=sc.nextLine();
        System.out.print(("CAR FUEL TYPE(Petrol/Diesel) : "));
        cfueltype=sc.nextLine();
        System.out.print(("CAR PRICE : "));
        cprice=sc.nextInt();
        System.out.print(("CAR TYPE : "));
        ctype=sc.nextLine();
        System.out.println();
       
    }

    

    
}
