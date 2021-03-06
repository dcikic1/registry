package ba.unsa.pmf.registry.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "league")
public class LeagueEntity implements Serializable {


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
    private String season;

    @NotNull
    private LocalDateTime created;

    @NotNull
    @Column(name = "created_by")
    private String createdBy;

    private LocalDateTime modified;

    @Column(name = "modified_by")
    private String modfiedBy;

    @NotNull
    @OneToOne
    @JoinColumn(name = "status_id")
    private LeagueStatusEntity status;

    @NotNull
    @OneToOne
    @JoinColumn(name = "league_type_id")
    private AgeTypeEntity leagueType;

    @OneToMany
    private List<TeamEntity> teams;
}
