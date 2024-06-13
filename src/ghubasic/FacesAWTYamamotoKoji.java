//FacesAWTMain.java
//FacesAWTMain 目標 インナークラスのFaceObjクラスを作ってみよう。描画処理を移譲してください。
//3x3　の顔を描画してください。色などもぬってオリジナルな楽しい顔にしてください。

package ghubasic;


import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FacesAWTYamamotoKoji {

	public static void main(String[] args){
		new FacesAWTYamamotoKoji();
	}

    FacesAWTYamamotoKoji(){
		FaceFrame f = new FaceFrame();
		f.setSize(800,800);
		f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		System.exit(0);}});
		f.setVisible(true);
		System.out.println("Hallo2");
}
		public void paint(Graphics g){
		
	}

	
	private class FaceFrame extends Frame{
		FaceObj[] fobjs= new FaceObj[9];
		public FaceFrame(){
			
			for(int j=0;j<3;j++) {
				for (int i = 0; i < 3; i++) {
				 System.out.println("Hallo1");
				   fobjs[0]= new FaceObj();
				}
				 }

		}
		public void paint(Graphics g) {
			// この中には、g.drawLine というのは入ってこない
			// Graphicsクラス(型のようなもの---今は--)のgという変数はメソッドに渡す
			for(int j=0;j<3;j++) {

				for (int i = 0; i < 3; i++) {
				 System.out.println("Hallo1");
				   fobjs[0].setPosition(200*i+50,200*j+50);
				   fobjs[0].setEmotionLevel(i*80+50);
				   fobjs[0].drawFace(g);
				}
				 }
				
				//fobj.drawRim();
			}
		
		
            
	}
	private class FaceObj{
		
	private int w;
	private int h;
	private int xStart;
	private int yStart;
	private Color color;
		public void setPosition(int i, int w){
		 this.xStart = i;
		 this.yStart = w;
		}
		public void setEmotionLevel(int fill){
		 color = new Color(255, fill, fill, fill);
		}
		 
		public void drawFace(Graphics g){
			
		w = 200;
		h = 200;
		g.setColor(color);
		
				
		drawRim(g);
		drawLeftBrow(g, 30); 
		drawLeftEye(g, 35);
		drawRightBrow(g, 30); 
		drawRightEye(g, 35);
		drawNose(g, 40);
		drawMouth(g, 100);
		}
		public void drawRim(Graphics g) {  // wが横幅、hが縦幅
			g.drawLine(xStart+50, yStart+50, xStart+50+w, yStart+50);
			g.drawLine(xStart+50, yStart+50, xStart+50, yStart+50+h);
			g.drawLine(xStart+50, yStart+50+h, xStart+50+w, yStart+50+h);
			g.drawLine(xStart+50+w, yStart+50, xStart+50+w, yStart+50+h);	
		}
	
		public void drawLeftBrow(Graphics g,int bx) { // xは目の幅 呼ばれる方(=定義する方)
			g.drawLine(xStart+95, yStart+60+50, xStart+bx+45+50, yStart+60+50);
		}
	
		public void drawRightBrow(Graphics g,int bx) { // xは目の幅 呼ばれる方(=定義する方)
			g.drawLine(xStart+165, yStart+60+50, xStart+bx+115+50, yStart+60+50);
		}
	
	
		public void drawNose(Graphics g, int nx) { // xは鼻の長さ
			g.drawOval(xStart+130, yStart+100+50, nx, nx);
		}
	
		public void drawLeftEye(Graphics g, int r) { // rは目の半径
			g.drawOval(xStart+45+50,yStart+65+50,r,r);
			
		}
	
		public void drawRightEye(Graphics g, int r) { // rは目の半径
			g.drawOval(xStart+115+50,yStart+65+50,r,r);
			
		}

		public void drawMouth(Graphics g, int mx) { // xは口の幅
			int xMiddle = 50 + w/2;
			int yMiddle = 50 + h - 30;
			g.drawLine(xStart+xMiddle - mx/2, yStart+yMiddle, xStart+xMiddle + mx/2, yStart+yMiddle);
		}
	}

}
	

//Faces class end




