package hospital_app.controller.address;

import hospital_app.dto.Address;
import hospital_app.service.Imp.AddressServiceImp;

public class TestUpdateAddress {
public static void main(String[] args) {
	Address address=new Address();
	address.setCity("mysore");
	address.setCountry("india");
	address.setState("karnataka");
	
	
	AddressServiceImp addressServiceImp =new AddressServiceImp();
Address address2=addressServiceImp.updateAddress(address, 1);
if(address2!=null) {
	System.out.println("address is updated");
}else {
	System.out.println("address not updated");
}
}
}
