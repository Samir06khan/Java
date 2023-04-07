import java.util.*;
class Copyconstructor1{
    
 int a,b;
double c;

 Copyconstructor1(){
System.out.println("enter value is without arguments");
}

Copyconstructor1(int x, int y){
a=x;
b=y;
System.out.println("The value of a is " + a + " and The value of b is " + b );
}

  Copyconstructor1(int x, int y, double z){
a=x;
b=y;
c=z;
System.out.println(" the value of a is " + a + " and the value of b is " + b + " and the value of c is" + c);
}
Copyconstructor1(Copyconstructor1 C){
    a=C.a;
    b=C.b;
    System.out.println("The value of a is " + a + " and The value of b is " + b );
}
public static void main(String []args){

 Copyconstructor1 T1=new Copyconstructor1();
 Copyconstructor1 T2=new Copyconstructor1(20,30);
 Copyconstructor1 T3=new Copyconstructor1(20,30,40.40);
 Copyconstructor1 T4=new Copyconstructor1(T2);
}
}


