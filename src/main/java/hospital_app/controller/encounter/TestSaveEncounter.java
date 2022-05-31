package hospital_app.controller.encounter;

import java.time.LocalDateTime;

import hospital_app.dto.Encounter;
import hospital_app.service.Imp.EncounterServiceImpl;

public class TestSaveEncounter {
	public static void main(String[] args) {
		Encounter encounter = new Encounter();
		encounter.setAdmit__date_time(LocalDateTime.of(2022, 05, 10, 10, 15));
		encounter.setDischarge__date_time(LocalDateTime.of(2022, 05, 17, 13, 36));
		encounter.setReason("Accident");
		EncounterServiceImpl encounterServiceImpl = new EncounterServiceImpl();
		Encounter encounter2 = encounterServiceImpl.saveEncounter(1, 6, encounter);
		if (encounter2 != null) {
			System.out.println("Encounter saved");
		} else {
			System.out.println("Encounter not saved,branch id or person id wrong");
		}
	}
}
