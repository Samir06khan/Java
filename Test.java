import java.util.*;
class Test{
 int a,b;
double c;

 void func(){
System.out.println("enter value is without arguments");
}

void func(int x,int y){
a=x;
b=y;
System.out.println("The value of a is  " + a + " and The value of b is " + b );
}

 void func(int x,int y,double z){
a=x;
b=y;
c=z;
System.out.println(" the value of a is " + a + " and the value of b is " + b + " and the value of c is" + c);
}

public static void main(String []args){
 Test T=new Test();
 T.func();
 T.func(20,30);
 T.func(20,30,40.40);

}
}