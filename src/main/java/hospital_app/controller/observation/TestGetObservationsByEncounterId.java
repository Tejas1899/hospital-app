package hospital_app.controller.observation;

import java.util.List;

import hospital_app.dto.Observation;
import hospital_app.service.Imp.ObservationServiceImp;

public class TestGetObservationsByEncounterId {
public static void main(String[] args) {
	ObservationServiceImp observationServiceImp=new ObservationServiceImp();
	List<Observation> observations=observationServiceImp.getObservationByEncounterId(1);
	if(observations!=null) {
		for(Observation observation:observations) {
			System.out.println("====================");
			System.out.println(observation.getWritername());
			System.out.println(observation.getDescription());
			System.out.println(observation.getDatetime());
			System.out.println("======================");
		}
	}else {
		System.out.println("there is no observation");
	}
}
}
