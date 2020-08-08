/*
 * Copyright (c) 2020.
 *
 * Author : Shivam Kumar
 * All rights reserved.
 *
 */


import java.util.List;

public interface IFilter<T> {
    List<T> filter(List<T> list, ISpecification<T> spec);
}
