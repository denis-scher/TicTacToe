import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GameFrame extends JFrame{

    String currentX = null;
    GameFrame(){

        JPanel buttonsPanel = new JPanel();
        JButton[] buttons = new JButton[9];
        buttonsPanel.setLayout(new GridLayout(3,3));
        ActionListener ae = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < 9; i++){
                    if(e.getSource() == buttons[i]){
                        if(buttons[i].getText() == ""){
                            buttons[i].setText("O");
                            setX(i);
                        }else{
                            continue;
                        }
                    }
                }
            }
        };
        for(int i = 0;i < 9; i++){
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 100));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(ae);
            buttonsPanel.add(buttons[i]);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new BorderLayout());
        this.add(buttonsPanel);
        this.setVisible(true);
    }

    private void setX(int loc){
        String[] boardLocations = new String[] {"11","12","13","21","22","23","31","32","33"};
        System.out.println("Button " + boardLocations[loc] + " was pressed.");
        this.currentX = boardLocations[loc];

    }

    public String getCurrentX(){
        return currentX;
    }


}
