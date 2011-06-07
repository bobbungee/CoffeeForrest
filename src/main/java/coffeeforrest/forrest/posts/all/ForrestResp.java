package coffeeforrest.forrest.posts.all;

import java.util.List;

import coffeeforrest.forrest.ForrestObject;

public class ForrestResp extends ForrestObject {
	
	private static final long serialVersionUID = -7995899200307593308L;
	
	// JSON Fields
	private List<ForrestPost> posts;
	private int page;
	
	
	/**
	 * @return the posts
	 */
	public List<ForrestPost> getPosts() {
		return posts;
	}

	/**
	 * @return the page
	 */
	public int getPage() {
		return page;
	}
	
}
