package com.softserveinc.edu.ita.service;

import java.util.List;

import com.softserveinc.edu.ita.entity.Showpiece;

public interface ShowpieceService {
	
	public void saveShowpiece(Showpiece showpiece);

	public List<Showpiece> getAllShowpieces();

	public void updateShowpiece(Showpiece showpiece);

	public void deleteShowpiece(Long id);

	public Showpiece findOneById(Long id);

}
