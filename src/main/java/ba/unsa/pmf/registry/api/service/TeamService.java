package ba.unsa.pmf.registry.api.service;


import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.api.model.TeamRequest;

import java.util.List;

public interface TeamService {
    Team create(TeamRequest request);

    void delete(Long id);

    List<Team> findAll();

    Team update(Long id, TeamRequest request);

    List<Team> findTeamsInLeague(Long id);
}
