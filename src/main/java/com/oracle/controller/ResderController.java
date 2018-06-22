package com.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.entity.Ader;
import com.oracle.service.AderService;

@Controller
public class ResderController {

	@Autowired
	private AderService as;
	
	@RequestMapping("find")
	public void find() {
		List<Ader> list=as.find();
	}
	
	@RequestMapping("insert")
	public void insert() {
		Ader ader=new Ader();
		ader.setBankname("bankname");
		ader.setName("name");
		as.insert(ader);
	}
	
}
