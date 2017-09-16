import java.util.Scanner;
import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        //Ввод чисел массива
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int mass = input.nextInt();
        int chisla[] = new int[mass];
        System.out.print("Введите цифры вашего массива: ");
        for (int x = 0; x < mass; x++) {
            chisla[x] = input.nextInt();
        }
        //Повторение пятерки
        int five = 0;
        for (
                int i = 0;
                i < chisla.length; i++)

        {
            if (chisla[i] == 5) {
                five++;
            }
        }
//минимальное и максимальное значение
        int max = Integer.MIN_VALUE;
        for (
                int y = 0;
                y < chisla.length; y++)

        {
            max = Math.max(max, chisla[y]);
        }

        int min = Integer.MAX_VALUE;
        for (
                int i = 0;
                i < chisla.length; i++)

        {
            min = Math.min(min, chisla[i]);
        }
        //вывод
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Число 5 повторялось " + five + " раз");
        //сартировка
        for (
                int j = 0;
                j < chisla.length; j++)

        {
            for (int i = 0; i < chisla.length - 1; i++) {
                if (chisla[i] > chisla[i + 1]) {
                    int temp = chisla[i];
                    chisla[i] = chisla[i + 1];
                    chisla[i + 1] = temp;
                }
            }
        }
        for (
                int i = 0;
                i < chisla.length; i++)

        {
            System.out.println("№" + i + "=" + chisla[i]);
        }
        //Ищем число которое повторяеться чаще всего
        int[] a2 = new int[chisla.length];//тут считаем повторения
        for (int b = 0; b <= chisla.length -1; b++){
            for (int c = 0; c <= chisla.length-1; c++) {
                if (chisla[b] == chisla[c])
                    a2[b]++;
            }
        }
        int maximum = 0;
        for (int a3 = 0; a3 <= chisla.length-1; a3++){
            if (a2[a3] > maximum)
                maximum = a2[a3];
        }
        System.out.println("Самое повторяющееся число: " + a2[maximum] + " ;" + "Число повторов: " + maximum + " раз");
    }
    }
