public class Main {
    public static void main(String[] args)
    {// Задание 1.1
        System.out.println("Задание 1.1");
        int [] products = new int [3];
        products[0] = 1;
        products[1] = 2;
        products[2] = 3;
        int breadProduct = products[0];
        int bunProduct = products[1];
        int bagelProduct = products[2];
        System.out.println(breadProduct);
        System.out.println(bunProduct);
        System.out.println(bagelProduct);
        System.out.println(products[0]);
        //Задание 1.2
        System.out.println("Задание 1.2");
        double [] numbers = {1.57, 7.654, 9.986};
        numbers[0] = 1.57;
        numbers[1] = 7.654;
        numbers[2] = 9.986;
        double pencil = numbers[0];
        double pen = numbers[1];
        double ruler = numbers[2];
        System.out.println(pencil);
        System.out.println(pen);
        System.out.println(ruler);
        System.out.println(numbers[2]);
        //Задание 1.2
        System.out.println("Задание 1.3");
        int [] liters = {10, 5, 8, 3};
        liters[0] = 10;
        liters[1] = 5;
        liters[2] = 8;
        liters[3] = 3;
        int beer = liters[0];
        int gin = liters[1];
        int tonic = liters[2];
        int soda = liters[3];
        System.out.println(beer);
        System.out.println(gin);
        System.out.println(tonic);
        System.out.println(soda);
        System.out.println(liters[2]);
        //Задание 2
        System.out.println("Задание 2");
        System.out.print(+breadProduct+","+bunProduct+","+bagelProduct);
        System.out.println();
        System.out.print(+pencil+","+pen+","+ruler);
        System.out.println();
        System.out.print(+beer+","+gin+","+tonic+","+soda);
        System.out.println();
        //Задание 3
        System.out.println("Задание 3");
        System.out.print(+bagelProduct+","+bunProduct+","+breadProduct);
        System.out.println();
        System.out.print(+ruler+","+pen+","+pencil);
        System.out.println();
        System.out.print(+soda+","+tonic+","+gin+","+beer);
        System.out.println();
        //Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < 3; i++) {
           i = i+1;
            System.out.println(products[i]);
        }








    }
}