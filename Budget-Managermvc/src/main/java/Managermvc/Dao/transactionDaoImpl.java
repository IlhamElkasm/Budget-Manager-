package Managermvc.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import Managermvc.Metier.transaction;

@Component
public class transactionDaoImpl implements  transactionDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//create
	@Transactional
	public void createtransaction(transaction trans) {
		
		this.hibernateTemplate.save(trans);
		
	}

}
