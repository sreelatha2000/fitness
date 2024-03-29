package com.branchservice.controller;

//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.branchservice.entity.Branch;
import com.branchservice.service.BranchService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	private BranchService branchService;

//	@Autowired
//	private BranchRepository BranchRepository;

	@PostMapping(path = "/save")
	public ResponseEntity<Branch> save(@RequestBody Branch branch) {
		// log.info("Saving patient {}", Branch);
		System.out.println("saving");
		branchService.save(branch);

		ResponseEntity<Branch> responseEntity = new ResponseEntity<>(branch, HttpStatus.CREATED);
		return responseEntity;
	}
	
	@GetMapping(path = "/{branchId}")
	public ResponseEntity<Branch> getPatient(@PathVariable Long branchId) {
		//log.info("Fetching Branch {}", paymentId);
		Branch branch = branchService.get(branchId);
		System.out.print("Branch getted successfully");
		ResponseEntity<Branch> responseEntity = new ResponseEntity<>(branch,
				HttpStatus.OK);
		System.out.println("Branch getted successfully1");
		return responseEntity;
		
	}
	
	
	@DeleteMapping(path="/{branchId}")
	
	public String deleteBranch(@PathVariable Long branchId)
	
	{
		
	Branch branch = branchService.deleteById(branchId);
		System.out.print("Branch getted successfully");
		ResponseEntity<Branch> responseEntity = new ResponseEntity<>(branch,
				HttpStatus.OK);
		
		return "record deleted";
		
	}
	
//	@PutMapping(path="/update/{paymentId}")
//	public ResponseEntity<Branch> updateById(@RequestBody Branch Branch) {
//		// log.info("Saving patient {}", Branch);
//		System.out.println("updated successfully");
//		BranchService.update(Branch);
//
//		ResponseEntity<Branch> responseEntity = new ResponseEntity<>(Branch, HttpStatus.CREATED);
//		return responseEntity;
//	}
//	
	@PutMapping("/update/{paymentId}")
    public void updateEntity(@PathVariable Long paymentId, @RequestParam String paymentMode) {
        // Perform validation or error handling as needed

		
		
		

       
    }
	
	
	
	


}
