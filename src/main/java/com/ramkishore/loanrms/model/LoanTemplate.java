package com.ramkishore.loanrms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/*
 * @created 14/02/2023 - 06:21 PM
 * @project loanrms
 * @author RAMKISHORE
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LoanTemplate {
    String pytId;
    String customerId;
    String loanId;
    String customerName;
    String loanType;
    String installmentAmtInRs;
    String dueDate;
    String actualPytDate;
    String revisedInstallmentInRs;
    String loanAmount;
}
