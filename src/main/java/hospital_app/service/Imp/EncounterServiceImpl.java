package hospital_app.service.Imp;

import hospital_app.dao.Imp.EncounterDaoImp;
import hospital_app.dto.Encounter;
import hospital_app.service.Encounter_Service;

public class EncounterServiceImpl implements Encounter_Service {
	EncounterDaoImp daoImp=new EncounterDaoImp();
	
	@Override
	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {
		return daoImp.saveEncounter(branch_id, person_id, encounter);
	}

	@Override
	public Encounter getEncounterById(int id) {
		return daoImp.getEncounterById(id);
	}

	@Override
	public Encounter updateEncounter(Encounter encounter, int encounter_id) {
		return daoImp.updateEncounter(encounter, encounter_id);
	}

	@Override
	public boolean deleteEncounter(int encounter_id) {
		return daoImp.deleteEncounter(encounter_id);
	}
	

}
