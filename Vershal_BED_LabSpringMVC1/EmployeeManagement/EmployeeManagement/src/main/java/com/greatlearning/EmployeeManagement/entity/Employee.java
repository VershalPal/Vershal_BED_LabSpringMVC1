package com.greatlearning.EmployeeManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENTATION
	
	private int id;

	private String firstName;

	private String lastName;

	private String email;
}