package com.example.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {
    @Autowired
    private PolicyRepository policyRepository;
    
    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }
    
    public Policy updatePolicy(Long policyId, Policy policy) {
        policy.setId(policyId);
        return policyRepository.save(policy);
    }
    
    public Policy viewPolicy(Long policyId) {
        return ((Object) policyRepository.findById(policyId)).Else(null);
    }
    
    public void deletePolicy(Long policyId) {
        policyRepository.deleteById(policyId);
    }
}
