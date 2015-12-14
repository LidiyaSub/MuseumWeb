package com.softserveinc.edu.ita.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.softserveinc.edu.ita.dao.ShowpieceDao;
import com.softserveinc.edu.ita.entity.Showpiece;

@Repository
public class ShowpieceDaoImpl extends GeneralDaoImpl<Showpiece, Long> implements ShowpieceDao{


	@Override
	public void collectionDefaultModel(Model model) {
		List<String> showpieces = new ArrayList<String>();
		List<Showpiece> list = getAll();
		for (int i = 0; i < list.size(); i++) {
			showpieces.add(list.get(i).getNameShowpiece());
		}
		model.addAttribute("listNameShowpiece", showpieces);
		
	}

}
