package com.example.demo.service;

import com.example.demo.domain.Agent;
import com.example.demo.repository.AgentDAO;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    private AgentDAO agentDao;

    public AgentService(AgentDAO agentDao){
        this.agentDao = agentDao;
    }

    /**
     *
     * @param agentId
     * @return
     */
    public Agent retrieveAgentByAgentId(String agentId){
        return agentDao.getAgent(agentId);
    }

    public int createAgentInDB(Agent agent) {
        return agentDao.createAgent(agent);
    }

    public void updateAgent(Agent agent, String agentId){

    }

    public void deleteAgent(String agentId){

    }


}
