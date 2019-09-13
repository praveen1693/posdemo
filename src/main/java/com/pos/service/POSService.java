package com.pos.service;

import java.util.List;

import com.pos.model.MenuMaster;
import com.pos.model.Taxes;

public interface POSService {

	void addMenuMaster(MenuMaster menumaster);
	
	List<MenuMaster> findMenuMasters();
	
	void addTaxes(Taxes tax);
	
	List<Taxes> findTaxes();
}
