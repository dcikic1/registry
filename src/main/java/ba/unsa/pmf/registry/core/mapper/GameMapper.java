package ba.unsa.pmf.registry.core.mapper;

import ba.unsa.pmf.registry.api.model.Game;
import ba.unsa.pmf.registry.dao.entity.GameEntity;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GameMapper {

    Game entityToDto(GameEntity gameEntity);

    @InheritConfiguration
    GameEntity dtoToEntity(Game game);

    List<Game> entitiesToDtos(List<GameEntity>gameEntities);


}
