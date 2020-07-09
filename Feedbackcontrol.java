package com.feedback.ControllerUser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.feedback.ServiceUser.FeedbackService;
import com.feedback.modelUser.Feedback;
@RestController
public class Feedbackcontrol   {

	@Autowired
	private FeedbackService service;
	@PostMapping("/feedback")
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		return service.createFeedback(feedback);
	}

	@PutMapping("/feedback")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		return service.updateFeedback(feedback);
	}

	@GetMapping("/feedback/{userid}")
	public Feedback getFeedbackById(@PathVariable("userId") int userId) {
		return service.getfeedbackById(userId);
		
	}
	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {
		
		return service.getAllFeedbacks();
	}

	@GetMapping("/feedbacks/username/{username}")
	public List<Feedback> getfeedbackByName(@PathVariable("userName") String userName) {
		
		return service.getfeedbackByName(userName);
	}

	@DeleteMapping("/feedback/{userid}")
	public void deleteFeedBackById(@PathVariable("userId")int userId) {
		
		 service.deleteFeedBackById(userId);
		
	}

}
