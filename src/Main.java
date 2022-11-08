public class Main {
    public static void main(String[] args) {

        System.out.println("Домашка 9 от 07.11.22");
        System.out.println("Домашка 9 от 07.11.22, задание 1, 3:");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("" +
                "");
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("" +
                "");
        System.out.println("Домашка 9 от 07.11.22, задание 2, 3:");
        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            System.out.print(fractional[i] + ", ");
        }
        System.out.println("" +
                "");
        for (int i = 0; i <= 2; i++) {
            System.out.print(fractional[i] + ", ");
        }
        System.out.println("" +
                "");
        System.out.println("Домашка 9 от 07.11.22, задание 4:");
        int[] numbers2 = new int[3];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        for (int i = 0; i <= 2; i++) {
            if (numbers2[i] % 2 != 0) {
                numbers2[i] = numbers2[i] + 1;
            }
            System.out.print(numbers2[i] + ", ");
        }
    }
    }
