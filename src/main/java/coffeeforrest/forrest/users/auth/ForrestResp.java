package coffeeforrest.forrest.users.auth;

import coffeeforrest.forrest.ForrestObject;

public class ForrestResp extends ForrestObject {
	
	private static final long serialVersionUID = -3743126389399496555L;
	
	// JSON Fields
	private String token;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	
}
