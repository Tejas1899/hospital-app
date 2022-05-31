package hospital_app.service;

import java.util.List;

import hospital_app.dto.Encounter;

public interface Encounter_Service {
	Encounter saveEncounter(int branch_id, int person_id, Encounter encounter);

	Encounter getEncounterById(int id);

	Encounter updateEncounter(Encounter encounter, int encounter_id);

	boolean deleteEncounter(int encounter_id);
}
