package de.egatlovs.lind.components.structure.boundary;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import de.egatlovs.lind.components.linkpoint.control.LinkpointTransformer;
import de.egatlovs.lind.components.linkpoint.entity.Linkpoint;
import de.egatlovs.lind.components.linkpoint.entity.dto.MinimalLinkpointDTO;
import de.egatlovs.lind.components.structure.control.StructureTransformer;
import de.egatlovs.lind.components.structure.entity.Structure;
import de.egatlovs.lind.components.structure.entity.StructureDao;
import de.egatlovs.lind.components.structure.entity.dto.MinimalStructureDTO;
import de.egatlovs.lind.components.structure.entity.dto.StructureDTO;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class StructureBoundary {

	@Inject
	private StructureDao structureManager;

	@Inject
	private StructureTransformer bumblebee;

	@Inject
	private LinkpointTransformer optimus;

	public List<MinimalStructureDTO> getStructures() {
		List<Structure> structures = structureManager.getStructures();
		return bumblebee.minimalStructureDTOs(structures);
	}

	public StructureDTO getStructureById(long id) {
		Structure structure = structureManager.getStructure(id);
		return bumblebee.structureDTO(structure);
	}

	public StructureDTO getStructureByName(String name) {
		Structure structure = structureManager.getStructure(name);
		return bumblebee.structureDTO(structure);
	}

	public StructureDTO createStructure(StructureDTO structureDTO) {
		Structure structure = bumblebee.structure(structureDTO);
		structureManager.persist(structure);
		return bumblebee.structureDTO(structure);
	}

	public void removeStructureById(long id) {
		structureManager.removeStructure(id);
	}

	public void removeStructureByName(String name) {
		structureManager.removeStructure(name);
	}

	public List<MinimalLinkpointDTO> getLinkpointsByStructureId(long id) {
		List<Linkpoint> linkpoints = structureManager.getMatchingLinkpoints(id);
		return optimus.minimalLinkpointDTOs(linkpoints);
	}

}