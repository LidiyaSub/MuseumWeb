package com.softserveinc.edu.ita.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserveinc.edu.ita.dao.ScheduleDao;
import com.softserveinc.edu.ita.entity.Schedule;

@Repository
public class ScheduleDaoImpl extends GeneralDaoImpl<Schedule, Long> implements ScheduleDao {

}
