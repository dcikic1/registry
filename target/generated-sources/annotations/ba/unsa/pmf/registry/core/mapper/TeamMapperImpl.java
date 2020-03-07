package ba.unsa.pmf.registry.core.mapper;

import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.dao.entity.AgeTypeEntity;
import ba.unsa.pmf.registry.dao.entity.LeagueEntity;
import ba.unsa.pmf.registry.dao.entity.TeamEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-07T16:33:18+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class TeamMapperImpl implements TeamMapper {

    @Override
    public Team entityToDto(TeamEntity teamEntity) {
        if ( teamEntity == null ) {
            return null;
        }

        Team team = new Team();

        team.setLeagueId( teamEntityLeagueId( teamEntity ) );
        team.setTeamTypeId( teamEntityTeamTypeId( teamEntity ) );
        team.setId( teamEntity.getId() );
        team.setName( teamEntity.getName() );
        team.setDisplayName( teamEntity.getDisplayName() );
        team.setShortName( teamEntity.getShortName() );
        team.setCreated( teamEntity.getCreated() );
        team.setCreatedBy( teamEntity.getCreatedBy() );
        team.setModified( teamEntity.getModified() );
        team.setModfiedBy( teamEntity.getModfiedBy() );

        return team;
    }

    @Override
    public TeamEntity dtoToEntity(Team team) {
        if ( team == null ) {
            return null;
        }

        TeamEntity teamEntity = new TeamEntity();

        teamEntity.setTeamType( teamToAgeTypeEntity( team ) );
        teamEntity.setLeague( teamToLeagueEntity( team ) );
        teamEntity.setId( team.getId() );
        teamEntity.setName( team.getName() );
        teamEntity.setDisplayName( team.getDisplayName() );
        teamEntity.setShortName( team.getShortName() );
        teamEntity.setCreated( team.getCreated() );
        teamEntity.setCreatedBy( team.getCreatedBy() );
        teamEntity.setModified( team.getModified() );
        teamEntity.setModfiedBy( team.getModfiedBy() );

        return teamEntity;
    }

    @Override
    public List<Team> entitiesToDtos(List<TeamEntity> teamEntities) {
        if ( teamEntities == null ) {
            return null;
        }

        List<Team> list = new ArrayList<Team>( teamEntities.size() );
        for ( TeamEntity teamEntity : teamEntities ) {
            list.add( entityToDto( teamEntity ) );
        }

        return list;
    }

    private Long teamEntityLeagueId(TeamEntity teamEntity) {
        if ( teamEntity == null ) {
            return null;
        }
        LeagueEntity league = teamEntity.getLeague();
        if ( league == null ) {
            return null;
        }
        Long id = league.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long teamEntityTeamTypeId(TeamEntity teamEntity) {
        if ( teamEntity == null ) {
            return null;
        }
        AgeTypeEntity teamType = teamEntity.getTeamType();
        if ( teamType == null ) {
            return null;
        }
        Long id = teamType.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected AgeTypeEntity teamToAgeTypeEntity(Team team) {
        if ( team == null ) {
            return null;
        }

        AgeTypeEntity ageTypeEntity = new AgeTypeEntity();

        ageTypeEntity.setId( team.getTeamTypeId() );

        return ageTypeEntity;
    }

    protected LeagueEntity teamToLeagueEntity(Team team) {
        if ( team == null ) {
            return null;
        }

        LeagueEntity leagueEntity = new LeagueEntity();

        leagueEntity.setId( team.getLeagueId() );

        return leagueEntity;
    }
}
