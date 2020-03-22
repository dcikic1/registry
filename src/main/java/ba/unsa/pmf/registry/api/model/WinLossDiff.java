package ba.unsa.pmf.registry.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class WinLossDiff implements Serializable {

    Long victories;
    Long loses;
    Long difference;
}
