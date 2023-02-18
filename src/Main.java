import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int countre = 0;
        while (number > 0) {
            number /= 10;
            countre++;}
        if (countre == 0) {
            System.out.println(countre + "-Бир орундуу сан");
        }else{
            System.out.println(countre+"-Орундуу сан");
        }
    }
}