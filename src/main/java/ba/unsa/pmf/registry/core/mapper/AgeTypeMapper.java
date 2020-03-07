package ba.unsa.pmf.registry.core.mapper;

import ba.unsa.pmf.registry.api.model.AgeType;
import ba.unsa.pmf.registry.dao.entity.AgeTypeEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AgeTypeMapper {

    AgeType entityToDto(AgeTypeEntity ageTypeEntity);

    @InheritConfiguration
    AgeTypeEntity dtoToEntity(AgeType ageType);

    List<AgeType>entitiesToDtos(List<AgeTypeEntity>ageTypeEntities);
}
