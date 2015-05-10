package oop1.pro2.uml.repository;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.xml.bind.*;

import oop1.pro2.uml.domain.*;
import oop1.pro2.uml.domain.helper.*;

public class CustomerDaoJaxb implements CustomerDao {

	private static final String Customer="./src/resource/Curstomer.xml";
	private JAXBContext jaxbcontext;
	private HelperCustomer customerHelper=new HelperCustomer();
	
	@Override
	public void createXml(ArrayList<Customer> customerList) {
		// TODO Auto-generated method stub
		try{
			customerHelper.setCustomerList(customerList);
			jaxbcontext=JAXBContext.newInstance(HelperCustomer.class);
			Marshaller m=jaxbcontext.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(customerHelper, System.out);
			m.marshal(customerHelper, new File(Customer));
			
			
		}
		catch(Exception ex)
		{
			
		}
		
	}

	@Override
	public ArrayList<Customer> getXml() {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList=new ArrayList<Customer>();
		try{
			jaxbcontext=JAXBContext.newInstance(HelperCustomer.class);
			Unmarshaller um =jaxbcontext.createUnmarshaller();
			customerHelper=(HelperCustomer)um.unmarshal(new FileReader(Customer));
			customerList=customerHelper.getCustomerList();
		}
		catch(Exception ex){
			
		}
		
		
		return customerList;
	}

}
