package cn.sxt.callback2;

import javax.swing.text.View;

//这个是View的一个回调接口
/**
 * Interface definition for a callback to be invoked when a view is clicked.
 */
public interface OnClickListener {
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    void onClick(View v);
}