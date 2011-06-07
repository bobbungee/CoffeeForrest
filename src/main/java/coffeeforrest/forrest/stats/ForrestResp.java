package coffeeforrest.forrest.stats;

import coffeeforrest.forrest.ForrestObject;

public class ForrestResp extends ForrestObject {
	
	private static final long serialVersionUID = -1898108216289126201L;
	
	// JSON Fields
	private long rate_limit;
	private String calls_made;

	/**
	 * @return the rate_limit
	 */
	public long getRateLimit() {
		return rate_limit;
	}

	/**
	 * @return the calls_made
	 */
	public String getCallsMade() {
		return calls_made;
	}

}
