package com.oracle.service;

import java.util.List;

import com.oracle.entity.Ader;

public interface AderService {

	int insert(Ader ader);
	List<Ader> find();
	int update(Ader ader);
}
