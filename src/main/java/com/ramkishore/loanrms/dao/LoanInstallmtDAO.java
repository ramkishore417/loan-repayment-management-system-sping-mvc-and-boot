package com.ramkishore.loanrms.dao;

import com.ramkishore.loanrms.exception.LoanRepaymentException;
import com.ramkishore.loanrms.model.LoanInstallmentPyt;

import java.util.ArrayList;
import java.util.List;

/*
 * @created 14/02/2023 - 04:24 PM
 * @project loanrms
 * @author RAMKISHORE
 */
public interface LoanInstallmtDAO {
    boolean insertLoanInstallmentPyt(ArrayList<LoanInstallmentPyt> loanInstlmtPyts) throws LoanRepaymentException;
    List<LoanInstallmentPyt> getAllInsertedRecords() throws LoanRepaymentException;
}
