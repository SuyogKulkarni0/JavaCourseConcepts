import java.util.*;

public class AssignmentPrime {
    public static void main(String[] args) {
        int num;
        boolean setflag = true;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0)
                setflag = false;
        }
        if (setflag)
            System.out.println("Number given " + num + " is a Prime Number");
        else
            System.out.println("Number given " + num + " is not a prime Number");
        sc.close();
    }

}
