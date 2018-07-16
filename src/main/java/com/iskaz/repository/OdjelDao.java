package com.iskaz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iskaz.model.Odjel;

@Repository
public interface OdjelDao  extends CrudRepository<Odjel, Integer>{
 
	Odjel findByBrojOdjela(int brOdjela);

	void deleteByBrojOdjela(int brOdjela);
 

}
