package hospital_app.service;

import java.util.List;

import hospital_app.dto.Address;
import hospital_app.dto.Branch;

public interface Address_Service {
	Address saveAddress(Address address, int branch_id);

	Branch getBranchByAddressId(int address_id);

	List<Branch> getBranchByCity(String city);

	Address updateAddress(Address address, int address_id);

	boolean deleteAddress(int address_id);

}
