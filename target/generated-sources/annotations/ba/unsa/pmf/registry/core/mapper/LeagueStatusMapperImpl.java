package ba.unsa.pmf.registry.core.mapper;

import ba.unsa.pmf.registry.api.model.LeagueStatus;
import ba.unsa.pmf.registry.dao.entity.LeagueStatusEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-25T19:21:49+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class LeagueStatusMapperImpl implements LeagueStatusMapper {

    @Override
    public LeagueStatus entityToDto(LeagueStatusEntity leagueStatusEntity) {
        if ( leagueStatusEntity == null ) {
            return null;
        }

        LeagueStatus leagueStatus = new LeagueStatus();

        leagueStatus.setId( leagueStatusEntity.getId() );
        leagueStatus.setName( leagueStatusEntity.getName() );
        leagueStatus.setDisplayName( leagueStatusEntity.getDisplayName() );
        leagueStatus.setCreated( leagueStatusEntity.getCreated() );
        leagueStatus.setCreatedBy( leagueStatusEntity.getCreatedBy() );
        leagueStatus.setModified( leagueStatusEntity.getModified() );
        leagueStatus.setModfiedBy( leagueStatusEntity.getModfiedBy() );

        return leagueStatus;
    }

    @Override
    public LeagueStatusEntity dtoToEntity(LeagueStatus leagueStatus) {
        if ( leagueStatus == null ) {
            return null;
        }

        LeagueStatusEntity leagueStatusEntity = new LeagueStatusEntity();

        leagueStatusEntity.setId( leagueStatus.getId() );
        leagueStatusEntity.setName( leagueStatus.getName() );
        leagueStatusEntity.setDisplayName( leagueStatus.getDisplayName() );
        leagueStatusEntity.setCreated( leagueStatus.getCreated() );
        leagueStatusEntity.setCreatedBy( leagueStatus.getCreatedBy() );
        leagueStatusEntity.setModified( leagueStatus.getModified() );
        leagueStatusEntity.setModfiedBy( leagueStatus.getModfiedBy() );

        return leagueStatusEntity;
    }

    @Override
    public List<LeagueStatus> entitiesToDtos(List<LeagueStatusEntity> leagueEntities) {
        if ( leagueEntities == null ) {
            return null;
        }

        List<LeagueStatus> list = new ArrayList<LeagueStatus>( leagueEntities.size() );
        for ( LeagueStatusEntity leagueStatusEntity : leagueEntities ) {
            list.add( entityToDto( leagueStatusEntity ) );
        }

        return list;
    }
}
