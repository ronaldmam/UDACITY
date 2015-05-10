package oop1.pro2.uml.controller.Customer;

import java.util.ArrayList;
import java.util.Iterator;

import oop1.pro2.uml.controller.Controller;
import oop1.pro2.uml.domain.Customer;
import oop1.pro2.uml.repository.CustomerDao;
import oop1.pro2.uml.repository.CustomerDaoJaxb;

public class CustomerCreateController implements Controller {

	@Override
	public void processRequest() {
		// TODO Auto-generated method stub
		
		Customer customer1=new Customer();
		customer1.setName("Ronald");
		customer1.setEdad(32);
		customer1.setId(1000);
		
		Customer customer2=new Customer();
		customer2.setName("Carlos");
		customer2.setEdad(22);
		customer2.setId(1001);
		
		ArrayList<Customer> customerList=new ArrayList<Customer>();
		customerList.add(customer1);
		customerList.add(customer2);
		
		CustomerDao customerdao=new CustomerDaoJaxb();
		customerdao.createXml(customerList);
		
		ArrayList<Customer> customerList2=new ArrayList<Customer>();
		customerList2=customerdao.getXml();
		for(Iterator<Customer> it= customerList2.iterator();it.hasNext();)
		{
			Customer customer =it.next();
			System.out.println(customer.toString());
		}
	}

}
