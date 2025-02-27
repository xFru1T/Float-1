import java.util.Scanner;
class Long1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print float number for checking on positive/negative/zero: ");
        float num = scanner.nextFloat();
        if (num == 0) {
            System.out.println("is number zero");
            }
        if (num < 0) {
            System.out.println("is number negative");
            }
        if (num > 0) {
            System.out.println("is number positive");
            }
        }
    }

