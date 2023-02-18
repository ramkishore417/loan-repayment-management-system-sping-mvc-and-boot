package com.ramkishore.loanrms.dao;

/*
 * @created 02/02/2023 - 07:48 PM
 * @project loan-repayment-management-system
 * @author RAMKISHORE
 */

import com.ramkishore.loanrms.exception.LoanRepaymentException;
import com.ramkishore.loanrms.model.LoanInstallmentPyt;
import com.ramkishore.loanrms.repository.ApplicationUtil;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LoanInstallmtDAOImpl implements LoanInstallmtDAO {

    private final ApplicationUtil applicationUtil;
    private final JdbcTemplate jdbcTemplate;

    public LoanInstallmtDAOImpl(JdbcTemplate jdbcTemplate, ApplicationUtil applicationUtil) {
        this.jdbcTemplate = jdbcTemplate;
        this.applicationUtil = applicationUtil;
    }
    @Override
    public boolean insertLoanInstallmentPyt(ArrayList<LoanInstallmentPyt> loanInstlmtPyts) throws LoanRepaymentException {
        boolean recordsAdded = false;

        // TYPE YOUR CODE HERE
        jdbcTemplate.update("truncate table LoanInstallment");

        for(LoanInstallmentPyt record : loanInstlmtPyts) {
            java.sql.Date sqlDueDate = applicationUtil.utilToSqlDateConverter(record.getDueDate());
            java.sql.Date sqlActualPayDate = applicationUtil.utilToSqlDateConverter(record.getActualPytDate());

            jdbcTemplate.update("insert into LoanInstallment values(?,?,?,?,?,?,?,?,?,?)",
                    record.getPytId(),
                    record.getCustomerId(),
                    record.getLoanId(),
                    record.getCustomerName(),
                    record.getLoanType(),
                    record.getInstallmentAmtInRs(),
                    sqlDueDate,
                    sqlActualPayDate,
                    record.getRevisedInstallmentInRs(),
                    record.getLoanAmount());
            recordsAdded = true;
        }

        return recordsAdded;
    }

    @Override
    public List<LoanInstallmentPyt> getAllInsertedRecords() throws LoanRepaymentException {

        return jdbcTemplate.query("select * from LoanInstallment", new RowMapper<LoanInstallmentPyt>() {
            @Override
            public LoanInstallmentPyt mapRow(ResultSet rs, int rowNum) throws SQLException {
                LoanInstallmentPyt record = new LoanInstallmentPyt();
                record.setPytId(rs.getString(1));
                record.setCustomerId(rs.getString(2));
                record.setLoanId(rs.getString(3));
                record.setCustomerName(rs.getString(4));
                record.setLoanType(rs.getString(5));
                record.setInstallmentAmtInRs(rs.getDouble(6));
                record.setDueDate(rs.getDate(7));
                record.setActualPytDate(rs.getDate(8));
                record.setRevisedInstallmentInRs(rs.getDouble(9));
                record.setLoanAmount(rs.getDouble(10));

                return record;
            }
        });
    }
}


