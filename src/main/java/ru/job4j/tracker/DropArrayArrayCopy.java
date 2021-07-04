/*
System.arraycopy(source, startPos, dist, distPos, length);
source - массив откуда нужно скопировать элементы начиная с позиции startPos
и до позиции startPos + length.

length - сколько элементов взять начиная от startPos.

dist - массив, куда вставить скопированные элементы от source. Этот метод может
работать с одним массивом для source и dist.

distPos - начиная с какого элемента вставлять скопированные ячейки.
 */

package ru.job4j.tracker;

import java.util.Arrays;

public class DropArrayArrayCopy {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", "Fedor"};
        System.arraycopy(names, 2, names, 1, 3);
        System.out.println(Arrays.toString(names));
    }
}