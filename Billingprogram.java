import java.util.*;
import java.text.*;
class Main
{
    static List < Integer > b = new ArrayList < Integer > ();
    static List < String > c = new ArrayList < String > ();
    static List < Integer > d = new ArrayList < Integer > ();
    static List < Integer > e = new ArrayList < Integer > ();
    static int arr[]={100,200,300,400,500,600};
    public static  void main (String[]args)
    {
    System.out.println("\t\t\t\t\t\t\t\tINVOICE");
    System.out.println("\t\t\t\t\t\t\t  KEERTHI SUPER MARKET");
    SimpleDateFormat t = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat u = new SimpleDateFormat("HH:mm:ss");
    Date date = new Date();  
    System.out.println("Date: "+t.format(date));
    System.out.println("Time: "+u.format(date));
    Scanner s = new Scanner (System.in);
    System.out.print("Enter the SalesmanID: ");
    int a=s.nextInt();
    salesmanid(a);
    }
    public static void salesmanid(int a)
    {
       
        for(int i=0;i<arr.length;i++)
        {
        if(a==arr[i])
        {
            bill(a);
            break;
        }
        else if(a!=arr[i])
        {
            System.out.println();
            System.out.print("Enter the SalesManID Again: ");
            Scanner s=new Scanner(System.in);
            int p=s.nextInt();
            salesmanid(p);
            break;
        }
    }
   
    }
  public static void bill (int a)
  {
    Scanner s = new Scanner (System.in);
    System.out.print("Enter Item Id: ");
    b.add (s.nextInt ());
    System.out.print("Enter Item Name: ");
    c.add (s.next ());
    System.out.print("Enter Item Quantity: ");
    d.add (s.nextInt ());
    System.out.print("Enter Item Cost: ");
    e.add (s.nextInt ());
    System.out.print("Did another Item has been bought Y or N: ");
    char f = s.next ().charAt (0);
    if (f == 'y' || f == 'Y')
      {
        bill (f);
      }
    else if (f == 'n' || f == 'N')
      {
        billss(b,c,d,e);
      }
  }
  public static void billss(List < Integer > b, List < String > c,List < Integer > d, List < Integer > e)
  {
      Scanner s=new Scanner(System.in);
      System.out.print("Any Item want to be removed Y or N:");
      char m=s.next().charAt(0);
      if(m=='Y'||m=='y')
      {
          System.out.print("Enter Item Id: ");
          int n=s.nextInt();
          int o=b.indexOf(n);
          b.remove(o);
          c.remove(o);
          d.remove(o);
          e.remove(o);
          billss(b,c,d,e);
      }
      else{
          bills(b,c,d,e);
      }
  }
 
  public static void bills (List < Integer > b, List < String > c,List < Integer > d, List < Integer > e)
  {
    int f[]=new int[d.size()];
    for (int i = 0; i < d.size (); i++)
      {
         f[i]=d.get(i)*e.get(i);
      }
      Scanner s=new Scanner(System.in);
      System.out.print("Any Item still want to be added Y or N: ");
      char a=s.next().charAt(0);
      if(a=='Y'||a=='y')
      {
          int l=1;
          bill(l);
      }
      else if(a=='n'|| a=='N')
      {
      billsss(b,c,d,e,f);
      }
  }
  public static void billsss(List < Integer > b, List < String > c,List < Integer > d, List < Integer > e,int f[])
  {
      int g=0,v=1;
      Scanner s=new Scanner(System.in);
      System.out.println("S.No\t\tItem ID \t\tItem Name\t\tQuantity\t\tCost\t\t Total Cost");
      for(int i=0;i<d.size();i++)
      {
          System.out.println(v+"\t\t"+b.get(i)+" \t\t\t"+c.get(i)+"\t\t\t"+d.get(i)+"\t\t\t"+e.get(i)+"\t\t"+f[i]);
          v++;
      }
      for(int i=0;i<f.length;i++)
      {
          g+=f[i];
      }
      System.out.println();
      System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal:  "+g);
      System.out.print("Want to Print the Bill Y or N:");
      char w=s.next().charAt(0);
      if(w=='Y'||w=='y')
      {
          System.out.println("Printing Bill.........Printed");
          System.out.println("................................................................................................................................");
      }
      else
      {
          System.out.println("................................................................................................................................");
      }
      
  }
}
