package org.eop.mybatis.spring.transaction.sample;

import javax.transaction.UserTransaction;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author lixinjie
 */
public class CodeTransaction {

	private JtaTransactionManager transactionManager;
	
	private TransactionTemplate transactionTemplate;
	
	public void trans1() {
		UserTransaction userTx = transactionManager.getUserTransaction();
		try {
			userTx.begin();
			//对数据源1操作...
			
			//对数据源2操作...
			
			userTx.commit();
		} catch (Exception e) {
			try {
				userTx.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void trans2() {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				try {
					//对数据源1操作...
					
					//对数据源2操作...
					
				} catch (Exception e) {
					status.setRollbackOnly();
				}
			}
			
		});
	}
	
	public void trans3() {
		transactionTemplate.execute(new TransactionCallback<Object>() {
			
			@Override
			public Object doInTransaction(TransactionStatus status) {
				try {
					//对数据源1操作...
					
					//对数据源2操作...
					
					return null;
				} catch (Exception e) {
					status.setRollbackOnly();
				}
				return null;
			}
		});
	}
}
