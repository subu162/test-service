package com.dev.test.repository;

import com.dev.test.bean.Developer;
import com.dev.test.bean.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shubharanshupanda
 * @created 18/10/21
 * @project test-service
 */
@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {

    @Query("SELECT e from developer d where d.team_id =:teamId ")       // using @query
    List<Developer> findByTeamId(@Param("teamId") long teamId);
}
