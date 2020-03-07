package ba.unsa.pmf.registry.core.mapper;

import ba.unsa.pmf.registry.api.model.LeagueStatus;
import ba.unsa.pmf.registry.dao.entity.LeagueStatusEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LeagueStatusMapper {

    LeagueStatus entityToDto(LeagueStatusEntity leagueStatusEntity);

    @InheritConfiguration
    LeagueStatusEntity dtoToEntity(LeagueStatus leagueStatus);

    List<LeagueStatus> entitiesToDtos(List<LeagueStatusEntity> leagueEntities);
}
