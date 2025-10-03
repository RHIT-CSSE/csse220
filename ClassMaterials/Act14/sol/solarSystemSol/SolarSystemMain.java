package solarSystemSol;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Main class that handles UI and coordinates the system.
 * <br>
 * Written with GenAI assistance,
 * <a href="https://claude.ai/share/442cbe6e-5786-4c32-9e2a-c684a9fb1d3c">Claude.AI</a>
 *
 * @author Ian Ludden
 */
class SolarSystemMain extends JFrame {
    private final SolarSystem solarSystem;
    private JPanel drawingPanel;
    private final long startTime;
    private static final int TIMER_DELAY = 50;
    private static final int SPEED_FACTOR = 50;
    private boolean showNames;

    public SolarSystemMain() {
        solarSystem = new SolarSystem();
        showNames = true;
        setupUI();
        startTime = System.currentTimeMillis();
        
        // Animation timer
        Timer animationTimer = new Timer(TIMER_DELAY, e -> {
            long currentTime = System.currentTimeMillis();
            long scaledTimestamp = (currentTime - startTime) / SPEED_FACTOR;
            handleComputeNewPosition(scaledTimestamp);
            drawingPanel.repaint();
        });
        animationTimer.start();
    }
    
    private void setupUI() {
        setTitle("Solar System Visualization (not to scale)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        
        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());
                handleDrawAll(g);
            }
        };
        
        add(drawingPanel, BorderLayout.CENTER);
        
        // Add buttons to change planet/moon colors
        add(createButtonPanel(), BorderLayout.SOUTH);
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();

        JButton updatePlanetColorBtn = new JButton("Update Planet Color");
        updatePlanetColorBtn.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(this, "Choose Planet Color", Color.RED);
            if (newColor != null) {
                handleUpdatePlanetColor(newColor);
            }
        });

        JButton updateMoonColorBtn = new JButton("Update Moon Color");
        updateMoonColorBtn.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(this, "Choose Moon Color", Color.GRAY);
            if (newColor != null) {
                handleUpdateMoonColor(newColor);
            }
        });

        JButton toggleNamesBtn = new JButton("Show/Hide Names");
        toggleNamesBtn.addActionListener(e -> {
            showNames = !showNames;
            drawingPanel.repaint();
        });

        buttonPanel.add(updatePlanetColorBtn);
        buttonPanel.add(updateMoonColorBtn);
        buttonPanel.add(toggleNamesBtn);
        return buttonPanel;
    }

    // Handler methods that delegate to the solar system
    public void handleComputeNewPosition(long timestamp) {
        solarSystem.computeNewPosition(timestamp);
    }
    
    public void handleDrawAll(Graphics graphics) {
        solarSystem.drawAll(graphics, showNames);
    }
    
    public void handleUpdatePlanetColor(Color newColor) {
        // DONE: Ahh, much better :)
        solarSystem.setPlanetColor(newColor);
    }
    
    public void handleUpdateMoonColor(Color newColor) {
        // DONE: Ahh, much better :)
        solarSystem.setMoonColor(newColor);
    }

    private static void runApp() {
        SolarSystemMain app = new SolarSystemMain();
        app.setVisible(true);
    }

    public static void main(String[] args) {
        SolarSystemMain.runApp();
    }
}
