/*
 * Copyright (c) 2020.
 *
 * Author : Shivam Kumar
 * All rights reserved.
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Filter<T> implements IFilter<T>{
    @Override
    public List<T> filter(List<T> list, ISpecification<T> spec) {
        List<T> filterList = new ArrayList<T>();
        for(T item: list){
            if(spec.isSatisfied(item)){
                filterList.add(item);
            }
        }
        return filterList;
    }
}
