public class Codigo6 {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        for (int i = 0; i < 20; i++) {
            numbers[i] = (int) (Math.random() * 381) + 20;
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("¿Qué números quiere resaltar? ");
        System.out.println("1. los múltiplos de 5\n2. los múltiplos de 7: ");
        int opcion = Integer.parseInt(System.console().readLine());

        int multiplo = (opcion == 1) ? 5 : 7;

        for (int number : numbers) {
            if (number % multiplo == 0) {
                System.out.print("[" + number + "] ");
            } else {
                System.out.print(number + " ");
            }
        }
    }
}