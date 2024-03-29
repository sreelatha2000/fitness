package com.branchservice.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.branchservice.entity.Branch;
import com.branchservice.repository.BranchRepository;
import com.branchservice.service.BranchService;

@Service
public class BranchServiceImpl implements BranchService {

	@Autowired
	BranchRepository branchRepository;

	@Override
	public void save(Branch branch) {
		branchRepository.save(branch);

	}

	@Override
	public Branch get(Long paymentId) {
		
		return branchRepository.findById(paymentId).orElseThrow(
				() -> new IllegalArgumentException("Patient not found with id-" + paymentId));
	}

	@Override
	public Branch deleteById(Long paymentId) {
		
		return null;	

}



	 
	 @Transactional
public void updateEntity(Long paymentId, String paymentMode) {
	Branch branch = branchRepository.findById(paymentId).orElse(null);
	if(branch!=null)
	{
	
	branchRepository.save(branch);
	}
	
}
}
