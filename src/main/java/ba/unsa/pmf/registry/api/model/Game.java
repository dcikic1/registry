package ba.unsa.pmf.registry.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game implements Serializable {

    private Long id;

    private Long official1Id;

    private Long official2Id;

    private Long official3Id;

    private Long tableOfficialWriterId;

    private Long tableOfficialTimeId;

    private Long tableOfficialShotClockId;

    private Long tableOfficialWriterAssistantId;

    private Long homeScore;

    private Long awayScore;

    private Long homeTeamId;

    private Long awayTeamId;

    private Long fixture;

    private Long leagueId;

    private String createdBy;

    private LocalDateTime modified;


    private String modfiedBy;
}
