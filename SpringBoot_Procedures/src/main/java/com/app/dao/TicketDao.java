package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.model.Ticket;

@Repository
public class TicketDao {

	@Autowired
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Ticket> getTickets() {
		return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Ticket> get_category(String category) {
		return em.createNamedStoredProcedureQuery("secondProcedure").setParameter("T_CATEGORY", category)
				.getResultList();
	}

}
