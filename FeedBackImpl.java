package com.feedback.ServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.DaoUser.DaoFeedBack;

import com.feedback.modelUser.Feedback;
import com.feedback.ServiceUser.FeedbackService;

	@Service
	public class FeedBackImpl  implements FeedbackService{
		@Autowired
		private  DaoFeedBack dao;

		@Override
		public Feedback createFeedback(Feedback feedback) {
	
			return dao.save(feedback);
		}

		@Override
		public Feedback updateFeedback(Feedback feedback) {
		
			return dao.save(feedback);
		}
		@Override
		public Feedback getfeedbackById(int userId)  {
			
			return dao.findById(userId).get();
		
		}
		

		@Override
		public List<Feedback> getAllFeedbacks() {
			
			return dao.findAll();
		}
		
		@Override
		public List<Feedback> getfeedbackByName(String userName) {
			
			return dao.findByName(userName);
		}

	
		@Override
		public void deleteFeedBackById(int userId) {
			 dao.deleteById(userId);
			
		}

	

	
	}
	