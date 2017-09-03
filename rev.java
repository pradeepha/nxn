import java.util.*;
class rev
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    String s=scan.nextLine();
    String arr[]=s.split(" ");
    for(int i=0;i<arr.length;i++)
    {
      StringBuffer sb=(StringBuffer)arr[i];
      System.out.print(sb.reverse());
      if((i!=arr.length-1))
      System.out.print(" ");
    }
  }
}
