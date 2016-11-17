package ducksim;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MakeDuckDialog extends JDialog {

    // Fields
    
    // Stored Data
    private String duckType = "Mallard";
    private int crossCount = 0;
    private int starCount = 0;
    private int moonCount = 0;
    //private int sumOfDecorations = crossCount + starCount + moonCount;
    
    // Duck panel
    private final JPanel duckPanel = new JPanel();
    private final JLabel duckLabel = new JLabel("Duck");
    private final String[] duckStrings = {"Mallard", "Redhead", "Rubber", "Decoy"};
    private final JComboBox duckOptions = new JComboBox(duckStrings);

    // Bling Panel
    private final JPanel duckBlingCreator = new JPanel();
    private final JLabel duckBlingLayout = new JLabel("Bling");
    private final JLabel star = new JLabel("Star");
    private final JLabel totalStar = new JLabel(starCount + "");
    private final JLabel moon = new JLabel("Moon");
    private final JLabel totalMoon = new JLabel(moonCount + "");
    private final JLabel cross = new JLabel("Star");
    private final JLabel totalCross = new JLabel(crossCount + "");
    
    // Bling Buttons
    private final JButton addStar = new JButton("+");
    private final JButton removeStar = new JButton("-");
    private final JButton addMoon = new JButton("+");
    private final JButton removeMoon = new JButton("-");
    private final JButton addCross = new JButton("+");
    private final JButton removeCross = new JButton("-");
    
  
    // Button panel
    private final JPanel buttonPanel = new JPanel();
    private final JButton okayButton = new JButton("Okay");
    private final JButton cancelButton = new JButton("Cancel");


    // Constructor
    public MakeDuckDialog(DuckSimModel model, DuckSimView view) {

        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        // add duck panel
        duckPanel.add(duckLabel);
        duckOptions.addActionListener(e -> {
            JComboBox cb = (JComboBox) e.getSource();
            duckType = (String) cb.getSelectedItem();
        });
        duckPanel.add(duckOptions);
        this.add(duckPanel);

        // add bling grid
        duckPanel.add(duckBlingLayout);
        duckPanel.add(duckBlingCreator);
        duckBlingCreator.setLayout(new GridLayout(3,4));
        duckBlingCreator.add(star);
        duckBlingCreator.add(totalStar);
        duckBlingCreator.add(addStar);
        duckBlingCreator.add(removeStar);
        duckBlingCreator.add(moon);
        duckBlingCreator.add(totalMoon);
        duckBlingCreator.add(addMoon);
        duckBlingCreator.add(removeMoon);
        duckBlingCreator.add(cross);
        duckBlingCreator.add(totalCross);
        duckBlingCreator.add(addCross);
        duckBlingCreator.add(removeCross);
        
        // duck bling actions
        addStar.addActionListener(e -> {
           if((starCount + moonCount + crossCount) < 3) {
               totalStar.setText(++starCount + "");
           }
        });
        
        addMoon.addActionListener(e -> {
            if((starCount + moonCount + crossCount) < 3) {
                totalMoon.setText(++moonCount + "");
            } 
         });
        
        addCross.addActionListener(e -> {
            if((starCount + moonCount + crossCount) < 3) {
                totalCross.setText(++crossCount + "");
            } 
         });
        
        removeStar.addActionListener(e -> {
            if((starCount + moonCount + crossCount) > 0) {
                totalStar.setText(--starCount + "");
            }
         });
        
        removeMoon.addActionListener(e -> {
            if((starCount + moonCount + crossCount) > 0) {
                totalMoon.setText(--moonCount + "");
            }
         });
        
        removeCross.addActionListener(e -> {
            if((starCount + moonCount + crossCount) > 0) {
                totalCross.setText(--crossCount + "");
            }
         });
        
        // add button panel
        cancelButton.addActionListener(e -> {
            this.dispose();
        });
        buttonPanel.add(cancelButton);
        okayButton.addActionListener(e -> {
            // makeDuckDialog
            Duck duck;
            switch (duckType) {
                case "Mallard":
                    duck = new MallardDuck();
                    while(starCount > 0) {
                        duck = new StarBling(duck);
                        --starCount;
                    }
                    while(moonCount > 0) {
                        duck = new MoonBling(duck);
                        --moonCount;
                    }
                    while(crossCount > 0) {
                        duck = new CrossBling(duck);
                        --crossCount;
                    }
                    break;
                case "Redhead":
                    duck = new RedheadDuck();
                    while(starCount > 0) {
                        duck = new StarBling(duck);
                        --starCount;
                    }
                    while(moonCount > 0) {
                        duck = new MoonBling(duck);
                        --moonCount;
                    }
                    while(crossCount > 0) {
                        duck = new CrossBling(duck);
                        --crossCount;
                    }
                    break;
                case "Rubber":
                    duck = new RubberDuck();
                    while(starCount > 0) {
                        duck = new StarBling(duck);
                        --starCount;
                    }
                    while(moonCount > 0) {
                        duck = new MoonBling(duck);
                        --moonCount;
                    }
                    while(crossCount > 0) {
                        duck = new CrossBling(duck);
                        --crossCount;
                    }
                    break;
                case "Decoy":
                    duck = new DecoyDuck();
                    while(starCount > 0) {
                        duck = new StarBling(duck);
                        --starCount;
                    }
                    while(moonCount > 0) {
                        duck = new MoonBling(duck);
                        --moonCount;
                    }
                    while(crossCount > 0) {
                        duck = new CrossBling(duck);
                        --crossCount;
                    }
                    break;
                default:
                    duck = null;
            }
            if (duck != null) {
                model.addNewDuck(duck);
            }
            view.repaint();
            this.dispose();
        });
        buttonPanel.add(okayButton);
        this.add(buttonPanel);
    }

    // Public Methods
    public String getDuckType() {
        return duckType;
    }
}
