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
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("SELECT e from team t where t.id =:teamId ")       // using @query
    List<Developer> findByTeamId(@Param("teamId") long teamId);



}
