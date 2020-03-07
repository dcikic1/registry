package ba.unsa.pmf.registry.core.impl;

import ba.unsa.pmf.registry.api.model.LeagueStatus;
import ba.unsa.pmf.registry.api.model.LovIdDisplayName;
import ba.unsa.pmf.registry.api.service.LeagueStatusService;
import ba.unsa.pmf.registry.core.mapper.LeagueStatusMapper;
import ba.unsa.pmf.registry.dao.entity.LeagueStatusEntity;
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
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class LeagueStatusImpl implements LeagueStatusService {

    LeagueStatusMapper leagueStatusMapper;
    LeagueStatusRepository leagueStatusRepository;


    @Override
    public LeagueStatus create(LeagueStatus leagueStatus) {
        LeagueStatusEntity newLeagueStatus= leagueStatusMapper.dtoToEntity(leagueStatus);
        newLeagueStatus.setCreated(LocalDateTime.now());
        newLeagueStatus.setCreatedBy("aa");
        newLeagueStatus= leagueStatusRepository.save(newLeagueStatus);

        return leagueStatusMapper.entityToDto(newLeagueStatus);
    }

    @Override
    public List<LovIdDisplayName> getLov() {
        return leagueStatusRepository.getLov();
    }
}
