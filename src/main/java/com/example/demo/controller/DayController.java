/*package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Day;
import com.example.demo.repository.DayRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class DayController {
	private final DayRepository repository;
	
	@GetMapping("/")
	public String showList(Model model) {
		model.addAttribute("Days",repository.findAll());
		return "index";
	}
	@GetMapping("/add")
	public String addDay(@ModelAttribute Day day) {
		return "form";
	}
	@PostMapping("/process")
	public String process(@Validated@ModelAttribute Day day,BindingResult result) {
		if(result.hasErrors()) {
			return "form";
		}
		repository.save(day);
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public String editDay(@PathVariable Long id,Model model) {
		model.addAttribute("day",repository.findById(id));
		return "form";
	}
	@GetMapping("/delete/{id}")
	public String deleteDay(@PathVariable Long id) {
		repository.deleteById(id);
		return "redirect:/";
	}
	

} */
