package net.petrikainulainen.spring.trenches.comment.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Petri Kainulainen
 */
public class CommentDTO {

	// @NotEmpty
	@NotEmpty(message = "Please enter mobile number")
	@Length(max = 140)
	private String text;

	public CommentDTO() {

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
