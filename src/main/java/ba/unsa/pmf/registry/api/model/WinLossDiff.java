package ba.unsa.pmf.registry.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class WinLossDiff implements Serializable {

    Long teamId;
    Long victories;
    Long loses;
    Long scoredPoints;
    Long recievedPoints;


    public WinLossDiff() {
        this.victories=Long.valueOf(0);
        this.loses= Long.valueOf(0);
        this.scoredPoints=Long.valueOf(0);
        this.recievedPoints=Long.valueOf(0);

    }
    public void incrementVictories() {this.victories+=1;}
    public void incrementLosses(){this.loses+=1;}
    public void increaseScoredPoints(Long pointsToBeAdded) {this.scoredPoints+=pointsToBeAdded;}
    public void increaseRecievedPoints(Long pointsToBeAdded) {this.recievedPoints+=pointsToBeAdded;}

    }

