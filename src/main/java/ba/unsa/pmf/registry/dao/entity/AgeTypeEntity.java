package ba.unsa.pmf.registry.dao.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "age_type")
public class AgeTypeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Column(name = "short_name")
    private String shortName;

    @NotNull
    @Column(name = "display_name")
    private String displayName;

    @NotNull
    private LocalDateTime created;

    @NotNull
    @Column(name = "created_by")
    private String createdBy;

    private LocalDateTime modified;

    @Column(name = "modified_by")
    private String modfiedBy;

}
