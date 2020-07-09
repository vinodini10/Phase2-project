package com.feedback.DaoUser;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feedback.modelUser.Feedback;
@Repository
public interface DaoFeedBack extends JpaRepository<Feedback ,Integer> {
	
	public List<Feedback> findByName(String userName);
	
	
}


