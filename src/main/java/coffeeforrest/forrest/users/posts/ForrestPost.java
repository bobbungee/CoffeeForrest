package coffeeforrest.forrest.users.posts;

import coffeeforrest.forrest.ForrestObject;
import com.google.gson.annotations.SerializedName;

public class ForrestPost extends ForrestObject {

	private static final long serialVersionUID = -3195956374665271189L;
	
	// fields
	private int id;
	private String tiny_id;
	private String post_type;
	private String post_url;
	private String created_at;
	private String updated_at;
	private ForrestUser user;
	private boolean published;
	@SerializedName("public")
		private boolean isPublic;
	private String title;
	private String url;
	private String content;
	private String description;
	private String formatted_description;
	private String like_count;
	private String comment_count;
	private ForrestSnaps snaps;
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the tiny_id
	 */
	public String getTinyId() {
		return tiny_id;
	}

	/**
	 * @return the post_type
	 */
	public String getPostType() {
		return post_type;
	}

	/**
	 * @return the post_url
	 */
	public String getPostUrl() {
		return post_url;
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
	public String getUpdatedAt() {
		return updated_at;
	}

	/**
	 * @return the published
	 */
	public boolean isPublished() {
		return published;
	}

	/**
	 * @return the isPublic
	 */
	public boolean isPublic() {
		return isPublic;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the formatted_description
	 */
	public String getFormattedDescription() {
		return formatted_description;
	}

	/**
	 * @return the like_count
	 */
	public String getLikeCount() {
		return like_count;
	}

	/**
	 * @return the comment_count
	 */
	public String getCommentCount() {
		return comment_count;
	}

	/**
	 * @return the user
	 */
	public ForrestUser getUser() {
		return user;
	}

	/**
	 * @return the snaps
	 */
	public ForrestSnaps getSnaps() {
		return snaps;
	}

}
