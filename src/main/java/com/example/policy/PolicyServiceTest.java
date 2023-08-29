package com.example.policy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class PolicyServiceTest {
    @Autowired
    private PolicyService policyService;

    @Test
    public void testCreatePolicy() {
        // Implement test
    }

    @Test
    public void testUpdatePolicy() {
        // Implement test
    }

    @Test
    public void testViewPolicy() {
        // Implement test
    }

    @Test
    public void testDeletePolicy() {
        // Implement test
    }

	public PolicyService getPolicyService() {
		return policyService;
	}

	public void setPolicyService(PolicyService policyService) {
		this.policyService = policyService;
	}
}

