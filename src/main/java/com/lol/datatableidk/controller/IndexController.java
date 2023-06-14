package com.lol.datatableidk.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lol.datatableidk.model.Loan;
import com.lol.datatableidk.service.LoanService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping({"/","/index"})
public class IndexController {
	
	private final LoanService loanService;
	
	@GetMapping
	public String main(Model model) {
		List<Loan> loans = loanService.getAllLoans();
		model.addAttribute("loans", loans);
		return "index";
	}

}
