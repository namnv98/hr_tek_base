package com.toprate.hr_tek_demo.base.service;

import com.toprate.hr_tek_demo.base.model.BaseEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: namnv
 * Date: 23:18 25/02/2021
 */
public interface GenericService<T extends BaseEntity, K extends Serializable> {

    List<T> getAll();

    T update(T instance);

    T create(T newInstance);

    void delete(T persistentObject);

    void createMany(Collection<T> newInstances);

    void saveMany(Collection<T> instances);

    void updateMany(Collection<T> instances);

    long getRowCount();

    boolean isExist(K k);

    T findById(K k);
}
