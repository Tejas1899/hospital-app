package hospital_app.dao;

import java.util.List;

import hospital_app.dto.Items;

public interface Items_Dao {
	Items saveItem(Items item, int medOrder_id);

	Items getItemById(int item_id);

	List<Items> getItemByMedOrderId(int medOrder_id);

	Items updateItem(Items item, int item_id);

	boolean deleteItem(int item_id);
}
