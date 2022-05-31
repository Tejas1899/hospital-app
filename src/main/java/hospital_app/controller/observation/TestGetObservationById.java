package hospital_app.controller.observation;

import hospital_app.dto.Observation;
import hospital_app.service.Imp.ObservationServiceImp;

public class TestGetObservationById {
public static void main(String[] args) {
	ObservationServiceImp observationServiceImp=new ObservationServiceImp();
	Observation  observation=observationServiceImp.getObservationById(2);
	if(observation!=null) {
		System.out.println(observation.getWritername());
		System.out.println(observation.getDescription());
		System.out.println(observation.getDescription());
		System.out.println(observation.getDatetime());
	}else {
		System.out.println("there is no observation");
	}
}
}
