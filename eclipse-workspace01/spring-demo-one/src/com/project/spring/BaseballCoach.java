package com.project.spring;

public class BaseballCoach implements Coach {
	
    private FortuneService fortuneService;
    public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	} 
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		//use my fortuneservice to get fortune
		return fortuneService.getFortune();
	}
}
