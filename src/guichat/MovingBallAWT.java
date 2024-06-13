package guichat;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//配列で5つのボールを動かしてみよう

public class MovingBallAWT {
	public static void main(String[] args) {
		FFrame f = new FFrame();
		f.setSize(500, 500);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.show();
	}


	static class FFrame extends Frame implements Runnable {

		Thread th;
		Ball[] myBall = new Ball[5];
		

		private boolean enable = true;
		private int counter = 0;

		FFrame() {
			th = new Thread(this);
			th.start();
		}

		public void run() {

            for(int i = 0; i<5; i++){
            myBall[i] = new Ball();
			myBall[i].setPosition(100*i, 30*i);
			myBall[i].setR(10);
			myBall[i].setColor(Color.RED);
            }
            while (enable) {

				try {
					th.sleep(100);
					counter++;
					if (counter >= 200) enable = false;
				} catch (InterruptedException e) {
				}
				for(int i = 0; i<5; i++){
                myBall[i].move();
                repaint();  // paint()メソッドが呼び出される
                }
			}
		}


		public void paint(Graphics g) {
            for(int i = 0; i<5; i++){
                myBall[i].draw(g);
            }
		}

		// Ball というインナークラスを作る
		class Ball {
			int x;
			int y;
			int r; // 半径
			Color c = Color.RED;

			int xDir = 1;  // 1:+方向  -1: -方向
			int yDir = 1;

			void setColor(Color c) {
				this.c = c;
			}


			void move() {

				if ((xDir == 1) && (x+r*2 >= 500)) {
					xDir = -1;
				}
				if ((xDir == -1) && (x-r <= 0)) {
					xDir = 1;
				}

				if (xDir == 1) {
					x = x + 10;
				} else {
					x = x - 10;
				}


				if ((yDir == 1) && (y+r*2 >= 500)) {
					yDir = -1;
				}
				if ((yDir == -1) && (y-r <= 0)) {
					yDir = 1;
				}

				if (yDir == 1) {
					y = y + 10;
				} else {
					y = y - 10;
				}


			}


			void setPosition(int x, int y) {
				this.x = x;
				this.y = y;
			}

			void setR(int r) {
				this.r = r;
			}

			void draw(Graphics g) {
				g.setColor(c);
				g.fillOval(x, y, 2 * r, 2 * r);  // rは半径なので2倍にする
			}

		}//innner class Ball end

	}

}

