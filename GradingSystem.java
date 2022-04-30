import java.util.*;

public class GradingSystem {
    public static void main(String[] args) {
        int maths, chemistry, physics;
        Scanner sc = new Scanner(System.in);
        maths = sc.nextInt();
        chemistry = sc.nextInt();
        physics = sc.nextInt();
        if (physics <= 35 || chemistry <= 35 || maths <= 35) {
            System.out.println("Failed");
        } else {
            int avg = (maths + chemistry + physics) / 3;
            if (avg <= 59)
                System.out.println("C");
            else if (avg <= 69)
                System.out.println("B");
            else
                System.out.println("A");
        }
        sc.close();
    }

}
