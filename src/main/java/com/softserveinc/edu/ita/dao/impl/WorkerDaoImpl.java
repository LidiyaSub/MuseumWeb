package com.softserveinc.edu.ita.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserveinc.edu.ita.dao.WorkerDao;
import com.softserveinc.edu.ita.entity.Worker;

@Repository
public class WorkerDaoImpl extends GeneralDaoImpl<Worker, Long> implements WorkerDao {

}
