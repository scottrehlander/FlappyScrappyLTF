package com.FlappyScrappy_LTF;

import org.cocos2d.actions.base.CCRepeatForever;
import org.cocos2d.actions.interval.CCAnimate;
import org.cocos2d.nodes.CCAnimation;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.nodes.CCSpriteFrame;
import org.cocos2d.nodes.CCSpriteSheet;
import org.cocos2d.opengl.CCTexture2D;
import org.cocos2d.types.CGRect;

import android.graphics.Bitmap;

import com.FlappyScrappy_LTF.Common.CoinType;

public class Coin extends CCSprite {

	private static int height;
	private static float width;
	public CoinType type;
	public boolean isEnable;
	public static CCAnimate animate;

	public Coin(CCTexture2D texture) {
		super(texture);
		// TODO Auto-generated constructor stub
	}

	public Coin(CCTexture2D texture, CGRect rect) {
		super(texture, rect);
		// TODO Auto-generated constructor stub
	}

	public Coin(CCSpriteFrame spriteFrame) {
		super(spriteFrame);
		// TODO Auto-generated constructor stub
	}

	public Coin(String spriteFrameName, boolean isFrame) {
		super(spriteFrameName, isFrame);
		// TODO Auto-generated constructor stub
	}

	public Coin(String filepath) {
		super(filepath);
		// TODO Auto-generated constructor stub
	}

	private static Coin _coin = null;
	public static Coin init( CoinType setType ) {		
		// TODO Auto-generated constructor stub
	    switch (setType) {
        case BOMB:
        {
            width = 60;
            height = 60;
            
            _coin = new Coin("item.png", CGRect.make(0, 0, width, height));

            break;
        }   
        case PROTECT:
        {
            
            break;
        }   
        case RAINBOW:
        {
            width = 60;
            height = 60;
            
            _coin = new Coin("item.png", CGRect.make(420, 0, width, height));

            break;
        }   
        case FAST:
        {
            
            break;
        }   
        case SUN:
        {
            width = 60;
            height = 60;

            _coin = new Coin("item.png", CGRect.make((int)((1 + Math.random() * 6)) * 60, 0, width, height));

            break;
        }
        case GOLD_COIN:
        {
        	// Create the coin spinning animation
        	width = 60;
            height = 60;
            
        	_coin = new Coin("coin (1).png");
	    	
        	CCAnimation animation = CCAnimation.animation("coin", 1f);
    	    for (int j = 1; j < 5; j++) {
    	    	animation.addFrame(String.format("coin (" + j + ").png", j));
    	    }
    	    CCAnimate coinAction = CCAnimate.action(.65f, animation, false);
    	    _coin.runAction(CCRepeatForever.action(coinAction));
        	        	
        	break;
        }
        case SKULL:
        {
        	// Create the coin spinning animation
        	_coin = new Coin("skull.png");
        	CCAnimation animation = CCAnimation.animation("skull", 1f);
	    	animation.addFrame("skull-right.png");
	    	animation.addFrame("skull-left.png");
    	    CCAnimate coinAction = CCAnimate.action(.85f, animation, false);
    	    _coin.runAction(CCRepeatForever.action(coinAction));
        }
        default:
            break;
	    }
    
	    _coin.setScaleX(Common.kXForIPhone * 0.5f);
	    _coin.setScaleY(Common.kXForIPhone * 0.5f);
	    _coin.type = setType;
	    _coin.isEnable = true;
	    
	    return _coin;

	}

	private Coin(String filepath, CGRect rect) {
		super(filepath, rect);
		// TODO Auto-generated constructor stub
	}

	public Coin(Bitmap image, String key) {
		super(image, key);
		// TODO Auto-generated constructor stub
	}

	public Coin(CCSpriteSheet spritesheet, CGRect rect) {
		super(spritesheet, rect);
		// TODO Auto-generated constructor stub
	}

	public CGRect rect()
	{
	    MoveLayer movelayer = (MoveLayer)this.parent_;
	    float deltaHeight = movelayer.originHeight - movelayer.getPosition().y;
	    float realPosX = (float) (Common.SCREEN_WIDTH / 2 + (getPosition().x - Common.SCREEN_WIDTH / 2) * ( 1 / ( 1 + deltaHeight * 1.5 / Common.SCREEN_HEIGHT) )); 
	    float realPosY = (float) (Common.SCREEN_HEIGHT / 2 + (getPosition().y - Common.SCREEN_HEIGHT / 2) * ( 1 / ( 1 + deltaHeight * 1.5 / Common.SCREEN_HEIGHT) ) - deltaHeight);
	    
		CGRect rt = CGRect.make(-width * getScaleX() / 2 * movelayer.getScaleX() + realPosX,
							   -height * getScaleY() / 2 * movelayer.getScaleY() + realPosY, 
							   width * getScaleX() * movelayer.getScaleX(), 
							   height * getScaleY() * movelayer.getScaleY());
		return rt;
	}
	
}
