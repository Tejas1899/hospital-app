package hospital_app.controller.address;

import hospital_app.service.Imp.AddressServiceImp;

public class TestDeleteAddress {
public static void main(String[] args) {
	AddressServiceImp addressServiceImp=new AddressServiceImp();
	boolean result=addressServiceImp.deleteAddress(1);
	if(result) {
		System.out.println("address is deleted ");
	}else {
		System.out.println("address not deleted");
	}
}
}
