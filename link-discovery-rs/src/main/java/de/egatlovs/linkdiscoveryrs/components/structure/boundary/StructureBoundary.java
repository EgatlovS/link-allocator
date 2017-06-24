package de.egatlovs.linkdiscoveryrs.components.structure.boundary;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import de.egatlovs.linkdiscoveryrs.components.linkpoint.entity.Linkpoint;
import de.egatlovs.linkdiscoveryrs.components.structure.entity.Structure;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class StructureBoundary {

	public List<Structure> getStructures() {
		// TODO get structures from db
		// TODO map structures to dtos
		// TODO return structures
		List<Structure> struc = new ArrayList<>();
		struc.add(new Structure());
		return struc;
	}

	public Structure getStructureById(long id) {
		// TODO get structure from db
		// TODO map structure to dto
		// TODO return dto
		return null;
	}

	public Structure getStructureByName(String name) {
		// TODO get structure from db
		// TODO map structure to dto
		// TODO return dto
		return null;
	}

	public Structure createStructure(Structure structure) {
		// TODO map structure to entity
		// TODO write structure in db
		// TODO return created structure
		return null;
	}

	public void removeStructureById(long id) {
		// TODO try to remove structure and attached linkpoints from db
	}

	public void removeStructureByName(String name) {
		// TODO try to remove structure and attached linkpoints from db
	}

	public List<Linkpoint> getLinkpointsByStructureId(long id) {
		// TODO get linkpoints from db
		// TODO map linkpoints to dto
		// TODO return linkpoints
		return null;
	}

	public void removeLinkpointsByStructureId(long id) {
		// TODO try to remove all linkpoints from that sturcture from db
	}

}