package com.example.demo.resource;

import com.example.demo.domain.Agent;
import com.example.demo.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import javassist.tools.web.BadHttpRequest;

import java.util.Optional;

@RestController
@RequestMapping(path = "/agents")
public class AgentController {

    AgentService agentService;

    public AgentController(AgentService  agentService){
        this.agentService = agentService;
    }



    @GetMapping
    public Agent findAgent(String agentId) {
        return agentService.retrieveAgentByAgentId(agentId);
    }

    @GetMapping(path = "/{agentId}")
    public Agent find(@PathVariable("agentId") String agentId) {
        return agentService.retrieveAgentByAgentId(agentId);
    }

    @PostMapping(consumes = "application/json")
    public int create(@RequestBody Agent agent) {
        return agentService.createAgentInDB(agent);
    }

   /* @DeleteMapping(path = "/{agentId}")
    public void delete(@PathVariable("agentId") String agentId) {
        repository.deleteById(agentId);
    }

    @PutMapping(path = "/{agentId}")
    public Agent update(@PathVariable("agentId") String agentId, @RequestBody Agent agent) throws BadHttpRequest {
        if (repository.existsById(agentId)) {
            agent.setFirstname(agent.getFirstname());
            return repository.save(agent);
        } else {
            throw new BadHttpRequest();
        }
    }*/
}
