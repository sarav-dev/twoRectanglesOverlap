import java.util.*;

class twoRectanglesOverlap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int A = sc.nextInt();
        System.out.println("Enter B: ");
        int B = sc.nextInt();
        System.out.println("Enter C: ");
        int C = sc.nextInt();
        System.out.println("Enter D: ");
        int D = sc.nextInt();
        System.out.println("Enter E: ");
        int E = sc.nextInt();
        System.out.println("Enter F: ");
        int F = sc.nextInt();
        System.out.println("Enter G: ");
        int G = sc.nextInt();
        System.out.println("Enter H: ");
        int H = sc.nextInt();
        System.out.println("Overlapping: " + solve(A,B,C,D,E,F,G,H));
        sc.close();
    }

    public static int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        if (A >= G || B >= H || C <= E || D <= F) return 0;
        else return 1;
    }
}