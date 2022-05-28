package hospital_app.dao;

import java.util.List;

public interface Encounter {
	Encounter saveEncounter(int branch_id, int person_id, Encounter encounter);

	Encounter getEncounterById(int id);

	Encounter updateEncounter(Encounter encounter, int encounter_id);

	boolean deleteEncounter(int encounter_id);
}
