import java.util.Scanner;
public class Chocolates {
    public static int maxChocolates(int money, int price, int wrap){

        int buy = money / price; // сколько купили за деньги
        int a = buy; // счетчик шоколадок
        int wrappes = buy; // обёртки от купленных

        while (wrappes >= wrap) {
            int free = wrappes / wrap; // новые шоколадки за обёртки
            a += free;
            wrappes = wrappes % wrap + free; // остаток + новые обёртки
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        System.out.println("Введите количество долларов: ");

        int money = sc.nextInt();
        int price = 1;
        int wrap = 3;

        System.out.println("Максимум шоколадок: " + maxChocolates(money, price, wrap));
    }
}