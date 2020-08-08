/*
 * Copyright (c) 2020.
 *
 * Author : Shivam Kumar
 * All rights reserved.
 *
 */

public class Product {
    Color color;
    String name;
    Size size;

    public Product(Color color, String name, Size size) {
        this.color = color;
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
