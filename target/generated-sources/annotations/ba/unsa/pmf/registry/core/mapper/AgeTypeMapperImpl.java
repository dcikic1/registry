package ba.unsa.pmf.registry.core.mapper;

import ba.unsa.pmf.registry.api.model.AgeType;
import ba.unsa.pmf.registry.dao.entity.AgeTypeEntity;
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
public class AgeTypeMapperImpl implements AgeTypeMapper {

    @Override
    public AgeType entityToDto(AgeTypeEntity ageTypeEntity) {
        if ( ageTypeEntity == null ) {
            return null;
        }

        AgeType ageType = new AgeType();

        ageType.setId( ageTypeEntity.getId() );
        ageType.setName( ageTypeEntity.getName() );
        ageType.setShortName( ageTypeEntity.getShortName() );
        ageType.setDisplayName( ageTypeEntity.getDisplayName() );
        ageType.setCreated( ageTypeEntity.getCreated() );
        ageType.setCreatedBy( ageTypeEntity.getCreatedBy() );
        ageType.setModified( ageTypeEntity.getModified() );
        ageType.setModfiedBy( ageTypeEntity.getModfiedBy() );

        return ageType;
    }

    @Override
    public AgeTypeEntity dtoToEntity(AgeType ageType) {
        if ( ageType == null ) {
            return null;
        }

        AgeTypeEntity ageTypeEntity = new AgeTypeEntity();

        ageTypeEntity.setId( ageType.getId() );
        ageTypeEntity.setName( ageType.getName() );
        ageTypeEntity.setShortName( ageType.getShortName() );
        ageTypeEntity.setDisplayName( ageType.getDisplayName() );
        ageTypeEntity.setCreated( ageType.getCreated() );
        ageTypeEntity.setCreatedBy( ageType.getCreatedBy() );
        ageTypeEntity.setModified( ageType.getModified() );
        ageTypeEntity.setModfiedBy( ageType.getModfiedBy() );

        return ageTypeEntity;
    }

    @Override
    public List<AgeType> entitiesToDtos(List<AgeTypeEntity> ageTypeEntities) {
        if ( ageTypeEntities == null ) {
            return null;
        }

        List<AgeType> list = new ArrayList<AgeType>( ageTypeEntities.size() );
        for ( AgeTypeEntity ageTypeEntity : ageTypeEntities ) {
            list.add( entityToDto( ageTypeEntity ) );
        }

        return list;
    }
}
