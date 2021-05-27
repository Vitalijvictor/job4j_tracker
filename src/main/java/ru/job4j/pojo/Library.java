/*
int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
 */

package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book misery = new Book("Misery", 294);
        Book richDad = new Book("Rich DAd", 345);
        Book firetales = new Book("Storybook", 165);
        Book island = new Book("Island", 421);
        Book[] cleanCode = new Book[4];
        cleanCode[0] = misery;
        cleanCode[1] = richDad;
        cleanCode[2] = firetales;
        cleanCode[3] = island;
        for (int index = 0; index < cleanCode.length; index++) {
            Book bk = cleanCode[index];
            System.out.println(bk.getName() + " - " + bk.getNumberOfPages());
        }

        for (int index = 0; index < cleanCode.length; index++) {
            Book temp = cleanCode[0];
            cleanCode[0] = cleanCode[3];
            cleanCode[3] = temp;
            Book b = cleanCode[index];
            System.out.println(b.getName() + " - " + b.getNumberOfPages());
        }
    }
}
