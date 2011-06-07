package coffeeforrest.forrest.users.posts;

import java.util.List;

import coffeeforrest.forrest.ForrestObject;

public class ForrestResp extends ForrestObject {

	private static final long serialVersionUID = -4857001379315825443L;
	
	// JSON Fields
	private List<ForrestPost> posts;

	
	/**
	 * @return the posts
	 */
	public List<ForrestPost> getPosts() {
		return posts;
	}
	
}
