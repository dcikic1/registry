package ba.unsa.pmf.registry.dao.repository;

import ba.unsa.pmf.registry.api.model.LovIdDisplayName;
import ba.unsa.pmf.registry.dao.entity.LeagueStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LeagueStatusRepository extends JpaRepository<LeagueStatusEntity,Long> {

    @Query("select new ba.unsa.pmf.registry.api.model.LovIdDisplayName(a.id,a.displayName) from LeagueStatusEntity a")
    List<LovIdDisplayName> getLov();
}
