package hospital_app.controller.encounter;

import hospital_app.service.Imp.EncounterServiceImpl;

public class TestRemoveEncounter {
public static void main(String[] args) {
	EncounterServiceImpl encounterServiceImp=new EncounterServiceImpl();
	boolean  result=encounterServiceImp.deleteEncounter(3);
	if(result) {
		System.out.println("encounter is delaited based on encounter id");
	}else {
		System.out.println("encouter id is not exit to delete encouter");
	}
}
}
