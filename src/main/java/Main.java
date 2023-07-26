
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


        String listOfGoods="";
        double summOfGoods= 0.00;
        System.out.println("Введите товар, который хотите добавить в счёт");
        while (true){
            String input = scanner.next();
            if (input.equalsIgnoreCase("завершить")){
                break;
            }
            Good position = new Good();
            position.name = input;
            listOfGoods += position.name + "\n";
            System.out.println("Введите стоимость добавляемого товара ");
            while (!scanner.hasNextDouble() && scanner.hasNext()) {
                System.out.println("некорректные данные, введите еще раз сумму. Вы ввели: " + scanner.next());
            }
            position.value = scanner.nextDouble();
            while (position.value<0){
                System.out.println("Введенное значение некорректно, введите неотрицательную стоимость");
                position.value = scanner.nextDouble();
            }
            summOfGoods+= position.value;
            System.out.println("Товар "+ position.name + " добавлен. Если хотите прекратить добавление товаров, введите команду \"завершить\". Введите новый товар");
        }
        double aveSumm = Calculator.aveSumm(summOfGoods, personCount);
        System.out.println("Добавленные товары:\n" + listOfGoods);
        System.out.println("Сумма на каждого человека будет равна " + Formatting.round(aveSumm) + " " + Formatting.declination(Math.floor(aveSumm)));
    }
}
