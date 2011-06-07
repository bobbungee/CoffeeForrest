package coffeeforrest.forrest.post.comments;

import coffeeforrest.forrest.ForrestObject;

public class ForrestComment extends ForrestObject {

	private static final long serialVersionUID = -3260300850847946980L;
	
	// fields
	private int id;
	private ForrestUser user;
	private String body;
	private String created_at;
	private String updated_at;
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return the user
	 */
	public ForrestUser getUser() {
		return user;
	}
	
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	
	/**
	 * @return the created_at
	 */
	public String getCreatedAt() {
		return created_at;
	}
	
	/**
	 * @return the updated_at
	 */
	public String getUpdated_at() {
		return updated_at;
	}
	
}
