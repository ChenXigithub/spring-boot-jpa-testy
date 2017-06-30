package com.chenxi.study.controller.test;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author chenxi
 * @mail xi1.chen@changhong.com
 * @Date 17-6-29
 */
public interface AgeDao extends BaseJpaDao<AgeEntity>{
    @Modifying
    @Query("update AgeEntity m set m.value=:value where m.id=:id")
    void update(@Param("id") int id,@Param("value") int value);
}
