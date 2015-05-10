package oop1.pro2.uml.domain.helper;
import java.util.*;
import javax.xml.bind.annotation.XmlRootElement;
import oop1.pro2.uml.domain.*;

@XmlRootElement(namespace="oop1.pro2.uml.domain.helper")
public class HelperCustomer {
	private ArrayList<Customer> customerList;
	public HelperCustomer(){
		
	}
	public ArrayList<Customer> getCustomerList()
	{
		return customerList;
	}
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

}
