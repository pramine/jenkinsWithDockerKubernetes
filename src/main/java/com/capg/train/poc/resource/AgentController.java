package com.capg.train.poc.resource;

import com.capg.train.poc.domain.Agent;
import com.capg.train.poc.service.AgentService;
import javassist.tools.web.BadHttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/agents")
public class AgentController {

    AgentService agentService;

    public AgentController(AgentService  agentService){
        this.agentService = agentService;
    }



    @GetMapping
    public Agent getAgents(String agentId) {
        return agentService.retrieveAgentByAgentId(agentId);
    }

    @GetMapping(path = "/{agentId}")
    public Agent getAgentById(@PathVariable("agentId") String agentId) {
        return agentService.retrieveAgentByAgentId(agentId);
    }

    @PostMapping(consumes = "application/json")
    public int addAgent(@RequestBody Agent agent) {
        return agentService.addAgent(agent);
    }

   @DeleteMapping(path = "/{agentId}")
    public void delete(@PathVariable("agentId") String agentId) {
       agentService.removeAgentById(agentId);
    }

    @PutMapping(path = "/{agentId}")
    public int update(@PathVariable("agentId") String agentId, @RequestBody Agent agent) throws BadHttpRequest {
            agent.setFirstname(agent.getFirstname());
            agent.setLastname(agent.getLastname());
            return agentService.updateAgentById(agent, agentId);
    }
}
