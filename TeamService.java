package com.dev.test.service;

import com.dev.test.bean.CreateTeamRequest;
import org.springframework.stereotype.Service;

/**
 * @author shubharanshupanda
 * @created 18/10/21
 * @project test-service
 */
public interface TeamService {

    void createTeam(CreateTeamRequest createTeamRequest);

    void notify(long teamId);
}
