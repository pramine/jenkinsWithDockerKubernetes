package com.example.demo.repository;

import com.example.demo.domain.Agent;

public interface AgentDAO {
    public Agent getAgent(String agentId);

    public int createAgent(Agent agent);

    public int updateAgent(Agent agent, String agentId);

    public int deleteAgent(String agentId);

}
