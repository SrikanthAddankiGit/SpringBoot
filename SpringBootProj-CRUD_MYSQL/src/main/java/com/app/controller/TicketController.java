package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.TicketDao;
import com.app.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketDao dao;
	
	@PostMapping
	public String bookTicket(@RequestBody List<Ticket> tickets) {
		dao.saveAll(tickets);
		return "Ticket is booked" + tickets.size();
	}
	
	@GetMapping
	public List<Ticket> getTickets(List<Ticket> tickets){
		return (List<Ticket>) dao.findAll();
	}
}
