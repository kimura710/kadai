/*package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;

@Data
@Entity
public class DayAndCalcDate {
	
	@Column(name="id")
	private Long id;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="Date")
	private LocalDate Date;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="calcID")
	private String calcID;
	
	@Column(name="name")
	private String name;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="result")
	private LocalDate result;
	
	@Column(name="year")
	private int year;
	
	@Column(name="month")
	private int month;
	
	@Column(name="day")
	private int day;

}*/
