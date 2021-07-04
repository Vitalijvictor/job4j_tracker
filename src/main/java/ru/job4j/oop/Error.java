/**
*1. Создайте класс Error, определите в нем три поля: boolean active, int
 * status, String message;

*2. Добавьте в этом классе 2 конструктора: явный конструктор по умолчанию,
 * конструктор с тремя параметрами, который будет инициализировать поля переданными значениями;

*3. По аналогии с описанием добавьте метод, который будет выводить в консоль
 * содержимое полей;

*4. Добавьте метод main(), в котором будете создавать объект с помощью явного
 *  конструктора по умолчанию, а также несколько объектов с помощью конструктора с параметрами. Вызовите на созданных объектах метод, добавленный в пункте 3;
 */

package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
        active = true;
        status = 300;
        message = "Game over";
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
    }

    public void printInfo() {
        System.out.println("Активность: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }
}
