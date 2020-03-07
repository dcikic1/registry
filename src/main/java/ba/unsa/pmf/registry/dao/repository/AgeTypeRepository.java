package ba.unsa.pmf.registry.dao.repository;

import ba.unsa.pmf.registry.api.model.LovIdDisplayName;
import ba.unsa.pmf.registry.dao.entity.AgeTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface AgeTypeRepository extends JpaRepository<AgeTypeEntity,Long> {

    @Query("select new  ba.unsa.pmf.registry.api.model.LovIdDisplayName(a.id,a.displayName) from AgeTypeEntity a")
    List<LovIdDisplayName> getLov();
}