package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Day")
public class Day {
	
	@Column(name="id")
	private Long id;
	
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="business_Date")
	private LocalDate business_Date;
	
	
	
	private List<CalcDate> calcDates;

}
