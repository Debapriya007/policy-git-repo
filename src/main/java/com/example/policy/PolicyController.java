package com.example.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {
    @Autowired
    private PolicyService policyService;
    
    @PostMapping("/createPolicy")
    public Policy createPolicy(@RequestBody Policy policy) {
        return policyService.createPolicy(policy);
    }
    
    @PutMapping("/updatePolicy/{policyId}")
    public Policy updatePolicy(@PathVariable Long policyId, @RequestBody Policy policy) {
        return policyService.updatePolicy(policyId, policy);
    }
    
    @GetMapping("/viewPolicy/{policyId}")
    public Policy viewPolicy(@PathVariable Long policyId) {
        return policyService.viewPolicy(policyId);
    }
    
    @DeleteMapping("/deletePolicy/{policyId}")
    public void deletePolicy(@PathVariable Long policyId) {
        policyService.deletePolicy(policyId);
    }
}
