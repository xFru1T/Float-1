import java.util.Scanner;
class Float {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print float number for checking on positive/negative/zero: ");
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

