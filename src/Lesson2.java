public class Lesson2 {

        public static void main(String[] args) {
            //Задача №1

            String hi = "                Hello ";
            String world = " WoRld!";
            char newLine = '\n';
            String text = hi.trim() + world.toLowerCase() + newLine;
            System.out.println(text.repeat(3));


            //Задача №2

            double height=1.69;
            int weight = 49;
            double BMI = weight / (height * height);
            System.out.println(BMI);


            //Задача №3

            char[] letters = new char[]{'a', 'b', 'c', 'd', 'e'};
            String str = String.valueOf(letters);
            System.out.println(str);
            System.out.println(str.replaceAll("d", "h"));


            //Задача №4

            String string = "234";
            int newString = Integer.valueOf("234");
            System.out.println(newString + "some_text".length());


            //Задача №5

            int a = 3;
            int b = 5;
            int formula = (a + b) * (a + b);
            System.out.println(formula);
        }
    }



