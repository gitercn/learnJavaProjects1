package cn.sxt.callback2;

import java.awt.event.KeyEvent;

/**
 * 这个View就相当于B类
 * @author xiaanming
 *
 */
public class View implements Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource {
	/**
     * Listener used to dispatch click events.
     * This field should be made private, so it is hidden from the SDK.
     * {@hide}
     */
    protected OnClickListener mOnClickListener;
    
    /**
     * setOnClickListener()的参数是OnClickListener接口------>背景三
     * Register a callback to be invoked when this view is clicked. If this view is not
     * clickable, it becomes clickable.
     *
     * @param l The callback that will run
     *
     * @see #setClickable(boolean)
     */
    
    public void setOnClickListener(OnClickListener l) {
        if (!isClickable()) {
            setClickable(true);
        }
        mOnClickListener = l;
    }
    
    
    /**
     * Call this view's OnClickListener, if it is defined.
     *
     * @return True there was an assigned OnClickListener that was called, false
     *         otherwise is returned.
     */
    public boolean performClick() {
        sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_CLICKED);
 
        if (mOnClickListener != null) {
            playSoundEffect(SoundEffectConstants.CLICK);
            
            //这个不就是相当于B类调用A类的某个方法D，这个D就是所谓的回调方法咯
            mOnClickListener.onClick(this);
            return true;
        }
 
        return false;
    }
}