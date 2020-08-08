/*
 * Copyright (c) 2020.
 *
 * Author : Shivam Kumar
 * All rights reserved.
 *
 */

public class ColorSpecification implements ISpecification<Product> {

    Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}
