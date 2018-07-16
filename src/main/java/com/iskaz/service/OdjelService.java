package com.iskaz.service;

import org.springframework.stereotype.Service;

import com.iskaz.model.Odjel;

@Service
public interface OdjelService {

void addOdjel(int brOdjela);

Odjel getOdjel(int brOdjela);

void deleteOdjel(int brOdjela);

void updateOdjel(int brOdjela,int newbBrOdjela);

}
