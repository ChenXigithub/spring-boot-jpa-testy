package com.chenxi.study.controller.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * @Author chenxi
 * @mail xi1.chen@changhong.com
 * @Date 17-6-29
 */
@NoRepositoryBean
public interface BaseJpaDao<T> extends JpaRepository<T, Serializable>, JpaSpecificationExecutor<T>, PagingAndSortingRepository<T, Serializable> {

}