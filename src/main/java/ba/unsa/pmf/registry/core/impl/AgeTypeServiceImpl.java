package ba.unsa.pmf.registry.core.impl;

import ba.unsa.pmf.registry.api.model.AgeType;
import ba.unsa.pmf.registry.api.model.LovIdDisplayName;
import ba.unsa.pmf.registry.api.service.AgeTypeService;
import ba.unsa.pmf.registry.core.mapper.AgeTypeMapper;
import ba.unsa.pmf.registry.dao.entity.AgeTypeEntity;
import ba.unsa.pmf.registry.dao.repository.AgeTypeRepository;
import ba.unsa.pmf.registry.dao.repository.LeagueStatusRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class AgeTypeServiceImpl implements AgeTypeService {

    AgeTypeMapper ageTypeMapper;
    AgeTypeRepository ageTypeRepository;
    LeagueStatusRepository leagueStatusRepository;



    @Override
    public List<AgeType> findAll() {
        List<AgeTypeEntity>entities=ageTypeRepository.findAll();
        return  ageTypeMapper.entitiesToDtos(entities);
    }

    @Override
    public AgeType create(AgeType ageType) {
        AgeTypeEntity newAgeType=ageTypeMapper.dtoToEntity(ageType);
        newAgeType.setCreated(LocalDateTime.now());
        newAgeType.setCreatedBy("aa");
        newAgeType= ageTypeRepository.save(newAgeType);

        return ageTypeMapper.entityToDto(newAgeType);

    }

    @Override
    public List<LovIdDisplayName> getLov() {
        return  ageTypeRepository.getLov();
    }


}
