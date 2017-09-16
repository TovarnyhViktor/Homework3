import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        /*System.out.print("Введите размер массива: ");
        int mass = input.nextInt();
        int chisla[] = new int[mass];*/
        //ввод
        System.out.print("Введите цифры вашего массива через пробел: ");
        String line = input.nextLine();
        String[] mass=line.split(" ");
        int chisla[]=new int[mass.length];
        for (int x = 0; x < mass.length; x++) {
            chisla[x] = Integer.parseInt(mass[x]);
        }
        //Ищем пятерку
        int five = 0;
        for (int i = 0; i < chisla.length; i++) {
            if (chisla[i] == 5) {
                five++;
            }
        }
        //Минимум/максимум
        int max = Integer.MIN_VALUE;
        for (int y = 0; y < chisla.length; y++) {
            max = Math.max(max, chisla[y]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < chisla.length; i++) {
            min = Math.min(min, chisla[i]);
        }
        //вывод
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Число 5 повторялось " + five + " раз");
        //пузырь
        for (int j = 0; j < chisla.length; j++) {
            for (int i = 0; i < chisla.length - 1; i++) {
                if (chisla[i] > chisla[i + 1]) {
                    int temp = chisla[i];
                    chisla[i] = chisla[i + 1];
                    chisla[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < chisla.length; i++) {
            System.out.println("№" + i + "=" + chisla[i]);
        }
    }
}