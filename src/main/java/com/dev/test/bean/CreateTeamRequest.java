package com.dev.test.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * @author shubharanshupanda
 * @created 18/10/21
 * @project test-service
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTeamRequest implements Serializable {


    private static final long serialVersionUID = -3674936562777234556L;

    private Team team;

    private List<Developer> developers;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
