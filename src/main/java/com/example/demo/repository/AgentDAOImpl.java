package com.example.demo.repository;


import com.example.demo.domain.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AgentDAOImpl implements AgentDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Agent getAgent(String agentId){
        return jdbcTemplate.queryForObject("select * from agent where agentId=?", Agent.class);
    }

    public int createAgent(Agent agent) {
        return jdbcTemplate.update("insert into agent (agentId,firstname, lastname, email) values(?,?,?,?)", new Object[]{agent.getAgentId(), agent.getFirstname(), agent.getLastname(), agent.getEmail()});
    }

    public int updateAgent(Agent agent, String agentId) {
        return jdbcTemplate.update("update agent set firstname = ?, lastname=?, email=? where agentId = ?", new Object[]{agent.getFirstname(), agent.getLastname(), agent.getEmail(), agent.getAgentId()});
    }
   public int deleteAgent(String agentId) {
       return jdbcTemplate.update("delete agent where agentId = ?", agentId);
   }
}





