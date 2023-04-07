import java.util.*;



class Calcu{
    int a,b;
    void add(int x,int y){
        a=x;
        b=y;
        System.out.println("The sum of a  and b is" +(a+b));
    }

    void Subtract(int x,int y){
        a=x;
        b=y;
        System.out.println("The Subtract of a  and b is"+ (a-b));
    }
    void Multiply(int x,int y){
        a=x;
        b=y;
        System.out.println("The Multiply of a and b is" +(a*b));
    }
    void Divide(int x,int y){
        a=x;
        b=y;
        System.out.println("The Divide of a and b is" +(a/b));
    }

    class Calc{
        public static void main(String[]args){
            int a,b;
            Calcu obj=new Calcu();
            obj.add(20,40);
            obj.Subtract(45,40);
            obj.Multiply(30,10);
            obj.Divide(40,20);
    
        }
    }
}
