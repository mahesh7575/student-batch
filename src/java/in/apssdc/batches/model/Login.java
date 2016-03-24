package in.apssdc.batches.model;

import java.sql.Timestamp;

import com.andromeda.commons.model.BaseModel;

public class Login extends BaseModel {
	private Integer collegeid;
	private String userName;
	private String context;
	private Timestamp logTime;
	private Integer batchid;

	public Login(Integer collegeid, String userName, String context,
			Timestamp logTime, Integer batchid) {
		this.collegeid = collegeid;
		this.userName = userName;
		this.context = context;
		this.logTime = logTime;
		this.batchid = batchid;
	}

	public Integer getBatchid() {
		return batchid;
	}

	public void setBatchid(Integer batchid) {
		this.batchid = batchid;
	}

	public Integer getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(Integer collegeid) {
		this.collegeid = collegeid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Timestamp getLogTime() {
		return logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

}
