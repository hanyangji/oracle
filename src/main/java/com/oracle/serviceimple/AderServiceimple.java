package com.oracle.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.dao.IAderDao;
import com.oracle.entity.Ader;
import com.oracle.service.AderService;
@Service
public class AderServiceimple implements AderService {

	@Autowired
	private IAderDao ad;
	
	@Override
	public int insert(Ader ader) {
		return ad.insert(ader);
	}

	@Override
	public List<Ader> find() {
		return ad.find();
	}

	@Override
	public int update(Ader ader) {
		return ad.update(ader);
	}

}
