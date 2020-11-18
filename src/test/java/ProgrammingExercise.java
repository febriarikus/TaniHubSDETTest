import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("input : ");

        int number = input.nextInt();
        fivaa(number);
    }

    public static void fivaa(int n) {
        for(int i = n; i>0; i--) {
            for(int j=0; j<2; j++) {
                System.out.print(i-1);
            }
            for(int k=0; k<i; k++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}