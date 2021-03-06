package com.actionlistapi.pojo;

import lombok.Data;

@Data
public class ProcessInstanceStatus {

    private String code;
	
    public ProcessInstanceStatus(String code) {
        this.code = code;
    }
    public String getLabel() {
        switch(getCode())
        {
        case "P":
            return "Preroute";
        case "R":
            return "Enroute";
        case "C":
            return "Completed";
        case "A":
            return "Aborted";
        case "S":
            return "Suspended";
        default:
            return "No Mapping Found";
        }
    }	
}
