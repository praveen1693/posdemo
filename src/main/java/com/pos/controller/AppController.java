package com.pos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pos.model.Establishment;
import com.pos.model.Floor;
import com.pos.model.L1menu;
import com.pos.model.L2menu;
import com.pos.model.L3menu;
import com.pos.model.Tables;
import com.pos.model.Taxes;
import com.pos.model.Users;



@Controller
@RequestMapping("/")
public class AppController {

	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "index";
	}

	@RequestMapping(value = { "/establishment"}, method = RequestMethod.GET)
	public String establishmentPage(ModelMap model) {
		Establishment establishment = new Establishment();
		model.addAttribute("establishment", establishment);
		return "establishment";
	}
	
	@RequestMapping(value = { "/floor"}, method = RequestMethod.GET)
	public String floorPage(ModelMap model) {
		Floor floor = new Floor();
		model.addAttribute("floor", floor);
		return "floor";
	}
	
	@RequestMapping(value = { "/users"}, method = RequestMethod.GET)
	public String usersPage(ModelMap model) {
		Users users = new Users();
		model.addAttribute("users", users);
		return "users";
	}

	@RequestMapping(value = { "/menu"}, method = RequestMethod.GET)
	public String menuPage(ModelMap model) {
		return "menu";
	}
	
	@RequestMapping(value = { "/l1menu"}, method = RequestMethod.GET)
	public String l1menuPage(ModelMap model) {
		L1menu l1menu = new L1menu();
		model.addAttribute("l1menu", l1menu);
		return "l1menu";
	}
	
	@RequestMapping(value = { "/l2menu"}, method = RequestMethod.GET)
	public String l2menuPage(ModelMap model) {
		L2menu l2menu = new L2menu();
		model.addAttribute("l2menu", l2menu);
		return "l2menu";
	}
	
	@RequestMapping(value = { "/l3menu"}, method = RequestMethod.GET)
	public String l3menuPage(ModelMap model) {
		L3menu l3menu = new L3menu();
		model.addAttribute("l3menu", l3menu);
		return "l3menu";
	}
	
	@RequestMapping(value = { "/tables"}, method = RequestMethod.GET)
	public String tablesPage(ModelMap model) {
		Tables tables = new Tables();
		model.addAttribute("tables", tables);
		return "tables";
	}
	
	@RequestMapping(value = { "/taxes"}, method = RequestMethod.GET)
	public String taxesPage(ModelMap model) {
		Taxes taxes =new Taxes();
		model.addAttribute("taxes", taxes);
		return "taxes";
	}
}