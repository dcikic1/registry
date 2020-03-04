package ba.unsa.pmf.registry.core.mapper;


import ba.unsa.pmf.registry.api.model.League;
import ba.unsa.pmf.registry.dao.entity.LeagueEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LeagueMapper {

    @Mappings({ @Mapping(target = "statusId", source = "status.id"),
        @Mapping(target = "leagueTypeId", source = "leagueType.id")})
    League entityToDto(LeagueEntity leagueEntity);

    @InheritConfiguration
    LeagueEntity dtoToEntity(League league);

    List<League> entitiesToDtos(List<LeagueEntity> leagueEntities);
}
