/*
1. Создать класс ru.job4j.oop.Battery. в нем должно быть поле private int load.
2. Создать метод public void exchange(Battery another). Этот метод должен списывать заряд из батареи у кого вызывали метод exchange и добавить к объекту another.
 */

package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

}
