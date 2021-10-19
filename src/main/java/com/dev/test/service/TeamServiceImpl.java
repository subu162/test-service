package com.dev.test.service;

import com.dev.test.bean.CreateTeamRequest;
import com.dev.test.bean.Developer;
import com.dev.test.bean.Team;
import com.dev.test.repository.DeveloperRepository;
import com.dev.test.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author shubharanshupanda
 * @created 18/10/21
 * @project test-service
 */
@Service
public class TeamServiceImpl implements TeamService{

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public void createTeam(CreateTeamRequest createTeamRequest) {
        Team team = new Team();
        team.setName(createTeamRequest.getTeam().getName());
        team = teamRepository.save(team);

        for (Developer developer:createTeamRequest.getDevelopers()) {
            developer.setTeamId(team.getId());
            developerRepository.save(developer);
        }
    }

    @Override
    public void notify(long teamId) {
        Team team = (Team) teamRepository.findByTeamId(teamId);
        if (team != null) {
            List<Developer> developers = developerRepository.findByTeamId(team.getId());
        }

        //http post call to a dev

    }
}
