/*
 * Copyright (c) 2020.
 *
 * Author : Shivam Kumar
 * All rights reserved.
 *
 */

public class AndSpecification<T> implements ISpecification<T>{

    ISpecification first;
    ISpecification second;

    public AndSpecification(ISpecification first, ISpecification second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
