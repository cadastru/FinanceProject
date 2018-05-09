package com.rest.finance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.rest.finance.entitys.AddedMoney;
import com.rest.finance.resourcesinterfaces.AddedMoneyRepository;

@Service
public class AddedMoneyServices {
	
	@Autowired
	private AddedMoneyRepository addedMoneyRepository;
	
	public List<AddedMoney> getAllAddedMoney(){
		List<AddedMoney> addedMoneysList = new ArrayList<>();
		this.addedMoneyRepository.findAll().forEach(addedMoneysList::add);
		
		return addedMoneysList;
	}
	
	
	public void addMoney(AddedMoney money) {
		this.addedMoneyRepository.save(money);
	}
	
	public List<AddedMoney> findBySourceOfAddedMoneyId(Long id){
		List<AddedMoney> moneyList = new ArrayList<>();
		this.addedMoneyRepository.findBySourceOfAddedMoneyId(id).forEach(moneyList::add);
		
		return moneyList;
	}
}
