package coffeeforrest.forrest.post.comments;

import java.util.Map;

import coffeeforrest.forrest.ForrestObject;

public class ForrestItem extends ForrestObject {

	private static final long serialVersionUID = 6586900878203173858L;
	
	// fields
	private String stat;
	private double in;
	private boolean authed;
	private Map<Integer, String> authed_as;
	private String env;
	private ForrestResp resp;
	
	/**
	 * @return the stat
	 */
	public String getStat() {
		return stat;
	}

	/**
	 * @return the in
	 */
	public double getIn() {
		return in;
	}

	/**
	 * @return the authed
	 */
	public boolean getAuthed() {
		return authed;
	}

	/**
	 * @return the env
	 */
	public String getEnv() {
		return env;
	}

	/**
	 * @return the resp
	 */
	public ForrestResp getResp() {
		return resp;
	}

	/**
	 * @return the authed_as
	 */
	public Map<Integer, String> getAuthedAs() {
		return authed_as;
	}
	
}
