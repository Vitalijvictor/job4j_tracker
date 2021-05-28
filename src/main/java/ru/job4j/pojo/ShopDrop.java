package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        /*if (index < 0 || index > products.length-1)
            throw new IndexOutOfBoundsException();*/

        for (int i = index; i < products.length; i++) {
            if (i == products.length-1)
                products[i] = null;
            else
                products[i] = products[i+1];
        }

        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Fruit", 8);
        int index = 2;
        Product[] rsl = ShopDrop.delete(products, index);
    }
}