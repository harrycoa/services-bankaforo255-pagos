package com.app.aforo255.pagos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.aforo255.pagos.dao.Transaction_pDao;
import com.app.aforo255.pagos.domain.Transaction_p;


@Service
public class Transaction_pServiceImpl implements ITransaction_pService {
	
	@Autowired
	private Transaction_pDao transaction_pDao;
	
	@Override
	@Transactional
	public Transaction_p save(Transaction_p transaction_p) {
		return transaction_pDao.save(transaction_p);
	}
	
}
