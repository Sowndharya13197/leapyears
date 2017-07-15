import java.io.*;
import java.util.*;
public class leapyearss {
    public static void main(String args[])
          {
              Scanner s=new Scanner(System.in);
              int n,m;
              n=s.nextInt();
              m=s.nextInt();
              for(int i=n;i<=m;i++)
               {
                   if(i%4==0)
                   {
                       System.out.println(i);
                   }    
               }   
                  
          }  
    
}
