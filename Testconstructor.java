import java.util.*;
public class Constructor{
    
 int a,b;
double c;

 void Constructor(){
System.out.println("enter value is without arguments");
}

void Constructor (int x, int y){
a=x;
b=y;
System.out.println("The value of " + a + " and The value of b is " + b );
}

 void Constructor (int x, int y, double z){
a=x;
b=y;
c=z;
System.out.println(" the value of a is " + a + " and the value of b is " + b + " and the value of c is" + c);
}

public static void main(String []args){
 Constructor T1=new Constructor();
 T1.Constructor();
 T1.Constructor(20,30);
 T1.Constructor(20,30,40.40);

}
}

