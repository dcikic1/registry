package ba.unsa.pmf.registry.core.impl;

import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.api.model.TeamRequest;
import ba.unsa.pmf.registry.api.service.TeamService;
import ba.unsa.pmf.registry.core.mapper.TeamMapper;
import ba.unsa.pmf.registry.dao.entity.TeamEntity;
import ba.unsa.pmf.registry.dao.repository.AgeTypeRepository;
import ba.unsa.pmf.registry.dao.repository.LeagueRepository;
import ba.unsa.pmf.registry.dao.repository.TeamRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Data
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class TeamServiceImpl implements TeamService {

    TeamMapper teamMapper;
    TeamRepository teamRepository;
    LeagueRepository leagueRepository;
    AgeTypeRepository ageTypeRepository;

    @Override
    public Team create(TeamRequest request) {
        TeamEntity newTeam=new TeamEntity();

        newTeam.setName(request.getName());
        newTeam.setDisplayName(request.getDisplayName());
        newTeam.setShortName(request.getShortName());

        newTeam.setLeague(leagueRepository.findById(request.getLeagueId()).get());
        newTeam.setTeamType(ageTypeRepository.findById(request.getTeamTypeId()).get());

        newTeam.setCreated(LocalDateTime.now());
        newTeam.setCreatedBy("aa");

        newTeam=teamRepository.save(newTeam);

        return teamMapper.entityToDto(newTeam);
    }



}
