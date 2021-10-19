package com.dev.test.controller;

import com.dev.test.bean.CreateTeamRequest;
import com.dev.test.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author shubharanshupanda
 * @created 18/10/21
 * @project test-service
 */

@RestController
@RequestMapping("/team/")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping(value = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response createTeam(@RequestBody CreateTeamRequest createTeamRequest) {
        teamService.createTeam(createTeamRequest);
        return null;
    }

    @PostMapping(value = "notify", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response notify(@RequestBody long teamId) {
        teamService.notify(teamId);
        return null;
    }



}
