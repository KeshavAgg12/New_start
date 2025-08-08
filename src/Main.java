import java.util.Scanner;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of following subjects to get percentage: a");
        System.out.print("Maths:");
        float maths= sc.nextFloat();
        System.out.print("physics:");
        float phy= sc.nextFloat();
        System.out.print("chemistry:");
        float chem=sc.nextFloat();
        System.out.print("English:");
        float eng=sc.nextFloat();
        System.out.print("programming:");
        float progm=sc.nextFloat();
        float total=maths+phy+chem+progm+eng;
        System.out.print("Total is:");
        System.out.println(total);
        float per=total/5;
        System.out.print("Percentage is :");
        System.out.print(per+"%");
    }
}
