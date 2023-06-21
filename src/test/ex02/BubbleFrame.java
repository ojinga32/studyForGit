package test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 1. 윈도우 창이 되었다.
// 2. 윈도우 창은 내부에 패널을 하나 가지고 있다.

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initObject();
        initSetting();                        
        setVisible(true);                                        // 그림을 그려라
    }
    
    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("imagebackgroundMap.png"));
        setContentPane(backgroundMap);

        player = new Player();
        add(player);
        // backgroundMap.setSize(100, 100);
        // backgroundMap.setLocation(300, 300);
        // backgroundMap.setSize(1000, 600);
        // add(backgroundMap);                                        // JFrame에 JLabel이 그려진다.
    }

    public void initSetting() {
        setSize(1000, 640);
        setLayout(null);                                    // absoulte 레이아웃 (자유롭게 그림을 그릴 수 있다.)
        setLocationRelativeTo(null);                              // 윈도우 창이 왼쪽 상단이 아닌 가운데에 뜨게 해준다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             // 창을 닫으면 자동적으로 프로세스가 종료되게 해준다.
         
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
