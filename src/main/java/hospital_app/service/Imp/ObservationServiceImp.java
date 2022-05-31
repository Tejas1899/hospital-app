package hospital_app.service.Imp;

import java.util.List;

import hospital_app.dao.Imp.ObservationDaoImp;
import hospital_app.dto.Observation;
import hospital_app.service.Observation_Service;

public class ObservationServiceImp implements Observation_Service{
	ObservationDaoImp daoImp=new ObservationDaoImp();
	
	@Override
	public Observation createObservation(Observation observation, int encounter_id) {
		return daoImp.createObservation(observation, encounter_id);
	}

	@Override
	public Observation getObservationById(int observation_id) {
		return daoImp.getObservationById(observation_id);
	}

	@Override
	public List<Observation> getObservationByEncounterId(int encounter_id) {
		return daoImp.getObservationByEncounterId(encounter_id);
	}

	@Override
	public Observation updateObservation(Observation observation, int observation_id) {
		return daoImp.updateObservation(observation, observation_id);
	}

	@Override
	public boolean deleteObservation(int observation_id) {
		return daoImp.deleteObservation(observation_id);
	}

}
