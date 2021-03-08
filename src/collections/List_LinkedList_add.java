package collections;

import java.util.*;

public class List_LinkedList_add {
    public static void main(String[] args) {
      //  sort();
        sortCollect();

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Doymadi ");
        list1.add("Helva ");
        list1.add("Veli ");
        list1.add("ama ");
        list1.add("Yedi ");
        list1.add("Helva");

        System.out.println("linkedlist keeps insertion order, and allows duplicate values");
        Iterator itr = list1.iterator();
        while (itr.hasNext()) {
        //    System.out.print(itr.next());
        }
    }

        public static void sort() {
           List<Integer> numbers=new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                numbers.add((int)(Math.random() * 100));
            }
           // System.out.println(numbers); // ramdom iki basamakli 15 sayi verir

            Collections.sort(numbers);
            System.out.println(numbers); // Collection kucukten buyuge siralar

            Collections.reverse(numbers);
            System.out.println(numbers); // geri sayim yaptirir

            Collections.sort(numbers, Collections.reverseOrder());
            System.out.println(numbers); // kucukten buyuge siralar sonrada reverse yapar


            Collections.sort(numbers, Comparator.naturalOrder());
            System.out.println(numbers); // arrayi ilk verilen haline getirir
        }
        public static void sortCollect () {
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(8, 0, 0, 1, 4, 5, 77, 2, 3, 8));
            System.out.println(list);

            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);

            Collections.sort(list, Comparator.reverseOrder());
            System.out.println(list);

            Collections.sort(list);
            System.out.println(list);

        }
    }

