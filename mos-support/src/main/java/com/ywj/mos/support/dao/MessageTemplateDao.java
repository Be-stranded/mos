package com.ywj.mos.support.dao;

import com.ywj.mos.support.domian.MessageTemplate;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageTemplateDao extends JpaRepository<MessageTemplate, Long> {

    /**
     * 查询 列表（分页)
     * @param deleted  0：未删除 1：删除
     * @param pageable 分页对象
     * @return 分页查询结果
     */
    List<MessageTemplate> findAllByIsDeletedEquals(Integer deleted, Pageable pageable);


    /**
     * 统计未删除的条数
     * @param deleted 是否删除
     * @return 条数
     */
    Long countByIsDeletedEquals(Integer deleted);

}
