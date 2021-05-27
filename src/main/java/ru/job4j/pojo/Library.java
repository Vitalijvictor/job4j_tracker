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
        Book cleanCode = new Book("Clean code", 421);
        Book[] bk =  new Book[4];

        bk[0] = misery;
        bk[1] = richDad;
        bk[2] = firetales;
        bk[3] = cleanCode;

        for (int index = 0; index < bk.length; index++) {
            Book b = bk[index];
            System.out.println(b.getName() + " - " + b.getNumberOfPages());
        }

        Book temp = bk[0];
        bk[0] = bk[3];
        bk[3] = temp;

        for (int index = 0; index < bk.length; index++) {
            if (bk[index].getName() == "Clean code") {
                System.out.println(bk[index].getName() + " - " + bk[index].getNumberOfPages());
            }
            /*if (bk[index] == cleanCode) {
                System.out.println(bk[index].getName() + " - " + bk[index].getNumberOfPages());
            }*/
        }
    }
}
