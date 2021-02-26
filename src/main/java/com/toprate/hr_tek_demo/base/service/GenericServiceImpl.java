package com.toprate.hr_tek_demo.base.service;

import com.toprate.hr_tek_demo.base.model.BaseEntity;
import com.toprate.hr_tek_demo.base.repository.GenericRepository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: namnv
 * Date: 00:08 26/02/2021
 */
@Transactional
public abstract class GenericServiceImpl<T extends BaseEntity, K extends Serializable> implements GenericService<T, K> {

    private GenericRepository<T, K> repository;

    public GenericServiceImpl(GenericRepository<T, K> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public T update(T instances) {
        return repository.save(instances);
    }

    @Override
    public T create(T newInstances) {
        return repository.save(newInstances);
    }

    @Override
    public void delete(T persistentObject) {
        repository.delete(persistentObject);
    }

    @Override
    public T findById(Serializable id) {
        return repository.getOne((K) id);
    }

    @Override
    public boolean isExist(Serializable id) {
        return repository.existsById((K) id);
    }

    @Override
    public long getRowCount() {
        return repository.count();
    }

    @Override
    public void createMany(Collection<T> newInstances) {
        saveMany(newInstances);
    }

    @Override
    public void saveMany(Collection<T> instances) {
        repository.saveAll(instances);
    }

    @Override
    public void updateMany(Collection<T> instances) {
        saveMany(instances);
    }
}
