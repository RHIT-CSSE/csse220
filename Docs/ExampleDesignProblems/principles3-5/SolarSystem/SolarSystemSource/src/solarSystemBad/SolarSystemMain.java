package solarSystemBad;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Main class for not-to-scale animation of solar system.
 *
 * @author Ian Ludden
 */
public class SolarSystemMain extends JFrame {
    private static final double TIME_SCALE = 0.1;
    public static final int DEFAULT_FRAME_WIDTH = 1200;
    public static final int DEFAULT_FRAME_HEIGHT = 900;

    private SolarSystem solarSystem;
    private JPanel drawingPanel;
    private Timer animationTimer;
    private long startTime;

    public SolarSystemMain() {
        solarSystem = new SolarSystem();
        setupUI();
        startTime = System.currentTimeMillis();

        animationTimer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long currentTime = System.currentTimeMillis();
                handleComputeNewPosition((long) ((currentTime - startTime) * TIME_SCALE));
                drawingPanel.repaint();
            }
        });
        animationTimer.start();
    }

    private void setupUI() {
        setTitle("Solar System - NOT TO SCALE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);

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

        buttonPanel.add(updatePlanetColorBtn);
        buttonPanel.add(updateMoonColorBtn);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void handleComputeNewPosition(long timestamp) {
        solarSystem.computeNewPosition(timestamp);
    }

    public void handleDrawAll(Graphics graphics) {
        solarSystem.drawAll(graphics);
    }

    public void handleUpdatePlanetColor(Color newColor) {
        for (Planet planet : solarSystem.getPlanets()) {
            planet.setPlanetColor(newColor);
        }
    }

    public void handleUpdateMoonColor(Color newColor) {
        for (int i = 0; i < solarSystem.getPlanets().size(); i++) {
            for (int j = 0; j < solarSystem.getPlanets().get(i).getMoons().size(); j++) {
                solarSystem.getPlanets().get(i).getMoons().get(j).setMoonColor(newColor);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SolarSystemMain().setVisible(true);
        });
    }
}
