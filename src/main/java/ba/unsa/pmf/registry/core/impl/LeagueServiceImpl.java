package ba.unsa.pmf.registry.core.impl;

import ba.unsa.pmf.registry.api.service.LeagueService;
import ba.unsa.pmf.registry.core.mapper.LeagueMapper;
import ba.unsa.pmf.registry.dao.repository.LeagueRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class LeagueServiceImpl implements LeagueService {

    LeagueMapper leagueMapper;
    LeagueRepository leagueRepository;
}
