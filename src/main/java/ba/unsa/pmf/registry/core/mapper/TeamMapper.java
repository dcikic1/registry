package ba.unsa.pmf.registry.core.mapper;

import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.dao.entity.TeamEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    @Mappings({ @Mapping(target = "leagueId", source = "league.id"),
            @Mapping(target = "teamTypeId", source = "teamType.id")})
    Team entityToDto(TeamEntity teamEntity);

    @InheritInverseConfiguration
    TeamEntity dtoToEntity(Team team);

    List<Team> entitiesToDtos(List<TeamEntity> teamEntities);
}
