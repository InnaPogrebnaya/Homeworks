package Homework2;

public class Task_1_2_3 {

    public static void main(String[] args) {
        //Базовый уровень
        //Задание №1 - Написать цикл, который выводит через пробел 100 числел с приставкой "а"
        //Ожидаемый результат: 1а 2а 3а .. 100а
        System.out.println("Задание №1:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "а ");
        }
        System.out.println();


        //Задание №2
        System.out.println("Задание №2:");
        int childAge = 12;
        if (childAge <= 6) {
            System.out.println("Пошёл в детский сад");
        } else if (childAge > 6 && childAge <= 11) {
            System.out.println("Пошёл в младшую школу");
        } else if (childAge > 11 && childAge <= 17) {
            System.out.println("Пошёл в среднюю школу");
        } else { System.out.println("Пошёл в университет");

        }
        //Задание №3

        System.out.println("Задание №3:");

        boolean chicken = false;
        boolean vegetables = false;
        boolean sauce = false;
        boolean croutons = false;
        boolean sausage = false;
        boolean eggs = false;

        if (chicken && vegetables && sauce && croutons){
            System.out.println("Приготовлен салат Цезарь");
        }  else if (vegetables && eggs && (sausage || chicken)){
            System.out.println("Приготовлен салат Оливье");
        }  else if (vegetables) {
            System.out.println("Приготовлен овощной салат");
        } else {
            System.out.println("Ингридиентов недостаточно");
        }

    }
}



