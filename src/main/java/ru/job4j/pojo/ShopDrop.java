package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;

        return products;
    }

        public static void main(String[] args) {
            Product[] product = new Product[5];
            product[0] = new Product("Bread", 4);
            product[1] = new Product("Egg", 10);
            product[2] = new Product("Milk", 2);
            product[3] = new Product("Fish", 3);
            product[4] = new Product("Fruit", 8);
            int index = 2;
            Product[] rsl = ShopDrop.delete(product, index);
        }
    }
