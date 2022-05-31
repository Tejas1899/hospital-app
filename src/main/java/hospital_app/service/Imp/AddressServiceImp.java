package hospital_app.service.Imp;

import java.util.List;

import hospital_app.dao.Imp.AddressDaoImp;
import hospital_app.dto.Address;
import hospital_app.dto.Branch;
import hospital_app.service.Address_Service;

public class AddressServiceImp implements Address_Service {
	AddressDaoImp addressDaoImp=new AddressDaoImp();
	public Address saveAddress(Address address, int branch_id) {
		return addressDaoImp.saveAddress(address, branch_id);
	}

	public Branch getBranchByAddressId(int address_id) {
		return addressDaoImp.getBranchByAddressId(address_id);
	}

	public List<Branch> getBranchByCity(String city) {
		return addressDaoImp.getBranchByCity(city);
	}

	public Address updateAddress(Address address, int address_id) {
		return addressDaoImp.updateAddress(address, address_id);
	}

	public boolean deleteAddress(int address_id) {
		return addressDaoImp.deleteAddress(address_id);
	}

}
