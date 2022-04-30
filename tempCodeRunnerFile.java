import java.util.*;

public class Assignmentlooping {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 10 == 0)
                continue;
            if (i > 100)
                break;
        }
        sc.close();
    }
}
