import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	
	private int xPosition;
	private int yPosition;
	private int xVelocity;
	private int yVelocity;
	private int width;
	private int height;
	private Color colour;
	private int initialXPosition;
	private int initialYPosition;

	
	// Getter
	public int getXPosition() {
		return xPosition;
	}
	public int getYPosition() {
		return yPosition;
	}
	public int getXVelocity() {
		return xVelocity;
	}
	public int getYVelocity() {
		return yVelocity;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColour() {
		return colour;
	}
	
	// Setter
	public void setXPosition(int newXPosition) {
		this.xPosition = newXPosition;
		}
	public void setYPosition(int newYPosition) {
		this.yPosition = newYPosition;
		}
	public void setXVelocity(int newXVelocity) {
		this.xVelocity = newXVelocity;
		}
	public void setYVelocity(int newYVelocity) {
		this.yVelocity = newYVelocity;
		}
	public void setWidth(int newWidth) {
		this.width = newWidth;
		}
	public void setHeight(int newHeight) {
		this.height = newHeight;
		}
	public void setColour(Color newColour) {
		this.colour = newColour;
		}
	public void setInitialPosition(int initXPosition, int initYPosition) {
		initialXPosition  = initXPosition;
		initialYPosition  = initYPosition;		
	}
	public void resetToInitialPosition() {
		setXPosition(initialXPosition);
		setYPosition(initialYPosition);
	}
	
	public void setXPosition(int newXPosition, int panelWidth) {
		
		if ((newXPosition < 0)||(newXPosition > panelWidth)) {
			this.xPosition = 0;
		}
		else {
			this.xPosition = newXPosition;
		}
		}
	public void setYPosition(int newYPosition, int panelWidth) {
		if ((newYPosition < 0)||(newYPosition > panelWidth)) {
			this.yPosition = 0; 	
		}
		else {
			this.yPosition = newYPosition;
		}
		}
	public Rectangle getRectangle() {
        return new Rectangle(getXPosition(), getYPosition(), getWidth(), getHeight());
    }
}
