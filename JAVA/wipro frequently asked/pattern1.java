/*To print the pattern like
 for n=3
the program should print
1 1 1 2
3 2 2 2
3 3 3 4*/

public class MyClass {
    public static void main(String args[]) {
        int n=1,i,j=1,a=5;
while(n<=a){
if(n%2!=0){
for(i=1;i<=a;i++)
System.out.print(n);

System.out.print(++j);
System.out.println();
}
else{
System.out.print(++j);
for(i=1;i<=a;i++)
System.out.print(n);
System.out.println();
}
n++;
    }}
}
