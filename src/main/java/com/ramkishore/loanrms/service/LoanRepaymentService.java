package com.ramkishore.loanrms.service;

import com.ramkishore.loanrms.exception.LoanRepaymentException;
import com.ramkishore.loanrms.model.LoanInstallmentPyt;
import com.ramkishore.loanrms.model.LoanTemplate;

import java.util.ArrayList;
import java.util.List;

/*
 * @created 14/02/2023 - 04:20 PM
 * @project loanrms
 * @author RAMKISHORE
 */

public interface LoanRepaymentService {

    ArrayList<LoanInstallmentPyt> buildLoanInstallmentPytList(List<String> loanInstPytRecords);
    boolean addLoanInstallmentPytDetails(String inputFeed) throws LoanRepaymentException;
    double calculateDiscountedInstallment(String loanType, double loanAmount, double currentInstallmentAmt);
    ArrayList<LoanTemplate> beforeProcessingInputData(String inputFeed) throws LoanRepaymentException;

}
