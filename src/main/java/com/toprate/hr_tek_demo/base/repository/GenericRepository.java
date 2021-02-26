package com.toprate.hr_tek_demo.base.repository;

import com.toprate.hr_tek_demo.base.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: namnv
 * Date: 23:17 25/02/2021
 */
@NoRepositoryBean
public interface GenericRepository<T extends BaseEntity, K extends Serializable> extends
        JpaSpecificationExecutor<T>, JpaRepository<T, K>, PagingAndSortingRepository<T, K> {
}