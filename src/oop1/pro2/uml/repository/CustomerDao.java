package oop1.pro2.uml.repository;
import java.util.ArrayList;
import oop1.pro2.uml.domain.*;

public interface CustomerDao {
	public void createXml(ArrayList<Customer> customerList);
	public ArrayList<Customer> getXml();
}
