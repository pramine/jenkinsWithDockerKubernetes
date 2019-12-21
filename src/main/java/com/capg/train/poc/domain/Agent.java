package com.capg.train.poc.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {

    @Id
    private String agent_Id;
    private String firstname;
    private String lastname;
    private String email;

    public Agent(){

    }

    public Agent( String agentId,String firstname,String lastname,String email){
        this.agent_Id = agentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getAgent_Id() {
        return agent_Id;
    }

    public void setAgent_Id(String agentId) {
        this.agent_Id = agentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Agent{" + "agentId='" + agent_Id + '\'' + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\''
                + ", email='" + email + '\'' + '}';
    }
}
