package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;


    public  Error(){
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
