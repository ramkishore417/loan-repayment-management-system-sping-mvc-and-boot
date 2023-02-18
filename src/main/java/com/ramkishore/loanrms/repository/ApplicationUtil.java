package com.ramkishore.loanrms.repository;

import com.ramkishore.loanrms.exception.LoanRepaymentException;

import java.util.Date;
import java.util.List;

/*
 * @created 14/02/2023 - 04:21 PM
 * @project loanrms
 * @author RAMKISHORE
 */
public interface ApplicationUtil {
    List<String> readFile(String inputfeed) throws LoanRepaymentException;

    //Coverts Java util Date to Java SQL Date
    java.sql.Date utilToSqlDateConverter(Date utilDate);

    //Converts String Date to Java util Date
    Date stringToDateConverter(String stringDate);

    boolean checkIfDateOfPytIsLessThanDueDate(Date dateOfPyt, Date dueDate);
}
