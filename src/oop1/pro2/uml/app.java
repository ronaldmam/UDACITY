package oop1.pro2.uml;
import java.util.*;

import oop1.pro2.uml.controller.Controller;
import oop1.pro2.uml.controller.Customer.CustomerCreateController;


public class app {
	public static void main(String[] agrs){
		Controller customerCreateController=new CustomerCreateController();
		customerCreateController.processRequest();

	}

}