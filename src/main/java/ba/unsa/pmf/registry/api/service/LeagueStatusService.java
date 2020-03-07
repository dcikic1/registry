package ba.unsa.pmf.registry.api.service;

import ba.unsa.pmf.registry.api.model.LeagueStatus;
import ba.unsa.pmf.registry.api.model.LovIdDisplayName;

import java.util.List;

public interface LeagueStatusService {
    LeagueStatus create(LeagueStatus leagueStatus);

    List<LovIdDisplayName> getLov();
}
