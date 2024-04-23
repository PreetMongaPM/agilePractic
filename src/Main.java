import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String [] args)
    {
        int a,b,c;
        System.out.println("Enter the coefficients a,b,c of quadratic equations");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int D = b*b - 4*a*c;

        if(D>0)
        {
            System.out.println("Both roots are distinct :"+((-b+sqrt(D))/2*a)+" and "+(-b-sqrt(D))/2*a));
        }
        else if(D==0)
        {
            System.out.println("Both roots are equal :"+((-b+sqrt(D))/2*a)+" and "+(-b-sqrt(D))/2*a));
        }
        else{
            System.out.println("Roots are imaginary");
        }

    }
}