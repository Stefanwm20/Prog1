package Training1;

import java.awt.Image;
import java.util.ArrayList;

public class Animation {

	@SuppressWarnings("rawtypes")
	private ArrayList scenes;
	private int sceneIndex;
	private long movieTime;
	private long totalTime;

	// CONSTRUCTOR
	@SuppressWarnings("rawtypes")
	public Animation() {

		scenes = new ArrayList();
		totalTime = 0;
		start();

	}

	// add scene to array list and set time for each scene
	@SuppressWarnings("unchecked")
	public synchronized void addScene(Image i, long t) {

		totalTime += t;
		scenes.add(new SceneOne(i, totalTime));

	}

	// start animation from beginning
	public synchronized void start() {
		movieTime = 0;
		sceneIndex = 0;

	}

	// change from scene to scene
	public synchronized void update(long timePassed) {
		if (scenes.size() > 1) {
			movieTime += timePassed;
			if (movieTime >= totalTime) {
				movieTime = 0;
				sceneIndex = 0;
			}
			while (movieTime > getScene(sceneIndex).endTime) {

				sceneIndex++;
			}

		}
	}

	// get animations current scene(aka image)
	public synchronized Image getImage() {
		if (scenes.size() == 0) {

			return null;
		} else {

			return getScene(sceneIndex).pic;
		}
	}
private SceneOne getScene(int x){
	
	return (SceneOne)scenes.get(x);
	
}

/////PRIVATE INNER CLASS/////

private class SceneOne{
	
	Image pic;
	long endTime;
	
	public SceneOne(Image pic, long endTime){
		
		this.pic = pic;
		this.endTime = endTime;
	}
	
	
	
	
	
	
	
	
}



}
