package com.traineeservice.service;

import java.util.List;

import com.traineeservice.bean.ResponseDto;
import com.traineeservice.entity.Achievement;



public interface AchievementService {
//	void save(Achievement achievement);
//
//	Achievement get(Long id);
//
//	List<Achievement> getAll();
//
//	String deleteById(Long id);
//
//	void deleteAll();
//	Achievement update(Achievement achievement);
	
	ResponseDto getAchievement(Long id);
	Achievement saveAchievement(Achievement achievement);

}
