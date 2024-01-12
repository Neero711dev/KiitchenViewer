package com.kview.model;

public class Kitchen {
    private int id;
    private String manager;
    private String managerMail;
    private String client;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getManagerMail() {
        return managerMail;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}

