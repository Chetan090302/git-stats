package com.example.mapping;

import com.example.mapping.Customer.Customer;
import com.example.mapping.Customer.CustomerController;
import com.example.mapping.Customer.CustomerRepo;
import com.example.mapping.Customer.CustomerService;
import com.example.mapping.Order.Orders;
import org.assertj.core.internal.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)  // Force the use of H2
@ExtendWith(SpringExtension.class)
class MappingApplicationTests {
//	@MockBean
//	CustomerRepo repo;
//	@InjectMocks
//	CustomerService service;
//
//	@Test
//	void method1()
//	{
//		List<Orders> obj=new ArrayList();
//		Customer c1=new Customer(5,"chinnu",obj);
//		Mockito.when(repo.findById(2)).thenReturn(Optional.of(c1));
//		Customer c2=service.find(2);
//		System.out.print(c2.getId()+" "+c2.getName());
//		Assertions.assertNotNull(c2);
//	}

	@Autowired
	CustomerRepo repo1;

	@Test
	void method2()
	{
		List<Orders> l1=new ArrayList();
		Customer c1=new Customer(1,"chintu",l1);
		Customer c2=repo1.save(c1);
		Assertions.assertNotNull(c2);
		Assertions.assertEquals(1,c2.getId());
	}
}
