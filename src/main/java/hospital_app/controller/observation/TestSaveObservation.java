package hospital_app.controller.observation;

import java.time.LocalDateTime;

import hospital_app.dto.Observation;
import hospital_app.service.Imp.ObservationServiceImp;

public class TestSaveObservation {
public static void main(String[] args) {
	
	Observation observation=new Observation();
	observation.setDescription("Condition very serious");
	observation.setDatetime(LocalDateTime.of(2022, 05, 10,11, 15));
	observation.setWritername("john");
	
	ObservationServiceImp imp=new ObservationServiceImp();
	Observation observation2=imp.createObservation(observation,1);
	if(observation2!=null)
	{
		System.out.println("Observation saved");
	}
	else
	{
		System.out.println("Observation not saved,encounter id wrong");
	}
	
}
}
