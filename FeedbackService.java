package com.feedback.ServiceUser;
import java.util.List;
import com.feedback.modelUser.Feedback;

	public interface FeedbackService {
		public Feedback createFeedback(Feedback feedback);
		public Feedback updateFeedback(Feedback feedback);
		public Feedback getfeedbackById(int userId);
		public List<Feedback> getAllFeedbacks();
		public List<Feedback> getfeedbackByName(String userName);
		public void deleteFeedBackById(int userId);
	}


