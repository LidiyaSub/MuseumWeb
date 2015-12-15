package com.softserveinc.edu.ita.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.softserveinc.edu.ita.dao.ShowpieceDao;
import com.softserveinc.edu.ita.entity.Showpiece;
import com.softserveinc.edu.ita.service.ShowpieceService;

@Service
public class ShowpieceServiceImpl implements ShowpieceService {

	@Autowired
	private ShowpieceDao dao;

	@Transactional
	@Override
	public void saveShowpiece(Showpiece showpiece) {
		dao.save(showpiece);
	}

	@Transactional
	@Override
	public List<Showpiece> getAllShowpieces() {
		return dao.getAll();
	}

	@Transactional
	@Override
	public void updateShowpiece(Showpiece showpiece) {
		dao.update(showpiece);
	}

	@Transactional
	@Override
	public void deleteShowpiece(Long id) {
		dao.delete(findOneById(id));
	}

	@Transactional
	@Override
	public Showpiece findOneById(Long id) {
		return dao.findOneById(id);
	}

	@Override
	public void collectionDefaultModel(Model model) {
		List<String> showpieces = new ArrayList<String>();
		List<Showpiece> list = dao.getAll();
		for (int i = 0; i < list.size(); i++) {
			showpieces.add(list.get(i).getNameShowpiece());
		}
		model.addAttribute("listNameShowpiece", showpieces);

	}

}
