package ba.unsa.pmf.registry.core.impl;

import ba.unsa.pmf.registry.api.model.League;
import ba.unsa.pmf.registry.api.model.LeagueRequest;
import ba.unsa.pmf.registry.api.model.Team;
import ba.unsa.pmf.registry.api.service.LeagueService;
import ba.unsa.pmf.registry.core.mapper.LeagueMapper;
import ba.unsa.pmf.registry.dao.entity.LeagueEntity;
import ba.unsa.pmf.registry.dao.repository.AgeTypeRepository;
import ba.unsa.pmf.registry.dao.repository.LeagueRepository;
import ba.unsa.pmf.registry.dao.repository.LeagueStatusRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LeagueServiceImpl implements LeagueService {

    LeagueMapper leagueMapper;
    LeagueRepository leagueRepository;
    AgeTypeRepository ageTypeRepository;
    LeagueStatusRepository leagueStatusRepository;

    @Override
    public List<League> findAll() {
        List<LeagueEntity> entities = leagueRepository.findAll();
        return leagueMapper.entitiesToDtos(entities);
    }

    @Override
    public League create(LeagueRequest request) {

        LeagueEntity newLeague = createEntityFromRequest(request);
        newLeague = leagueRepository.save(newLeague);
        return  leagueMapper.entityToDto(newLeague);
    }

    @Override
    public League update(Long id,LeagueRequest request) {

       LeagueEntity entity = leagueRepository.findById(id).get();
        entity.setModfiedBy("Muaz");
        entity.setModified(LocalDateTime.now());
        entity = setBasicLeagueInformation(request, entity);
        entity = leagueRepository.save(entity);
        return  leagueMapper.entityToDto(entity);
    }

    @Override
    public void delete(Long id) {
        leagueRepository.deleteById(id);
    }


    private LeagueEntity setBasicLeagueInformation(LeagueRequest request, LeagueEntity entity) {
        entity.setDisplayName(request.getDisplayName());
        entity.setShortName(request.getDisplayName());
        entity.setName(request.getName());
        entity.setSeason(request.getSeason());
        entity.setStatus(leagueStatusRepository.findById(request.getStatusId()).get());
        entity.setLeagueType(ageTypeRepository.findById(request.getLeagueTypeId()).get());
        return entity;
    }

    private LeagueEntity createEntityFromRequest(LeagueRequest request) {
        LeagueEntity newLeague = new LeagueEntity();
        //gonna ne changed! userId would be set as CreatedBy
        newLeague.setCreatedBy("Muaz");
        newLeague.setCreated(LocalDateTime.now());
        newLeague = setBasicLeagueInformation(request,newLeague);
        return newLeague;
    }
}
