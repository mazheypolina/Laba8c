package com.c;

import com.c.data.Wardrobe_of_book;

import java.util.Scanner;

/**@author Mazhey Polina
 * @since JDK 15.0.2
 * @serialData
 * @version
 */


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сколько место шкаф занимает в комнате в квадратных метрах: ");
        double square = scan.nextDouble();
        System.out.println("Введите сколько он может вместить книжек: ");
        int capacity = scan.nextInt();
        System.out.println("Введите сколько в шкафу полок: ");
        int number_shelf = scan.nextInt();
        Wardrobe_of_book wardrobe =  new Wardrobe_of_book(square,number_shelf, capacity);
        wardrobe.accommodation();
        wardrobe.openDoorOfWardrobe();
        wardrobe.cleaning();
        wardrobe.show();

        scan.close();
    }
}
