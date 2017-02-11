package com.FlappyScrappy_LTF;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.menus.CCMenu;
import org.cocos2d.menus.CCMenuItemImage;
import org.cocos2d.nodes.CCLabel;
import org.cocos2d.nodes.CCLabelAtlas;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.nodes.CCTextureCache;
import org.cocos2d.opengl.CCTexture2D;
import org.cocos2d.types.ccColor3B;

public class GameOverLayer extends CCLayer {

	public final float GAMEOVER_TITLE_X   = (108 * Common.kXForIPhone);
	public final float GAMEOVER_TITLE_Y   = (205 * Common.kXForIPhone);
	public final float GAMEOVER_ALLLENGHT_X   = (26 * Common.kXForIPhone);
	public final float GAMEOVER_ALLLENGHT_Y   = (105 * Common.kYForIPhone);
	public final float GAMEOVER_PLAYERNAME_X  = (282 * Common.kXForIPhone);
	public final float GAMEOVER_PLAYERNAME_Y  = (118 * Common.kYForIPhone);
	public final float GAMEOVER_RANK_X        = (108 * Common.kXForIPhone);
	public final float GAMEOVER_RANK_Y        = (175 * Common.kYForIPhone);
	public final float GAMEOVER_RANK_LABEL_X  = (122 * Common.kXForIPhone);
	public final float GAMEOVER_RANK_LABEL_Y  = (168 * Common.kYForIPhone);
	public final float GAMEOVER_SUN_X         = (48 * Common.kXForIPhone);
	public final float GAMEOVER_SUN_Y         = (100 * Common.kYForIPhone);
	public final float GAMEOVER_SUN_LABEL_X   = (66 * Common.kXForIPhone);
	public final float GAMEOVER_SUN_LABEL_Y   = (88 * Common.kYForIPhone);
	public final float GAMEOVER_TXT_X         = (340 * Common.kXForIPhone);
	public final float GAMEOVER_TXT_Y         = (138 * Common.kYForIPhone);
	public final float GAMEOVER_GAME_STATS_X  = (335 * Common.kXForIPhone);
	public final float GAMEOVER_GAME_STATS_Y  = (154 * Common.kXForIPhone);
	public final float GAMEOVER_TXT_DISTANCE_X= (265 * Common.kXForIPhone);
	public final float GAMEOVER_TXT_DISTANCE_Y= (198 * Common.kYForIPhone);
	public final float GAMEOVER_TXT_TIME_X    = (265 * Common.kXForIPhone);
	public final float GAMEOVER_TXT_TIME_Y    = (179 * Common.kYForIPhone);
	public final float GAMEOVER_TXT_BIRD_X    = (265 * Common.kXForIPhone);
	public final float GAMEOVER_TXT_BIRD_Y    = (160 * Common.kYForIPhone);
	public final float GAMEOVER_TXT_TOTAL_X   = (265 * Common.kXForIPhone);
	public final float GAMEOVER_TXT_TOTAL_Y   = (141 * Common.kYForIPhone);
	public final float GAMEOVER_TXT_SPEED_X   = (265 * Common.kXForIPhone);
	public final float GAMEOVER_TXT_SPEED_Y   = (120 * Common.kYForIPhone);
	public final float GAMEOVER_RETRY_X       = (170 * Common.kXForIPhone);
	public final float GAMEOVER_RETRY_Y       = (43 * Common.kYForIPhone);
	public final float GAMEOVER_MENU_X        = (330 * Common.kXForIPhone);
	public final float GAMEOVER_MENU_Y        = (43 * Common.kYForIPhone);

	private CCSprite gameOver;
	private CCSprite background;
	private CCSprite gameStats;
	private CCLabelAtlas lblAllLength;
	private CCSprite sunCount;
	private CCLabelAtlas lblSunCount;
	private CCSprite txtSprite;
	private CCLabel lblDistance;
	private CCLabel lblTime;
	private CCLabel lblBirdsHits;
	private CCLabel lblTotalDistance;
	private CCLabel lblSpeed;
	private CCSprite rankSprite;
	private CCLabelAtlas lblLank;
	public CCMenuItemImage retry;
	public CCMenuItemImage menu;

	public GameOverLayer() {
		// TODO Auto-generated constructor stub
		init();
	}

	private void init() {
		background = new CCSprite("bga0.png");
        background.setScaleX(.5f * Common.kXForIPhone);
        background.setScaleY(.5f * Common.kYForIPhone);
        background.setPosition(Common.SCREEN_WIDTH / 2, Common.SCREEN_HEIGHT / 2);
        addChild(background, 0);
		
        gameOver = CCSprite.sprite("gameoverheader.png");
        gameOver.setScaleX(.35F * Common.kXForIPhone);
        gameOver.setScaleY(.35F * Common.kYForIPhone);
        gameOver.setPosition(GAMEOVER_TITLE_X, GAMEOVER_TITLE_Y);
        addChild(gameOver, 1);
        
        gameStats = CCSprite.sprite("gamestats.png");
        gameStats.setScaleX(.5F * Common.kXForIPhone);
        gameStats.setScaleY(.5F * Common.kYForIPhone);
        gameStats.setPosition(GAMEOVER_GAME_STATS_X, GAMEOVER_GAME_STATS_Y);
        addChild(gameStats, 1);
        
        lblAllLength = CCLabelAtlas.label("0123456789", "num1.png", 33, 33, '0');
        lblAllLength.setScale(Common.kXForIPhone);
        lblAllLength.setPosition(GAMEOVER_ALLLENGHT_X, GAMEOVER_ALLLENGHT_Y);
        lblAllLength.setString("0");
        addChild(lblAllLength, 1);
        
        //sunCount = CCSprite.sprite("oversun.png");
        //sunCount.setScale(Common.kXForIPhone*0.5f);
        //sunCount.setPosition(GAMEOVER_SUN_X, GAMEOVER_SUN_Y);
        //addChild(sunCount, 0);
        
        //lblSunCount = CCLabelAtlas.label("0123456789", "num4.png", 18, 18, '0');
        //lblSunCount.setScale(Common.kXForIPhone);
        //lblSunCount.setPosition(GAMEOVER_SUN_LABEL_X, GAMEOVER_SUN_LABEL_Y);
        //lblSunCount.setString("0");
        //addChild(lblSunCount, 1);
        
        //txtSprite = CCSprite.sprite("txt.png");
        //txtSprite.setScaleX(Common.kXForIPhone);
        //txtSprite.setScaleY(Common.kYForIPhone);
        //txtSprite.setPosition(GAMEOVER_TXT_X, GAMEOVER_TXT_Y);
        //addChild(txtSprite, 0);
        
        lblDistance = CCLabel.makeLabel(" ", "Arial", 28);
        lblDistance.setScale(.5f * Common.kXForIPhone);
        lblDistance.setAnchorPoint(0, 0);
        lblDistance.setPosition(GAMEOVER_TXT_DISTANCE_X, GAMEOVER_TXT_DISTANCE_Y);
        lblDistance.setString(String.format("%d", 0));
        lblDistance.setColor(ccColor3B.ccBLACK);
        addChild(lblDistance, 3);
        
        lblTime = CCLabel.makeLabel(" ", "Arial", 28);
        lblTime.setScale(.5f * Common.kXForIPhone);
        lblTime.setAnchorPoint(0, 0);
        lblTime.setPosition(GAMEOVER_TXT_TIME_X, GAMEOVER_TXT_TIME_Y);
        lblTime.setString(String.format("%d", 0));
        lblTime.setColor(ccColor3B.ccBLACK);
        addChild(lblTime, 3);
        
        lblBirdsHits = CCLabel.makeLabel(" ", "Arial", 28);
        lblBirdsHits.setScale(.5f * Common.kXForIPhone);
        lblBirdsHits.setAnchorPoint(0, 0);
        lblBirdsHits.setPosition(GAMEOVER_TXT_BIRD_X, GAMEOVER_TXT_BIRD_Y);
        lblBirdsHits.setString(String.format("%d", 0));
        lblBirdsHits.setColor(ccColor3B.ccBLACK);
        addChild(lblBirdsHits, 3);
        
        lblTotalDistance = CCLabel.makeLabel(" ", "Arial", 28);
        lblTotalDistance.setScale(.5f * Common.kXForIPhone);
        lblTotalDistance.setAnchorPoint(0, 0);
        lblTotalDistance.setPosition(GAMEOVER_TXT_TOTAL_X, GAMEOVER_TXT_TOTAL_Y);
        lblTotalDistance.setString(String.format("%.01f", 0.0f));
        lblTotalDistance.setColor(ccColor3B.ccBLACK);
        addChild(lblTotalDistance, 3);
        
        lblSpeed = CCLabel.makeLabel(" ", "Arial", 28);
        lblSpeed.setScale(.5f * Common.kXForIPhone);
        lblSpeed.setAnchorPoint(0, 0);
        lblSpeed.setPosition(GAMEOVER_TXT_SPEED_X, GAMEOVER_TXT_SPEED_Y);
        lblSpeed.setString(String.format("%d", 0));
        lblSpeed.setColor(ccColor3B.ccBLACK);
        addChild(lblSpeed, 3);
        
        rankSprite = CCSprite.sprite("rank.png");
        rankSprite.setScale(.25F * Common.kXForIPhone);
        rankSprite.setPosition(GAMEOVER_RANK_X, GAMEOVER_RANK_Y);
        addChild(rankSprite, 3);
        
        lblLank = CCLabelAtlas.label("0123456789", "num4.png", 18, 18, '0');
        lblLank.setScale(Common.kXForIPhone);
        lblLank.setPosition(GAMEOVER_RANK_LABEL_X, GAMEOVER_RANK_LABEL_Y);
        lblLank.setString(String.format("0", 0));
        addChild(lblLank, 3); 
        
        retry = CCMenuItemImage.item("retry.png", "retry1.png", this, "onRetry");
        retry.setScale(.25F * Common.kXForIPhone);
        retry.setPosition(GAMEOVER_RETRY_X, GAMEOVER_RETRY_Y);
        retry.setVisible(false);
        
        menu = CCMenuItemImage.item("menu.png", "menu1.png", this, "onMenu");
        menu.setScale(.25F * Common.kXForIPhone);
        menu.setPosition(GAMEOVER_MENU_X, GAMEOVER_MENU_Y);
        menu.setVisible(false);
        
        CCMenu menus = CCMenu.menu(retry, menu);
        menus.setPosition(0, 0);
        addChild(menus, 3);
	}

	public void updateLabels()
	{
	    GameLayer gameLayer = (GameLayer)this.parent_;
	    
	    String string = String.format("%d", gameLayer.player.score);
	    lblAllLength.setString(string);
	    
	    //string = String.format("%d", gameLayer.player.sunCount);
	    //lblSunCount.setString(string);
	    
	    string = String.format("Distance: %d m", gameLayer.player.flayLength / 3);
	    lblDistance.setString(string);
	    
	    string = String.format("Time: %d s", (int)(gameLayer.player.endTime - gameLayer.player.startTime));
	    lblTime.setString(string);
	    
	    string = String.format("Birds Hit: %d", gameLayer.player.birdCount);
	    lblBirdsHits.setString(string);
	    
	    string = String.format("Total distance: %.01f km", gameLayer.player.totalDistance / 1000);
	    lblTotalDistance.setString(string);
	    
	    string = String.format("Speed: %.03f m/s", (float)gameLayer.player.flayLength / 3 / (gameLayer.player.endTime - gameLayer.player.startTime));
	    lblSpeed.setString(string);
	    
	    string = String.format("%d", gameLayer.player.rank + 1);
	    lblLank.setString(string);
	    
	}

	public void onRetry( Object sender )
	{
	    GameLayer gameLayer = (GameLayer)this.parent_;
	    
	    retry.setVisible(false);
	    menu.setVisible(false);
	    gameLayer.player.saveUserInfo();
	    gameLayer.onRetry(sender);
	}
	
	public void onMenu( Object sender )
	{
	    GameLayer gameLayer = (GameLayer)this.parent_;
	    
	    gameLayer.player.saveUserInfo();

	    gameLayer.onMenu(sender);
	}

	private void removeSprite( CCSprite sp )
	{
	    CCTexture2D tex = sp.getTexture();
	    CCTextureCache.sharedTextureCache().removeTexture(tex);
	    sp.removeFromParentAndCleanup(true);
	}

	private void removeCache()
	{
	    removeSprite(gameOver);
	    //removeSprite(sunCount);
	    //removeSprite(txtSprite);
	    removeSprite(rankSprite);
	    
	    CCTexture2D tex = lblAllLength.getTexture();
	    CCTextureCache.sharedTextureCache().removeTexture(tex);
	    lblAllLength.removeFromParentAndCleanup(true);
	    
	    //tex = lblSunCount.getTexture();
	    //CCTextureCache.sharedTextureCache().removeTexture(tex);
	    //lblSunCount.removeFromParentAndCleanup(true);

	    tex = lblLank.getTexture();
	    CCTextureCache.sharedTextureCache().removeTexture(tex);
	    lblLank.removeFromParentAndCleanup(true);

	    removeSprite((CCSprite)retry.getNormalImage());
	    removeSprite((CCSprite)retry.getSelectedImage());
	    retry.removeFromParentAndCleanup(true);

	    removeSprite((CCSprite)menu.getNormalImage());
	    removeSprite((CCSprite)menu.getSelectedImage());
	    menu.removeFromParentAndCleanup(true);

	}
	
	@Override
	public void onExit() {
		removeCache();
		super.onExit();
	}
}
