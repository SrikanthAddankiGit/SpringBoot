package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.TicketDao;
import com.app.model.Ticket;

@RestController
public class TicketController {
	
	@Autowired
	private TicketDao dao;
	
	@GetMapping("/findTicket")
	public List<Ticket> findTicket(){
		return dao.getTickets();
		}
	
	@GetMapping("/findbyCategory/{category}")
	public List<Ticket> findByCategory(@PathVariable String category){
		return dao.get_category(category);
	}
}
