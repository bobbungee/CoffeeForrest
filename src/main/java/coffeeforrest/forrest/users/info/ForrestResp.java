package coffeeforrest.forrest.users.info;

import coffeeforrest.forrest.ForrestObject;

public class ForrestResp extends ForrestObject {

	private static final long serialVersionUID = 1991296034924066115L;
	
	// JSON Fields
	private int id;
	private String username;
	private String name;
	private String url;
	private String posts;
	private String comments;
	private String likes;
	private String followers;
	private String following;
	private ForrestPhotos photos;
	private String bio;
	private String is_a;
	private String homepage_url;
	private String twitter;
	private boolean in_directory;
	private String tag_string;

	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the posts
	 */
	public String getPosts() {
		return posts;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @return the likes
	 */
	public String getLikes() {
		return likes;
	}

	/**
	 * @return the followers
	 */
	public String getFollowers() {
		return followers;
	}

	/**
	 * @return the following
	 */
	public String getFollowing() {
		return following;
	}

	/**
	 * @return the photos
	 */
	public ForrestPhotos getPhotos() {
		return photos;
	}

	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * @return the is_a
	 */
	public String getIsA() {
		return is_a;
	}

	/**
	 * @return the homepage_url
	 */
	public String getHomepageUrl() {
		return homepage_url;
	}

	/**
	 * @return the twitter
	 */
	public String getTwitter() {
		return twitter;
	}

	/**
	 * @return the in_directory
	 */
	public boolean isInDirectory() {
		return in_directory;
	}

	/**
	 * @return the tag_string
	 */
	public String getTagString() {
		return tag_string;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
