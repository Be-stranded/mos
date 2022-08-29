package com.ywj.mos.support.dao;

import com.ywj.mos.support.domian.SmsRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SmsRecordDao extends CrudRepository<SmsRecord, Long> {

    /**
     * 通过日期和手机号找到发送记录
     * @param phone 电话号码
     * @param sendDate 发送时间
     * @return 发送记录
     */
    List<SmsRecord> findByPhoneAndSendDate(Long phone, Integer sendDate);

}
