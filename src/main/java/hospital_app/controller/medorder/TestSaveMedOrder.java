package hospital_app.controller.medorder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import hospital_app.dto.Items;
import hospital_app.dto.MedOrder;
import hospital_app.service.Imp.MedOrderServiceImp;

public class TestSaveMedOrder {
	public static void main(String[] args) {
		MedOrder medOrder = new MedOrder();
		Items item1=new Items();
		item1.setMedName("Paracetemol");
		item1.setCost(50.00);
		item1.setQuantity(10);
		
		Items item2=new Items();
		item2.setMedName("Syringes");
		item2.setCost(500.00);
		item2.setQuantity(5);

		Items item3=new Items();
		item3.setMedName("glucose bottles");
		item3.setCost(600.00);
		item3.setQuantity(3);
		
		List<Items> items=new ArrayList<Items>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		
		item1.setMedOrder(medOrder);
		item2.setMedOrder(medOrder);
		item3.setMedOrder(medOrder);
		
		medOrder.setDateTime(LocalDateTime.of(2022, 05, 10, 13, 15));
		medOrder.setItems(items);
		
		MedOrderServiceImp imp = new MedOrderServiceImp();
		MedOrder order = imp.saveMedOrder(medOrder, 1);
		if (order != null) {
			System.out.println("Order saved");
		} else {
			System.out.println("Order not saved,encounter id wrong");
		}
	}
}
