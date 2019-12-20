package com.capg.train.poc.repository;

import com.capg.train.poc.domain.Agent;

public interface AgentDAO {
    public Agent getAgent(String agentId);

    public int createAgent(Agent agent);

    public int updateAgent(Agent agent, String agentId);

    public int deleteAgent(String agentId);

    public Boolean isAgentExist(String agentId);

}
