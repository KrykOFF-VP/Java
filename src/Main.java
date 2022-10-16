import java.text.SimpleDateFormat;
import java.util.Date;
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
                    tusk1();
                    return;

                //case 2:
                //Task2();
                //break;

                //case 3:
                //Task3();
                //break;


                default:
                    System.out.print("Укажите значение от 0 до 3");
                    break;
            }
            scan.close();
        }
    }
    public static void tusk1() {
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
}
