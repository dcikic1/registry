package ba.unsa.pmf.registry.core.mapper;

import ba.unsa.pmf.registry.api.model.Game;
import ba.unsa.pmf.registry.dao.entity.GameEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-20T16:48:56+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class GameMapperImpl implements GameMapper {

    @Override
    public Game entityToDto(GameEntity gameEntity) {
        if ( gameEntity == null ) {
            return null;
        }

        Game game = new Game();

        game.setId( gameEntity.getId() );
        game.setOfficial1Id( gameEntity.getOfficial1Id() );
        game.setOfficial2Id( gameEntity.getOfficial2Id() );
        game.setOfficial3Id( gameEntity.getOfficial3Id() );
        game.setTableOfficialWriterId( gameEntity.getTableOfficialWriterId() );
        game.setTableOfficialTimeId( gameEntity.getTableOfficialTimeId() );
        game.setTableOfficialShotClockId( gameEntity.getTableOfficialShotClockId() );
        game.setTableOfficialWriterAssistantId( gameEntity.getTableOfficialWriterAssistantId() );
        game.setHomeScore( gameEntity.getHomeScore() );
        game.setAwayScore( gameEntity.getAwayScore() );
        game.setHomeTeamId( gameEntity.getHomeTeamId() );
        game.setAwayTeamId( gameEntity.getAwayTeamId() );
        game.setLeagueId( gameEntity.getLeagueId() );
        game.setCreatedBy( gameEntity.getCreatedBy() );
        game.setModified( gameEntity.getModified() );
        game.setModfiedBy( gameEntity.getModfiedBy() );

        return game;
    }

    @Override
    public GameEntity dtoToEntity(Game game) {
        if ( game == null ) {
            return null;
        }

        GameEntity gameEntity = new GameEntity();

        gameEntity.setId( game.getId() );
        gameEntity.setOfficial1Id( game.getOfficial1Id() );
        gameEntity.setOfficial2Id( game.getOfficial2Id() );
        gameEntity.setOfficial3Id( game.getOfficial3Id() );
        gameEntity.setTableOfficialWriterId( game.getTableOfficialWriterId() );
        gameEntity.setTableOfficialTimeId( game.getTableOfficialTimeId() );
        gameEntity.setTableOfficialShotClockId( game.getTableOfficialShotClockId() );
        gameEntity.setTableOfficialWriterAssistantId( game.getTableOfficialWriterAssistantId() );
        gameEntity.setHomeScore( game.getHomeScore() );
        gameEntity.setAwayScore( game.getAwayScore() );
        gameEntity.setHomeTeamId( game.getHomeTeamId() );
        gameEntity.setAwayTeamId( game.getAwayTeamId() );
        gameEntity.setLeagueId( game.getLeagueId() );
        gameEntity.setCreatedBy( game.getCreatedBy() );
        gameEntity.setModified( game.getModified() );
        gameEntity.setModfiedBy( game.getModfiedBy() );

        return gameEntity;
    }

    @Override
    public List<Game> entitiesToDtos(List<GameEntity> gameEntities) {
        if ( gameEntities == null ) {
            return null;
        }

        List<Game> list = new ArrayList<Game>( gameEntities.size() );
        for ( GameEntity gameEntity : gameEntities ) {
            list.add( entityToDto( gameEntity ) );
        }

        return list;
    }
}
