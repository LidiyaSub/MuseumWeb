package com.softserveinc.edu.ita.service;

import java.util.List;

import com.softserveinc.edu.ita.entity.Excursion;

public interface ExcursionService {

	public void saveExcursion(Excursion excursion);

	public List<Excursion> getAllExcursions();

	public void updateExcursion(Excursion excursion);

	public void deleteExcursion(Long id);

	public Excursion findOneById(Long id);

}
