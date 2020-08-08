/*
 * Copyright (c) 2020.
 *
 * Author : Shivam Kumar
 * All rights reserved.
 *
 */

public class SizeSpecification implements ISpecification<Product>{
    Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}
