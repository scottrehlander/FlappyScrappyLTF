package com.FlappyScrappy_LTF;

public class MetricRequestAddUser implements MetricRequestEvent 
{
	public void EventFired(String result){
		// We got the user ID, write it
		Common.setMetricInfo(Integer.parseInt(result), 1);
		
		RequestTask writeMetric = new RequestTask();
		writeMetric.execute("http://rehlander.com/7popmetrics/7popMetrics.php?sk=track&timesOpened=1&uid=" + result + "&gameName=FlappyScrappyLearnsToFly");
	}
}
