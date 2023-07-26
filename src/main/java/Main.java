
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество человек, на которых необходимо разделить счет");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt() && scanner.hasNext()) {
            System.out.println("некорректные данные, введите еще раз количество персон. Вы ввели: " + scanner.next());
        }
        int personCount = scanner.nextInt();

        while (personCount<=1){
            System.out.println("Введенное значение неверно, введите количество человек больше 1");
            personCount = scanner.nextInt();
        }

        String name="";
        double value;
        String listOfGoods="";
        double summOfGoods= 0.00;
        System.out.println("Введите товар, который хотите добавить в счёт");
        while (true){
            name = scanner.next();
            if (name.equalsIgnoreCase("завершить")){
                break;
            }
            listOfGoods+=name + "\n";
            System.out.println("Введите стоимость доавляемого товара ");
            while (!scanner.hasNextDouble() && scanner.hasNext()) {
                System.out.println("некорректные данные, введите еще раз сумму. Вы ввели: " + scanner.next());
            }
            value = scanner.nextDouble();

            if (value < 0){
                System.out.println("некорректные данные, введите еще раз:");
                value = scanner.nextDouble();
            }
            summOfGoods+=value;
            System.out.println("Товар "+ name + " добавлен. Если хотите прекратить добавление товаров, введите команду \"завершить\". Введите новый товар");
        }

        System.out.println(listOfGoods);
        System.out.println(summOfGoods);
        //Good.listOfGoods();

        }
        //проверяем корректность введенных данных(должно быть > 1)
        //System.out.println("Добавленные товары:/n" + list + "Сумма, котору должен заплатить каждый
        // человек:" + summ + formatting.rubles(summ)" );// печатаем итоговый список товаров и
        // сумму, которую должен заплатить каждый клиент, форматируя рубли

}
