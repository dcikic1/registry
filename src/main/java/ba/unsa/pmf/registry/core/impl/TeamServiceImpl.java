package ba.unsa.pmf.registry.core.impl;

import ba.unsa.pmf.registry.api.service.TeamService;
import ba.unsa.pmf.registry.core.mapper.TeamMapper;
import ba.unsa.pmf.registry.dao.repository.TeamRepository;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Data
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeamServiceImpl implements TeamService {

    TeamMapper teamMapper;
    TeamRepository teamRepository;
}
