package com.ramkishore.loanrms.model;

/*
 * @created 02/02/2023 - 07:49 PM
 * @project loan-repayment-management-system
 * @author RAMKISHORE
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class LoanInstallmentPyt {

    String pytId;
    String customerId;
    String loanId;
    String customerName;
    String loanType;
    double installmentAmtInRs;
    Date dueDate;
    Date actualPytDate;
    double revisedInstallmentInRs;
    double loanAmount;

}

