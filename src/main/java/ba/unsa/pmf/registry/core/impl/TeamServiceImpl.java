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
import java.util.List;



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

    @Override
    public void delete(Long id) {
        teamRepository.deleteById(id);
    }

    @Override
    public List<Team> findAll() {
        List<TeamEntity>entities= teamRepository.findAll();
        return teamMapper.entitiesToDtos(entities);
    }

    @Override
    public Team update(Long id, TeamRequest request) {
        TeamEntity entity= teamRepository.findById(id).get();
        entity.setModfiedBy("Dino");
        entity.setModified(LocalDateTime.now());

        entity.setName(request.getName());
        entity.setDisplayName(request.getDisplayName());
        entity.setShortName(request.getShortName());

        entity.setLeague(leagueRepository.findById(request.getLeagueId()).get());
        entity.setTeamType(ageTypeRepository.findById(request.getTeamTypeId()).get());

        entity=teamRepository.save(entity);
        return teamMapper.entityToDto(entity);
    }

    @Override
    public List<Team> findTeamsInLeague(Long id) {
        List<TeamEntity> teamEntities =  teamRepository.findTeamsByLegaueId(id);
        return  teamMapper.entitiesToDtos(teamEntities);
    }


}
