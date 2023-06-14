package com.lol.datatableidk.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Loan {
	@Id
	@Column(name = "LOAN_NO")
	public Integer loanNo;
	
	@Column(name = "LOAN_TYPE")
	public Integer loanType;
	
	@Column(name = "LOAN_TYPE_DESC")
	public String loanTypeDesc;
	
	@Column(name = "CLIENT_NO")
	public Long clientNo;
	
	@Column(name = "STATUS")
	public Integer status;
	
	@Column(name = "STATUS_DESC")
	public String statusDesc;
	
	@Column(name = "CLIENT_NAME")
	public String clientName;
	
	@Column(name = "ORIG_LOAN_AMT")
	public Double origLoanAmt;
	
	@Column(name = "TOTAL_OUTSTANDING_AMT")
	public Double totalOutstandingAmt;
    
	@Column(name = "JAN_MONTH_REPAYMENT")
	public Double janMonthRepayment;

    @Column(name = "FEB_MONTH_REPAYMENT")
    public Double febMonthRepayment;

    @Column(name = "MAR_MONTH_REPAYMENT")
    public Double marMonthRepayment;

    @Column(name = "APR_MONTH_REPAYMENT")
    public Double aprMonthRepayment;
    
    @Column(name = "MAY_MONTH_REPAYMENT")
    public Double mayMonthRepayment;

    @Column(name = "JUN_MONTH_REPAYMENT")
    public Double junMonthRepayment;

    @Column(name = "JUL_MONTH_REPAYMENT")
    public Double julMonthRepayment;

    @Column(name = "AUG_MONTH_REPAYMENT")
    public Double augMonthRepayment;

    @Column(name = "SEPT_MONTH_REPAYMENT")
    public Double septMonthRepayment;

    @Column(name = "OCT_MONTH_REPAYMENT")
    public Double octMonthRepayment;

    @Column(name = "NOV_MONTH_REPAYMENT")
    public Double novMonthRepayment;

    @Column(name = "DEC_MONTH_REPAYMENT")
    public Double decMonthRepayment;
	
    @Column(name = "LOAN_ARREAS")
	public Double loanArreas;
	
    @Column(name = "INT_RATE")
	public Double intRate;
	
    @Column(name = "IDNO")
	public String idNo;
	
    @Column(name = "EMP_STATUS")
	public String empStatus;
	
    @Column(name = "TELEPHONENUMBER")
	public String telephoneNumber;
	
    @Column(name = "E01")
	public String e01;
	
    @Column(name = "E02")
	public String e02;
	
    @Column(name = "POSTALADDRESS")
	public String postalAddress;
	
    @Column(name = "DAYS_AGED")
	public Integer daysAged;

}
