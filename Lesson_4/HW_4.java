
// Задание
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - 
// возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

package Lesson_4;
import java.util.LinkedList;
// 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

public class HW_4 {
   
     
        public static void main(String[] args) {
    
            int[] listMas = {5,3,2,6,7,4,9, 1};
            LinkedList<Integer> linkList = new LinkedList<>();
    
            for (Integer temp : listMas) {
                linkList.add(temp);
            }
            
            int temp = 0;
            while (temp != linkList.size() - 1) {
                linkList.add(linkList.size()-temp, linkList.getFirst());
                linkList.removeFirst();
                temp++;
            }
    
    
            System.out.println("linkList = " + linkList);
    
            
        }
    }   
