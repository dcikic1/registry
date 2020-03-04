package ba.unsa.pmf.registry.dao.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "team")
public class TeamEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @NotNull
    private  String name;

    @NotNull
    @Column(name = "display_name", nullable = false)
    private String displayName;

    @NotNull
    @Column(name = "short_name", nullable = false)
    private String shortName;

    @NotNull
    @OneToOne
    @JoinColumn(name = "team_type_id")
    private AgeTypeEntity teamType;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "league_id")
    private LeagueEntity league;

    @NotNull
    private LocalDateTime created;

    @NotNull
    @Column(name = "created_by")
    private String createdBy;

    private LocalDateTime modified;

    @Column(name = "modified_by")
    private String modfiedBy;

}
