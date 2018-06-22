package com.oracle.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.oracle.entity.Ader;
@Component
public interface IAderDao {

	int insert(Ader ader);
	List<Ader> find();
	int update(Ader ader);
}
