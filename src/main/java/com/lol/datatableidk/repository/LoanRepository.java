package com.lol.datatableidk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lol.datatableidk.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

}
