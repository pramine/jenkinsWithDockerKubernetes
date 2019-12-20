package com.capg.train.poc.domain;

public class Agent {

    private String agentId;
    private String firstname;
    private String lastname;
    private String email;

    public Agent( String agentId,String firstname,String lastname,String email){
        this.agentId = agentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
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
        return "Agent{" + "agentId='" + agentId + '\'' + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\''
                + ", email='" + email + '\'' + '}';
    }
}
