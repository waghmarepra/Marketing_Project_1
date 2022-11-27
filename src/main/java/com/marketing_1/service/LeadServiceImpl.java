package com.marketing_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing_1.Entity.LeadEntity;
import com.marketing_1Repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveLead(LeadEntity leadEntity) {
		leadRepo.save(leadEntity);
		
		

	}

}
