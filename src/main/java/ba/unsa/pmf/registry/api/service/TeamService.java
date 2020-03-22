package ba.unsa.pmf.registry.api.service;


import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.api.model.TeamRequest;

import java.util.List;

/**
 * Provides methods for operations on team entity {@Link ba.unsa.pmf.registry.dao.entity.TeamEntity}
 *
 * @author Dino Čikić
 *
 */

public interface TeamService {
    Team create(TeamRequest request);

    void delete(Long id);

    List<Team> findAll();

    Team update(Long id, TeamRequest request);

    List<Team> findTeamsInLeague(Long id);
}
