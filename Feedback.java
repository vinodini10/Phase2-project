package com.feedback.modelUser;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table
public class Feedback {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int userId;
		private String userName;
		private String userMailID;
		private String clientFeedback;
		public Feedback() {
			// TODO Auto-generated constructor stub
			
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserMailID() {
			return userMailID;
		}
		public void setUserMailID(String userMailID) {
			this.userMailID = userMailID;
		}
		public String getClientFeedback() {
			return clientFeedback;
		}
		public void setClientFeedback(String clientFeedback) {
			this.clientFeedback = clientFeedback;
		}
	}


