package com.example.derpyfish;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;

public class Fish 
{
	private Bitmap bitmap;
	private int x;
	private int y;
	private boolean touched;
	
	public Fish(Bitmap bitmap, int x, int y)
	{
		this.setBitmap(bitmap);
		this.setX(x);
		this.setY(y);
	}

	public Bitmap getBitmap() {
		return bitmap;
	}

	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public boolean isTouched() {
		return touched;
	}

	public void setTouched(boolean touched) {
		this.touched = touched;
	}
	
	public void draw(Canvas canvas)
	{
		canvas.drawBitmap(bitmap, x - bitmap.getWidth()/2, y - bitmap.getHeight()/2, null);
	}
	
	public void handleActionDown(int eventX, int eventY) 
	{
		if (eventX >= (x - bitmap.getWidth() / 2) && (eventX <= (x + bitmap.getWidth()/2))) 
		{
			if (eventY >= (y - bitmap.getHeight() / 2) && (y <= (y + bitmap.getHeight() / 2))) 
			{
				setTouched(true);
			} 
			else 
			{
				setTouched(false);
			}
		} 
		else 
		{
			setTouched(false);
		}
	}
}