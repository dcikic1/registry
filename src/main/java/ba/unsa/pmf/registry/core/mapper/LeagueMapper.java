package ba.unsa.pmf.registry.core.mapper;


import ba.unsa.pmf.registry.api.model.League;
import ba.unsa.pmf.registry.dao.entity.LeagueEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LeagueMapper {

    League entityToDto(LeagueEntity leagueEntity);

    LeagueEntity dtoToEntity(League league);

    List<League> entitiesToDtos(List<LeagueEntity> leagueEntities);
}
