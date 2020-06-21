package com.project.spring;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService fortuneservice) {
		super();
		this.fortuneService = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a Hard 5K";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do it: "+ fortuneService.getFortune();
	}

}
