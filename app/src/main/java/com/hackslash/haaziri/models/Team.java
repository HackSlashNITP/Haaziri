package com.hackslash.haaziri.models;

public class Team {
    String teamName;
    String teamCode;
    String teamOwnerUid;
    String bluetoothId;
    String currentSessionId;

    public Team(){}

    public Team(String teamName, String teamCode, String teamOwnerUid) {
        this.teamName = teamName;
        this.teamCode = teamCode;
        this.teamOwnerUid = teamOwnerUid;
        bluetoothId = "";
        currentSessionId = "";
    }

    public String getTeamOwnerUid() {
        return teamOwnerUid;
    }

    public void setTeamOwnerUid(String teamOwnerUid) {
        this.teamOwnerUid = teamOwnerUid;
    }

    public String getBluetoothId() {
        return bluetoothId;
    }

    public void setBluetoothId(String bluetoothId) {
        this.bluetoothId = bluetoothId;
    }

    public String getCurrentSessionId() {
        return currentSessionId;
    }

    public void setCurrentSessionId(String currentSessionId) {
        this.currentSessionId = currentSessionId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }
}
