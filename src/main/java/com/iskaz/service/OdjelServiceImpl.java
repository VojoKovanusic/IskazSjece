package com.iskaz.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iskaz.model.Odjel;
import com.iskaz.repository.OdjelDao;

@Transactional
@Service
public class OdjelServiceImpl implements OdjelService {
@Autowired
OdjelDao odjelDao;

	@Override
	public void addOdjel(int brOdjela) {

		odjelDao.save(new Odjel(brOdjela));
	}

	@Override
	public Odjel getOdjel(int brOdjela) {
		return odjelDao.findByBrojOdjela(brOdjela);
	}

	@Override
	public void deleteOdjel(int brOdjela) {
		odjelDao.deleteByBrojOdjela(brOdjela);
	 
	}

	@Override
	public void updateOdjel(int brOdjela, int newbBrOdjela) {
		Odjel odjel=getOdjel(brOdjela);
		odjel.setBrojOdjela(newbBrOdjela);
		odjelDao.save(odjel);
	}

}
