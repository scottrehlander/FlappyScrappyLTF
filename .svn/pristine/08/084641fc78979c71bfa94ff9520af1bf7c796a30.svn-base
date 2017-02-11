package com.FlappyScrappy_LTF;

import org.cocos2d.actions.base.CCRepeatForever;
import org.cocos2d.actions.interval.CCAnimate;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.menus.CCMenu;
import org.cocos2d.menus.CCMenuItemImage;
import org.cocos2d.menus.CCMenuItemToggle;
import org.cocos2d.nodes.CCAnimation;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.nodes.CCTextureCache;
import org.cocos2d.opengl.CCTexture2D;
import org.cocos2d.transitions.CCFadeTransition;
import org.cocos2d.types.CGPoint;

import com.FlappyScrappy_LTF.R;


public class MenuLayer extends CCLayer {

	private float TOP_Y =  (40 * Common.kYForIPhone);
	private float TOP_X  = (38 * Common.kXForIPhone);

	private float SOUND_Y= (280 * Common.kYForIPhone);
	private float SOUND_X= (38 * Common.kXForIPhone);

	private CCSprite back;
	private CCMenuItemImage topMenuItem;
	private CCMenuItemImage soundOnMenuItem;
	private CCMenuItemImage soundOffMenuItem;
	private CCMenuItemToggle soundMenuItem;
	private CCMenuItemImage playMenuItem;
	private CCSprite bird;
	private CCSprite title;
	
	public MenuLayer() {
		// TODO Auto-generated constructor stub
		init();
	}
	
	private void init() {
        back = CCSprite.sprite("bga0.png");
        back.setScaleX(.5F * Common.kXForIPhone);
        back.setScaleY(.5F * Common.kYForIPhone);
        back.setPosition(Common.SCREEN_WIDTH / 2, Common.SCREEN_HEIGHT / 2);
        addChild(back, Common.ztag_In_camera.ztag_min);
        
        topMenuItem = CCMenuItemImage.item("top.png", "top.png", this, "onTop");
        topMenuItem.setScale(.25F * Common.kXForIPhone);
        topMenuItem.setPosition(TOP_X, TOP_Y);
        
        CCSprite tempSprite = (CCSprite) topMenuItem.getSelectedImage();
        tempSprite.setScale(1.1f);
        
        soundOnMenuItem = CCMenuItemImage.item("sound_on.png", "sound_on.png");
        soundOffMenuItem = CCMenuItemImage.item("sound_off.png", "sound_off.png");
        soundMenuItem = CCMenuItemToggle.item(this, "onSound", soundOnMenuItem, soundOffMenuItem);
        soundMenuItem.setScale(.25F * Common.kXForIPhone);
        soundMenuItem.setPosition(SOUND_X, SOUND_Y);
        
        playMenuItem = CCMenuItemImage.item("play.png", "play1.png", this, "onPlay");
        playMenuItem.setScale(.25F * Common.kXForIPhone);
        playMenuItem.setPosition(270 * Common.kXForIPhone, 100 * Common.kYForIPhone);
        
    	bird = new CCSprite("0100001.png");
    	CCAnimation animation = CCAnimation.animation("menu_flap", 1f);
	    animation.addFrame("0100002.png");
	    animation.addFrame("0100017.png");
	    animation.addFrame("0100018.png");
	    animation.addFrame("0100019.png");
	    animation.addFrame("0100020.png");
	    CCAnimate flapAction = CCAnimate.action(.65f, animation, false);
	    bird.runAction(CCRepeatForever.action(flapAction));
	    bird.setPosition(145 * Common.kXForIPhone, 100 * Common.kYForIPhone);
	    bird.setScale(1 * Common.kXForIPhone);
	    addChild(bird, 100);
	    
	    title = new CCSprite("title.png");
	    title.setPosition(Common.SCREEN_WIDTH / 2, 210 * Common.kYForIPhone);
	    title.setScale(.45f * Common.kXForIPhone);
	    addChild(title, 100);

        if (Common.g_soundMute == false) {
            soundMenuItem.setSelectedIndex(0);
        }
        else
            soundMenuItem.setSelectedIndex(1);

        CCMenu menu = CCMenu.menu(topMenuItem, soundMenuItem, playMenuItem);
        menu.setPosition(CGPoint.zero());
        addChild(menu, Common.ztag_In_camera.ztag_menu);
	}
	
	public void onTop( Object sender )
	{
		CCScene scene = CCScene.node();
	 	scene.addChild(new ScoreLayer(), 1);
	 	CCDirector.sharedDirector().replaceScene(new CCFadeTransition(0.5f, scene));
	}

	public void onSound( Object sender )
	{
	    Common.g_soundMute = !Common.g_soundMute;
	    if( Common.g_soundMute )
	    	MediaGlobal._shared().setMute(true);
	    else
	    {
	    	MediaGlobal._shared().setMute(false);
	        MediaGlobal._shared().playMusic(R.raw.gamebg, true);
	    }
	}
	
	public void onPlay( Object sender )
	{
		CCScene scene = CCScene.node();
	 	scene.addChild(new GameLayer(), 1);
	 	CCDirector.sharedDirector().replaceScene(scene);
	}

	public void removeSprite( CCSprite sp )
	{
	    CCTexture2D tex = sp.getTexture();
	    CCTextureCache.sharedTextureCache().removeTexture(tex);
	    sp.removeFromParentAndCleanup(true);
	}

	public void removeCache()
	{
	    removeSprite(back);
	    
	    removeSprite((CCSprite)topMenuItem.getNormalImage());
	    removeSprite((CCSprite)topMenuItem.getSelectedImage());
	    topMenuItem.removeFromParentAndCleanup(true);
	    
	    removeSprite((CCSprite)playMenuItem.getNormalImage());
	    removeSprite((CCSprite)playMenuItem.getSelectedImage());
	    playMenuItem.removeFromParentAndCleanup(true);

	    removeSprite((CCSprite)soundOnMenuItem.getNormalImage());
	    removeSprite((CCSprite)soundOnMenuItem.getSelectedImage());
	    soundOnMenuItem.removeFromParentAndCleanup(true);

	    removeSprite((CCSprite)soundOffMenuItem.getNormalImage());
	    removeSprite((CCSprite)soundOffMenuItem.getSelectedImage());
	    soundOffMenuItem.removeFromParentAndCleanup(true);
	    
	    removeSprite(bird);
	    bird.removeFromParentAndCleanup(true);
	    
	    removeSprite(title);
	    title.removeFromParentAndCleanup(true);
	}
	
	@Override
	public void onExit() {
		removeCache();
		super.onExit();
	}
}
