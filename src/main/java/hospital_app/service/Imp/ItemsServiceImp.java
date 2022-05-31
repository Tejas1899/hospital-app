package hospital_app.service.Imp;

import java.util.List;

import hospital_app.dao.Imp.ItemsDaoImp;
import hospital_app.dto.Items;
import hospital_app.service.Items_Service;

public class ItemsServiceImp implements Items_Service {
	ItemsDaoImp daoImp=new ItemsDaoImp();
	@Override
	public Items saveItem(Items item, int medOrder_id) {
		return daoImp.saveItem(item, medOrder_id);
	}

	@Override
	public Items getItemById(int item_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Items> getItemByMedOrderId(int medOrder_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Items updateItem(Items item, int item_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteItem(int item_id) {
		// TODO Auto-generated method stub
		return false;
	}

}
