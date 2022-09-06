package com.app.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.app.Topic.Topic;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name = "course_topic")
public class Course {

	@Id
	private String id;
	private String name;
	private String technology;
	@ManyToOne
	private Topic topic;
	
	
	public Course() {
		super();
	}

	public Course(String id, String name, String technology, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.technology = technology;
		this.topic = new Topic(topicId, "", "");
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTechnology() {
		return technology;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", technology=" + technology + ", topic=" + topic + "]";
	}

	

}
