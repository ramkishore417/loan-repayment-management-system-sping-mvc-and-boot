package com.ramkishore.loanrms;

import com.ramkishore.loanrms.exception.LoanRepaymentException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanRepaymentManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanRepaymentManagementSystemApplication.class, args);

//		boolean isRecordsAdded = loanRepaymentService.addLoanInstallmentPytDetails("src/inputfeed.txt");
//
//		if(isRecordsAdded){
//			List<LoanInstallmentPyt> insertedRecordsData = loanInstallmtDAO.getAllInsertedRecords();
//			insertedRecordsData.forEach(System.out::println);
//		}
	}

}
