import java.util.*;
class Constructor1{
    
 int a,b;
double c;

 Constructor1(){
System.out.println("enter value is without arguments");
}

Constructor1(int x, int y){
a=x;
b=y;
System.out.println("The value of a is " + a + " and The value of b is " + b );
}

  Constructor1(int x, int y, double z){
a=x;
b=y;
c=z;
System.out.println(" the value of a is " + a + " and the value of b is " + b + " and the value of c is" + c);
}

public static void main(String []args){

 Constructor1 T1=new Constructor1();
 Constructor1 T2=new Constructor1(20,30);
 Constructor1 T3=new Constructor1(20,30,40.40);
 
}
}

