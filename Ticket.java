import java.util.*;
class Test{
    static List<String>b=new ArrayList<String>();
    static List<String>e=new ArrayList<String>();
    static List<Integer>g=new ArrayList<Integer>();
    static List<Integer>x=new ArrayList<Integer>();
    static Scanner s=new Scanner(System.in);
    static List<Integer>p=new ArrayList<Integer>();
    static int Totalnumberofseats=5,Ticketcost=100;
    static int d=0,u=0,c=0,t=1;
    public static void main(String[]args)
    {
        System.out.println("Welcome to ticket Booking");
        System.out.print("1.Ticket Booking\n2.Ticket Cancelling\n");
        System.out.print("Press 1 or 2");
        int a=s.nextInt();
        if(a==1)
        {
            ticket(a);
        }
        else if(a==2)
        {
            cancel(b,e,g,d);
        }
    }
    public static void ticket(int a)
    {
        System.out.println("Total Number of Seats: "+(Totalnumberofseats-d));
        System.out.print("Enter the Name of the User: ");
        String h=s.next();
        b.add(h);
        List<Integer>o=new ArrayList<Integer>();
        System.out.print("How many Tickets to be Booked: ");
        c=s.nextInt();
        for(int i=0;i<c;i++)
        {
            System.out.print("Enter the name of the Passanger: ");
            String f=s.next();
            e.add(f);
            g.add(d);
            d++;
            o.add(d);
        }
        System.out.println("S.No\t\t\t\tName\t\t\t\tSeats  \t\t\t\tNumber Of Seats\t\t\tCost");
        System.out.println(t+"\t\t\t\t"+h+"\t\t\t\t"+o.get(0)+"-"+o.get(c-1)+"\t\t\t\t"+c+"\t\t\t\t"+(c*Ticketcost));
        System.out.println("Your Seats has been Booked and the seat numbers are"+o);
        System.out.println("Thank You For the Booking Enjoy the Trip......");
        System.out.print("Enter a number to Begin the Process: ");
        int z=s.nextInt();
        stand(z);
    }
    public static void cancel(List<String>b,List<String> e,List<Integer>g,int d)
    {
        if(d==0)
        {
            System.out.println("No Seats Has Been Booked...");
        }
        else
        {
            System.out.print("Enter the Name of the user you given: ");
            String l=s.next();
            for(int i=0;i<b.size();i++)
            {
                if(l.equals(b.get(i)))
                {
                    System.out.print("Enter the how many seats want to cancel: ");
                    int q=s.nextInt();
                    for(int j=1;j<=q;j++)
                    {
                        System.out.print("Enter the seat number :");
                        int r=s.nextInt();
                        for(int k=0;i<p.size();i++) {
                            if(r==p.size()) {
                                p.add(r);
                            }
                            else if(r==0)
                            {
                                q=q-1;
                            }
                            else {
                                System.out.println("Check the seat number you entered");
                            }
                        }
                    }
                    System.out.println("The amount "+(q*Ticketcost)+" will be returned in 5 Working Days");
                    break;
                }
            }
            System.out.print("Enter a number to Begin the Process: ");
            int z=s.nextInt();
            stand(z);
        }
    }
    public static void waiting(List<Integer>p)
    {
        System.out.println("Number of Seats Available: "+p.size());
        d=d-p.size();
        List<Integer>o=new ArrayList<Integer>();
        System.out.println("Enter the Name of the User: ");
        String h=s.next();
        b.add(h);
        System.out.print("Enter the number of seats: ");
        int w=s.nextInt();
        if(w>p.size())
        {
            System.out.println("If the seats available we will be notify...");
        }
        else {
            boolean y = p.isEmpty();
            if (y == true) {
                System.out.println("If any seats available we will be notify...");
                x.add(w);
            } else {
                for (int i = 0; i < w; i++) {
                    System.out.print("Enter the name of the Passanger: ");
                    String f = s.next();
                    e.add(f);
                    g.add(p.get(i));
                    d++;
                    o.add(p.get(i));
                }
                System.out.println("S.No\t\t\t\tName\t\t\t\tSeats  \t\t\t\tNumber Of Seats\t\t\tCost");
                System.out.println(t + "\t\t\t\t" + h + "\t\t\t\t" + o.get(0) + "-" + o.get(w - 1) + "\t\t\t\t" + w + "\t\t\t\t" + (c * Ticketcost));
                System.out.println("Your Seats has been Booked and the seat numbers are" + o);
                System.out.println("Thank You For the Booking Enjoy the Trip......");
            }
        }
        System.out.print("Enter a number to Begin the Process: ");
        int z=s.nextInt();
        stand(z);

    }
    public static void stand(int z)
    {
        System.out.println("Welcome to ticket Booking");
        System.out.print("1.Ticket Booking\n2.Ticket Cancelling\n");
        System.out.print("Press 1 or 2");
        int m=s.nextInt();
        if(m==1)
        {
            u++;
            if(d==Totalnumberofseats)
            {
                waiting(p);

            }
            ticket(m);
        }
        else if(m==2)
        {
            cancel(b,e,g,d);
        }
    }
}
