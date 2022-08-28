package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ticket")
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "firstProcedure", procedureName = "GET_TICKETS"),
		@NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "get_category", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "T_CATEGORY", type = String.class)}) })
public class Ticket {

	@Id
	private int id;
	private int amount;
	private String category;
}
