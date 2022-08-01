package com.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
