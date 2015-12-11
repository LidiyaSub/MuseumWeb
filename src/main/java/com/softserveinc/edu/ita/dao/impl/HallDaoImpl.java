package com.softserveinc.edu.ita.dao.impl;

import org.springframework.stereotype.Repository;

import com.softserveinc.edu.ita.dao.HallDao;
import com.softserveinc.edu.ita.entity.Hall;

@Repository
public class HallDaoImpl extends GeneralDaoImpl<Hall, Long> implements HallDao {

}
