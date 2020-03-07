package ba.unsa.pmf.registry.core.mapper;

import ba.unsa.pmf.registry.api.model.League;
import ba.unsa.pmf.registry.dao.entity.AgeTypeEntity;
import ba.unsa.pmf.registry.dao.entity.LeagueEntity;
import ba.unsa.pmf.registry.dao.entity.LeagueStatusEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-07T16:33:19+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class LeagueMapperImpl implements LeagueMapper {

    @Override
    public League entityToDto(LeagueEntity leagueEntity) {
        if ( leagueEntity == null ) {
            return null;
        }

        League league = new League();

        league.setStatusId( leagueEntityStatusId( leagueEntity ) );
        league.setLeagueTypeId( leagueEntityLeagueTypeId( leagueEntity ) );
        league.setId( leagueEntity.getId() );
        league.setName( leagueEntity.getName() );
        league.setDisplayName( leagueEntity.getDisplayName() );
        league.setShortName( leagueEntity.getShortName() );
        league.setCreated( leagueEntity.getCreated() );
        league.setCreatedBy( leagueEntity.getCreatedBy() );
        league.setModified( leagueEntity.getModified() );
        league.setModfiedBy( leagueEntity.getModfiedBy() );
        league.setSeason( leagueEntity.getSeason() );

        return league;
    }

    @Override
    public LeagueEntity dtoToEntity(League league) {
        if ( league == null ) {
            return null;
        }

        LeagueEntity leagueEntity = new LeagueEntity();

        leagueEntity.setId( league.getId() );
        leagueEntity.setName( league.getName() );
        leagueEntity.setDisplayName( league.getDisplayName() );
        leagueEntity.setShortName( league.getShortName() );
        leagueEntity.setSeason( league.getSeason() );
        leagueEntity.setCreated( league.getCreated() );
        leagueEntity.setCreatedBy( league.getCreatedBy() );
        leagueEntity.setModified( league.getModified() );
        leagueEntity.setModfiedBy( league.getModfiedBy() );

        return leagueEntity;
    }

    @Override
    public List<League> entitiesToDtos(List<LeagueEntity> leagueEntities) {
        if ( leagueEntities == null ) {
            return null;
        }

        List<League> list = new ArrayList<League>( leagueEntities.size() );
        for ( LeagueEntity leagueEntity : leagueEntities ) {
            list.add( entityToDto( leagueEntity ) );
        }

        return list;
    }

    private Long leagueEntityStatusId(LeagueEntity leagueEntity) {
        if ( leagueEntity == null ) {
            return null;
        }
        LeagueStatusEntity status = leagueEntity.getStatus();
        if ( status == null ) {
            return null;
        }
        Long id = status.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long leagueEntityLeagueTypeId(LeagueEntity leagueEntity) {
        if ( leagueEntity == null ) {
            return null;
        }
        AgeTypeEntity leagueType = leagueEntity.getLeagueType();
        if ( leagueType == null ) {
            return null;
        }
        Long id = leagueType.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
