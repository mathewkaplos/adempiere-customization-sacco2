package org.sacco.process.strategy;

import java.util.List;

import org.compiere.model.LoanSchedule;
import org.compiere.model.SLoan;


public interface InterestMode {

	public List<LoanSchedule> createSchedules(SLoan loan );
}
