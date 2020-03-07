package ba.unsa.pmf.registry.api.service;

import ba.unsa.pmf.registry.api.model.AgeType;
import ba.unsa.pmf.registry.api.model.LovIdDisplayName;

import java.util.List;

public interface AgeTypeService {

    List<AgeType> findAll();

    AgeType create(AgeType ageType);

    List<LovIdDisplayName> getLov();
}
