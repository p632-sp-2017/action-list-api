package com.actionlistapi.model;

import java.util.ArrayList;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.actionlistapi.pojo.ActionRequested;
import com.actionlistapi.pojo.ProcessInstanceStatus;
import com.actionlistapi.services.ActionRequestedConverter;
import com.actionlistapi.services.ProcessInstanceStatusConverter;
import com.actionlistapi.services.RouteNodeConverter;

@Entity
public class ActionRequest {
	
	@Id 
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy = "uuid")
	private String id;
	
    private String processInstanceId;
	
	private String username;
	
	@OneToOne
	private ProcessType processType;
	
    private String title;
	
    @Convert(converter = ProcessInstanceStatusConverter.class)
    private ProcessInstanceStatus processInstanceStatus;

    @Convert(converter = ActionRequestedConverter.class)
    private ActionRequested actionRequested;
	
    private String initiator;

    private String delegator;
	
    private String group_;
	
    @Convert(converter = RouteNodeConverter.class)
    private ArrayList<String> routeNodes;
	
    private String lastApprovedDate;
	
    private String creationDate;
	
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public ProcessType getProcessType() {
        return processType;
    }

    public void setProcessType(ProcessType processType) {
        this.processType = processType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ProcessInstanceStatus getProcessInstanceStatus() {
        return processInstanceStatus;
    }

    public void setProcessInstanceStatus(ProcessInstanceStatus processInstanceStatus) {
        this.processInstanceStatus = processInstanceStatus;
    }

    public ActionRequested getActionRequested() {
        return actionRequested;
    }

    public void setActionRequested(ActionRequested actionRequested) {
        this.actionRequested = actionRequested;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getDelegator() {
        return delegator;
    }
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

    public String getGroup() {
        return group_;
    }

    public void setGroup(String group_) {
        this.group_ = group_;
    }

    public ArrayList<String> getRouteNodes() {
        return routeNodes;
    }

    public void setRouteNodes(ArrayList<String> routeNodes) {
        this.routeNodes = routeNodes;
    }

    public String getLastApprovedDate() {
        return lastApprovedDate;
    }

    public void setLastApprovedDate(String lastApprovedDate) {
        this.lastApprovedDate = lastApprovedDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
