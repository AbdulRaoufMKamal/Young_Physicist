import java.util.Scanner;

public class Young_Physicist {

    public static String equilibrium(int sumX, int sumY, int sumZ) {
        if(sumX == 0 && sumY == 0 && sumZ == 0) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y,z;
        int sumX = 0, sumY = 0, sumZ = 0;
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();
            sumX += x;
            sumY += y;
            sumZ += z;
        }

        String ans = equilibrium(sumX,sumY,sumZ);
        System.out.print(ans);
    }
}
