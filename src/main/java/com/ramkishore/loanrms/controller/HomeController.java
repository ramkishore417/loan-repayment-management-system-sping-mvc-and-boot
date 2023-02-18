package com.ramkishore.loanrms.controller;

import com.ramkishore.loanrms.dao.LoanInstallmtDAO;
import com.ramkishore.loanrms.exception.LoanRepaymentException;
import com.ramkishore.loanrms.model.LoanInstallmentPyt;
import com.ramkishore.loanrms.model.LoanTemplate;
import com.ramkishore.loanrms.service.LoanRepaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/*
 * @created 14/02/2023 - 03:57 PM
 * @project loanrms
 * @author RAMKISHORE
 */

@Controller
public class HomeController {

    private final LoanRepaymentService loanRepaymentService;
    private final LoanInstallmtDAO loanInstallmtDAO;

    public HomeController(LoanRepaymentService loanRepaymentService, LoanInstallmtDAO loanInstallmtDAO) {
        this.loanRepaymentService = loanRepaymentService;
        this.loanInstallmtDAO = loanInstallmtDAO;
    }

    @GetMapping("/")
    public ModelAndView inputText() throws LoanRepaymentException {

        ModelAndView mv=new ModelAndView("input");
        ArrayList<LoanTemplate> unProcessedDataList =  loanRepaymentService.beforeProcessingInputData("src/main/resources/inputfeed.txt");
        mv.addObject("unProcessedDataList", unProcessedDataList);
        return mv;
    }

    @GetMapping("/output")
    public ModelAndView parsedText() throws LoanRepaymentException {

        ModelAndView mv=new ModelAndView("output");
        boolean isRecordsAdded = loanRepaymentService.addLoanInstallmentPytDetails("src/main/resources/inputfeed.txt");

        if(isRecordsAdded){
			List<LoanInstallmentPyt> processedDataList = loanInstallmtDAO.getAllInsertedRecords();
            mv.addObject("processedDataList",processedDataList);
//            processedDataList.forEach(System.out::println);
		}
        return mv;
    }


}
