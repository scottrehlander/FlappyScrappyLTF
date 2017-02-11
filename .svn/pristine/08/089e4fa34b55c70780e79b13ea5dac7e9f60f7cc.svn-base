package com.FlappyScrappy_LTF;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.nodes.CCTextureCache;
import org.cocos2d.opengl.CCTexture2D;

import com.FlappyScrappy_LTF.R;


public class HelloWorldLayer extends CCLayer {

	private CCSprite back;

	public HelloWorldLayer() {
		init();
	}
	
	@Override
	public void onEnter() {
        schedule("transitionLater", 4.0f);

		super.onEnter();
	}
	
	public void transitionLater(float dt){
		CCScene scene = CCScene.node();
	 	scene.addChild(new MenuLayer(), 1);
		CCDirector.sharedDirector().replaceScene(scene);
	}
	
	@Override
	public void onExit() {
		removeCache();
		removeAllChildren(true);
		unscheduleAllSelectors();
		super.onExit();
	}
    	
	private void init() {
		back = CCSprite.sprite("loading.png");
        back.setScaleX(.5F * Common.kXForIPhone);
        back.setScaleY(.5F * Common.kYForIPhone);
        back.setPosition(Common.SCREEN_WIDTH / 2, Common.SCREEN_HEIGHT / 2);
        addChild(back, 1);
        MediaGlobal._shared().playMusic(R.raw.gamebg, true);
        
        TrackMetrics();
    }

	private void removeSprite( CCSprite sp )
	{
	    CCTexture2D tex = sp.getTexture();
	    CCTextureCache.sharedTextureCache().removeTexture(tex);
	    sp.removeFromParentAndCleanup(true);
	}

	private void removeCache()
	{
	    removeSprite(back);
	}
	
	private void TrackMetrics()
	{
		try 
		{
			// Check for a user id
	        MetricsUserInfo userInfo = Common.getMetricInfo();
	        if(userInfo == null) {
		        // If a user id doesn't exist, grab one and make the metrics request
		        MetricRequestEvent newUserRequest = new MetricRequestAddUser();
		        RequestTask task = new RequestTask(newUserRequest);
		        task.execute("http://rehlander.com/7popmetrics/7pop_GetNewUser.php?sk=newUser");
	        }
	        else
	        {
	        	Common.setMetricInfo(userInfo.UserId, userInfo.TimesOpened + 1);
	        	
	        	RequestTask task = new RequestTask();
		        task.execute("http://rehlander.com/7popmetrics/7popMetrics.php?sk=track&timesOpened=" + (userInfo.TimesOpened + 1) +"&uid=" + userInfo.UserId + "&gameName=FlappyScrappyLearnsToFly");
	        }
		}
		catch(Exception e)
		{
			// Ignore exceptions, just don't crash.
		}
	}
}
