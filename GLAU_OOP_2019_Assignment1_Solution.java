import java.util.*;
class GLAU_OOP_2019_Assignment1_Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double g=9.8;
        double time=0.0;
        double speed=0.0;
        double distance=0.0;
        System.out.println("Input the calculated time ");
        time=sc.nextDouble();
        speed=g*time;
        distance=(g*Math.pow(time,2))/2;
        System.out.println("The speed of the object at "+time+" seconds after its release is "+speed+" and the distance the object has travelled in the "+time+" seconds after the relase is "+distance);
    }
}



