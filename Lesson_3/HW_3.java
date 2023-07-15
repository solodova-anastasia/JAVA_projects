package HW_1;
// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.*;

public class HW_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(22, 23, 55, 44,  6, 9, 18, 77, 4, 37, 17, 3, 8));
        System.out.println("Исходный список:" + list);
        delete_even(list);
        System.out.println("удалили нечетные: " + list);
        System.out.println("Максимальное значение:" + Collections.max(list));
        System.out.println("Минимальное значение:" + Collections.min(list));
        System.out.println("Среднее значение:" + average(list));
    }

    static void delete_even(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
//            System.out.println("разм списка: "+list.size());
//            System.out.println("элемент: " + list.get(i) + ", %2: " + (list.get(i) % 2));
            if ((list.get(i) % 2) != 0) {
                list.remove(i);
                i = i - 1;
            }
        }
    }
    static Integer average(List<Integer> list){
        int summ = 0;
        for (int i = 0; i < list.size(); i++) {
            summ += list.get(i);
        }
        return summ/list.size();

    }
}






// import java.util.Scanner;
// public class HW_1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }
