package ba.unsa.pmf.registry.api.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgeType implements Serializable {

    private Long id;

    private String name;

    private String shortName;

    private String displayName;

    private LocalDateTime created;

    private String createdBy;

    private LocalDateTime modified;


    private String modfiedBy;
}
