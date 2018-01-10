package com.cusat.e_marketing.model;

public class LogInfo {
	private String email;
	private String lastLog;
	private String logInTime;
	private String logOutTime;
	private String duration;
	private String IPAddress;
	private int active;
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the lastLog
	 */
	public String getLastLog() {
		return lastLog;
	}
	/**
	 * @param lastLog the lastLog to set
	 */
	public void setLastLog(String lastLog) {
		this.lastLog = lastLog;
	}
	/**
	 * @return the logInTime
	 */
	public String getLogInTime() {
		return logInTime;
	}
	/**
	 * @param logInTime the logInTime to set
	 */
	public void setLogInTime(String logInTime) {
		this.logInTime = logInTime;
	}
	/**
	 * @return the logOutTime
	 */
	public String getLogOutTime() {
		return logOutTime;
	}
	/**
	 * @param logOutTime the logOutTime to set
	 */
	public void setLogOutTime(String logOutTime) {
		this.logOutTime = logOutTime;
	}
	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}
	/**
	 * @return the iPAddress
	 */
	public String getIPAddress() {
		return IPAddress;
	}
	/**
	 * @param iPAddress the iPAddress to set
	 */
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	/**
	 * @return the active
	 */
	public int getActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(int active) {
		this.active = active;
	}	
}
