package ba.unsa.pmf.registry.dao.repository;

import ba.unsa.pmf.registry.dao.entity.LeagueStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueStatusRepository extends JpaRepository<LeagueStatusEntity,Long> {
}
