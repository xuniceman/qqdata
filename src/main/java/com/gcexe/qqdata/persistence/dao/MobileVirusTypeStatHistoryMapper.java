package com.gcexe.qqdata.persistence.dao;

import com.gcexe.qqdata.persistence.entity.MobileVirusTypeStatHistoryKey;

public interface MobileVirusTypeStatHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mobile_virus_type_stat_history
     *
     * @mbggenerated Fri Apr 20 15:49:32 CST 2018
     */
    int deleteByPrimaryKey(MobileVirusTypeStatHistoryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mobile_virus_type_stat_history
     *
     * @mbggenerated Fri Apr 20 15:49:32 CST 2018
     */
    int insert(MobileVirusTypeStatHistoryKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mobile_virus_type_stat_history
     *
     * @mbggenerated Fri Apr 20 15:49:32 CST 2018
     */
    int insertSelective(MobileVirusTypeStatHistoryKey record);
}