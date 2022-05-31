package hospital_app.service.Imp;

import java.util.List;

import hospital_app.dao.Imp.MedOrderDaoImp;
import hospital_app.dto.Items;
import hospital_app.dto.MedOrder;
import hospital_app.service.MedOrder_Service;

public class MedOrderServiceImp implements MedOrder_Service{
	MedOrderDaoImp daoImp=new MedOrderDaoImp(); 
	
	@Override
	public MedOrder saveMedOrder(MedOrder medOrder, int encounter_id) {
		double sum=0;
		for(Items items:medOrder.getItems())
		{
			sum=sum+(items.getQuantity()*items.getCost());
		}
		medOrder.setTotalCost(sum);
		return daoImp.saveMedOrder(medOrder, encounter_id);
	}

	@Override
	public MedOrder getMedOrderById(int medOrder_id) {
		return daoImp.getMedOrderById(medOrder_id);
	}

	@Override
	public List<MedOrder> getMedOrderByEncounterId(int encounter_id) {
		return daoImp.getMedOrderByEncounterId(encounter_id);
	}

	@Override
	public MedOrder updateMedOrder(MedOrder medOrder, int medOrder_id) {
		return daoImp.updateMedOrder(medOrder, medOrder_id);
	}

	@Override
	public boolean deleteMedOrder(int medOrder_id) {
		return daoImp.deleteMedOrder(medOrder_id);
	}

	@Override
	public List<Items> getItemsByMedOrderId(int medOrder_id) {
		return daoImp.getItemsByMedOrderId(medOrder_id);
	}

}
