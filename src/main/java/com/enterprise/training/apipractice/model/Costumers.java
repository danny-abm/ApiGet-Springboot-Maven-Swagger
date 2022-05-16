package com.enterprise.training.apipractice.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Costumers {

	private String firstname;
	private String lastname;
	private String id;
	private String account;
	private String accountType;
	private BigDecimal balance;
}

