import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;


public class Main
{
    public static void main(String args[] ) {

        while (true) {
            System.out.println("Мои задачи");
            System.out.println("=================================");
            System.out.println("1 -> Задание 1");
            System.out.println("2 -> Задание 2");
            System.out.println("3 -> Задание 3");
            System.out.println("0 -> Завершение работы приложения");
            System.out.println("=================================");

            Scanner scan = new Scanner(System.in);
            System.out.printf("Введите номер задачи: ");
            var number = scan.nextInt();

            switch (number)
            {
                case 0:
                    System.out.print("Завершение работы приложения");
                    return;

                case 1:
                    Tusk1();
                    return;

                case 2:
                    Tusk2();
                    return;

                case 3:
                     Tusk3();
                     return;


                default:
                    System.out.print("Укажите значение от 0 до 3");
                    break;
            }
            scan.close();
        }
    }
    public static void Tusk1() {
        SimpleDateFormat df = new SimpleDateFormat("HH.mm");
        var time = Double.parseDouble(df.format(new Date()));
        Scanner iSkanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iSkanner.next();

        if (time >= 5.00 && time <= 11.59)
        {
            System.out.println("Доброе утро, " +name);
        }
        else if (time >= 12.00 && time <= 17.59)
        {
            System.out.println("Добрый день " +name);
        }
        else if (time >= 18.00 &&  time <= 22.59)
        {
            System.out.println("Добрый вечер " +name);
        }
        else
        {
            System.out.println("Доброй ночи " +name);
        }
        iSkanner.close();

    }
    public static void Tusk2() {
        HashSet<Integer> used = new HashSet<>();
        double[] array= new double[]{1.1, 0.1, 1.1};
        for(int i = 0; i < array.length; i++){
            if(used.contains(array[i])){
                continue;
            } else {
                used.add((int) array[i]);
            }
            ArrayList<Integer> positions = new ArrayList<>();
            positions.add(i);
            for(int j = i + 1; j < array.length; j++){

                if(array[i] == array[j]){
                    positions.add(j);
                }
            }
            System.out.print(array[i] + " встречается в позициях " );
            for(Integer p : positions){
                System.out.print(p + ", ");
            }
            System.out.println();
        }

    }
    public static void Tusk3()
    {
        int k = 3;
        int[] b = {3,2,2,3,1,2,5,3,5,3};
        int[] a = b;

        for(int i =0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        transArr(a, b, k);
    }
    public static void transArr (int[]a, int[]b, int k){
        int j =0;
        for(int i = 0; i<b.length; i++){
            if (b[i] != k) {
                a[j]=b[i];
                j++;
            }

        }
        for(int i = j; i<a.length; i++){
            a[i]=k;
        }
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}



