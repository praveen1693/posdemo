package com.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pos.dao.MenuMasterDAO;
import com.pos.dao.TaxDAO;
import com.pos.model.MenuMaster;
import com.pos.model.Taxes;
@Service("posservice")
@Transactional
public class POSServiceImpl implements POSService{

	@Autowired
	private MenuMasterDAO mmdao;
	
	@Autowired
	private TaxDAO taxdao;
	
	@Override
	public void addMenuMaster(MenuMaster menumaster) {
		mmdao.addMenuMaster(menumaster);
		
	}

	@Override
	public List<MenuMaster> findMenuMasters() {
		
		return mmdao.findMenuMasters();
	}

	@Override
	public void addTaxes(Taxes tax) {
		taxdao.addTaxes(tax);
		
	}

	@Override
	public List<Taxes> findTaxes() {
		return taxdao.findTaxes();
	}

}
