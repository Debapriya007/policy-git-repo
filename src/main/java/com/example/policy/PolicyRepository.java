package com.example.policy;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
	


	@SuppressWarnings("unchecked")
	public default Policy save(Policy policy) {
		// TODO Auto-generated method stub
		return null;
	}

	public default Optional<Policy> findById(Long policyId) {
		// TODO Auto-generated method stub
		return null;
	}

	public default void deleteById(Long policyId) {
		// TODO Auto-generated method stub
		
	}

}
