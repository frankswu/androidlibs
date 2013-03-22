package lk.zmessenger.consumerwatchconsummer.domain;

// Generated Feb 20, 2013 4:50:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * CompDescription generated by hbm2java
 */
public class CompDescription {

	@Expose
	@SerializedName("comp_description_id")
	private Integer compDescriptionId;
	// private CompComplain compComplain;
	@Expose
	@SerializedName("description")
	private String description;
	private Byte deleted;
	private Date addedDate;
	private Date editedDate;
	@Expose
	@SerializedName("comp_responses")
	private List<CompResponse> compResponses;

	public Integer getCompDescriptionId() {
		return this.compDescriptionId;
	}

	public void setCompDescriptionId(Integer compDescriptionId) {
		this.compDescriptionId = compDescriptionId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Byte deleted) {
		this.deleted = deleted;
	}

	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Date getEditedDate() {
		return this.editedDate;
	}

	public void setEditedDate(Date editedDate) {
		this.editedDate = editedDate;
	}

	public List<CompResponse> getCompResponses() {
		return compResponses;
	}

	public void setCompResponses(List<CompResponse> compResponses) {
		this.compResponses = compResponses;
	}

	

}