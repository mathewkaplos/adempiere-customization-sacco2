package org.compiere.acct;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.compiere.model.MAcctSchema;

public class Doc_LoanReapayment extends Doc {

	public Doc_LoanReapayment(MAcctSchema[] ass, Class<?> clazz, ResultSet rs, String trxName) {
		super(ass, clazz, rs, "GLJ", trxName);
	}

	@Override
	protected String loadDocumentDetails() {
		System.out.println("11111111111111111");
		return null;
	}

	@Override
	public BigDecimal getBalance() {
		System.out.println("22222222222222222222");
		return null;
	}

	@Override
	public ArrayList<Fact> createFacts(MAcctSchema as) {
		System.out.println("3333333333333333333");
		return null;
	}

}
