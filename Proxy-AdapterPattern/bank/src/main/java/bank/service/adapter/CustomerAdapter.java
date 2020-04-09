package bank.service.adapter;

import bank.domain.Customer;
import bank.service.dto.CustomerDTO;

public class CustomerAdapter {
    public static CustomerDTO getCustomerDTO(Customer customer){
        CustomerDTO customerDTO= new CustomerDTO(customer.getName());
        return customerDTO;
    }
}
