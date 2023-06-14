package com.lol.datatableidk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lol.datatableidk.model.Loan;
import com.lol.datatableidk.repository.LoanRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoanService {
	private final LoanRepository loanRepo;
	
	public List<Loan> getAllLoans(){
		return loanRepo.findAll();
	}

}
