package com.capg.train.poc.service;

import com.capg.train.poc.domain.Agent;
import com.capg.train.poc.repository.AgentDAO;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

    private AgentDAO agentDao;

    public AgentService(AgentDAO agentDao){
        this.agentDao = agentDao;
    }

    /**
     * Return agent object on the basis of agentId
     *
     * @param agentId
     * @return Agent
     */
    public Agent retrieveAgentByAgentId(String agentId){
        return agentDao.getAgent(agentId);
    }

    /**
     * Add agent
     *
     * @param agent
     * @return int
     */
    public int addAgent(Agent agent) {
        return agentDao.createAgent(agent);
    }

    /**
     * Update agent by agentId
     *
     * @param agent
     * @param agentId
     * @return count
     */
    public int updateAgentById(Agent agent, String agentId){
        return agentDao.updateAgent(agent, agentId);
    }

    /**
     * Remove agent
     *
     * @param agentId
     */
    public void removeAgentById(String agentId){
        agentDao.deleteAgent(agentId);
    }

    /**
     * Check if agent already exist
     *
     * @param agentId
     * @return Boolean
     */
    public Boolean isAgentExist(String agentId){
        return  agentDao.isAgentExist(agentId);
    }


}
