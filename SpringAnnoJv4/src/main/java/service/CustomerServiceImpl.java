package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

import java.util.List;


@Service("customerService")
@Scope("singleton") //default scope
//@Scope("prototype") //
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {

    }
    public CustomerServiceImpl(CustomerRepository customerRepository) {

        System.out.println("we are using constructor injection");
        this.customerRepository=customerRepository;

    }
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("we are using setter injection");
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();

    }




}
