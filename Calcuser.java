import java.util.*;


class Operator{
  int a,b;
    int add(int x,int y){
        a=x;
        b=y;
        return a+b;
    }

    int Subtract(int x,int y){
        a=x;
        b=y;
        return a-b;
    }
    int Multi(int x,int y){
        a=x;
        b=y;
        return a*b;
    }
    int Divi(int x,int y){
        a=x;
        b=y;
        return a/b;
    }

}  
    class Calcuser{
        public static void main(String []args){
            int a,b;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter the value of a nand b");
            a=in.nextInt();
            b=in.nextInt();
    
           Operator obj=new Operator();
    
           System.out.println("The sum of a  and b is"+ obj.add(a, b));
           System.out.println("The Subtract of a  and b is" + obj.Subtract(a, b));
           System.out.println("The Multiply of a and b is" + obj.Multi(a, b));
           System.out.println("The Divide of a and b is" + obj.Divi(a, b));
        }
    }



