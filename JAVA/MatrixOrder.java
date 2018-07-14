import java.util.*;
public class MatrixOrder {
    public static void main(String args[]) {
       int a[][]=new int[3][3];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               a[i][j]=sc.nextInt(); 
           }
       }
       int temp;
       for(int j=0;j<3;j++){
           for(int i=0;i<3;i++){
               for(int k=0;k<3;k++){
                   if(j%2==0)
                   {
                      // System.out.print(a[k][j]+" ");
                       if(a[i][j]<a[k][j])
                       {
                           temp=a[i][j];
                           a[i][j]=a[k][j];
                           a[k][j]=temp;
                       }
                   }
                   else{
                       if(a[i][j]>a[k][j])
                       {
                           temp=a[i][j];
                           a[i][j]=a[k][j];
                           a[k][j]=temp;
                       }
                   }
               }
           }
       }
      for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
    }
}
