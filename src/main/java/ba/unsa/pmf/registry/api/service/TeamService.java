package ba.unsa.pmf.registry.api.service;


import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.api.model.TeamRequest;

public interface TeamService {
    Team create(TeamRequest request);
}
