import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Window extends JFrame {

	private JSlider slider;
	private PaintOval myPanel;

	public Window() {
		super("Title");
		myPanel = new PaintOval();
		myPanel.setBackground(Color.RED);

		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
				
				new ChangeListener(){
					
				public void stateChanged(ChangeEvent e){
				myPanel.setD(slider.getValue());	
					
				
				}
					
				}
				
				
				);
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}

}
