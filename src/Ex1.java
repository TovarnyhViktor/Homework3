import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int mass = input.nextInt();
        int chisla[] = new int[mass];
        System.out.print("Введите цифры вашего массива: ");
        for (int x = 0; x < mass; x++) {
            chisla[x] = input.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int y = 0; y < chisla.length; y++) {
            max = Math.max(max, chisla[y]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < chisla.length; i++) {
            min = Math.min(min, chisla[i]);
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.print ("Элементы массива :");
        for (int i = 0; i < mass; i++) {
            System.out.print (" " + chisla[i]);
        }
        System.out.println();
        }
    }
