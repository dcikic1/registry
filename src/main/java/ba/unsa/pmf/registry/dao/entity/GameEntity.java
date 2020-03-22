package ba.unsa.pmf.registry.dao.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="game")
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @NotNull
    @Column(name="official_1")
    private Long official1Id;

    @NotNull
    @Column(name="official_2")
    private Long official2Id;


    @Column(name="offical_3")
    private Long official3Id;

    @NotNull
    @Column(name="table_official_writer")
    private Long tableOfficialWriterId;

    @NotNull
    @Column(name="table_official_time")
    private Long tableOfficialTimeId;

    @NotNull
    @Column(name="table_official_shot_clock")
    private Long tableOfficialShotClockId;

    @Column(name="table_offical_writer_assistant")
    private Long tableOfficialWriterAssistantId;

    @NotNull
    @Column(name="home_score")
    private Long homeScore;

    @NotNull
    @Column(name="away_score")
    private Long awayScore;

    @NotNull
    @Column(name="home_team")
    private Long homeTeamId;

    @NotNull
    @Column(name="away_team")
    private Long awayTeamId;

    @NotNull
    @Column(name="league_id")
    private Long leagueId;

    @NotNull
    @Column(name = "created_by")
    private String createdBy;

    private LocalDateTime modified;

    @Column(name = "modified_by")
    private String modfiedBy;

}
