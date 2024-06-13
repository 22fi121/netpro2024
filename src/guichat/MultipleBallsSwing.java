package guichat;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MultipleBallsSwing extends JPanel implements ActionListener {

    private int numBalls = 1; // ボールの初期数
    private Timer timer;

    public MultipleBallsSwing() {
        // ボールを追加するボタン
        JButton addButton = new JButton("Add Ball");
        addButton.addActionListener(e -> {
            numBalls++; // ボールの数を増やす
            repaint(); // パネルを再描画
        });

        // ボールを減らすボタン
        JButton removeButton = new JButton("Remove Ball");
        removeButton.addActionListener(e -> {
            if (numBalls > 1) { // 最低1つのボールが必要
                numBalls--; // ボールの数を減らす
                repaint(); // パネルを再描画
            }
        });

        // ボタンを配置するレイアウト
        setLayout(new FlowLayout());
        add(addButton);
        add(removeButton);

        // アニメーション用のタイマー
        timer = new Timer(20, this);
        timer.start(); // タイマーを開始
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // ボールの数だけ描画
        for (int i = 0; i < numBalls; i++) {
            // ランダムな位置にボールを描画
            int x = (int) (Math.random() * getWidth());
            int y = (int) (Math.random() * getHeight());
            int radius = 20;
            g2d.setColor(Color.RED);
            g2d.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint(); // アニメーションのためにパネルを再描画
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Balls Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MultipleBallsSwing());
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
