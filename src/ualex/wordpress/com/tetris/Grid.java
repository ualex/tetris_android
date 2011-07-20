package ualex.wordpress.com.tetris;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Grid extends View {
	private Paint paint = new Paint();
	private float[] pontos = {2f,20f,2f,40f};
	public Grid(Context context) {
		super(context);
	}
	
	@Override 
	protected void onDraw(Canvas canvas) {
	     paint.setColor(Color.RED);
         paint.setStrokeWidth(1);
         
         canvas.drawLines(pontos,paint);         
	}
}
