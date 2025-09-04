package lab03a.oo2;

public class Ball {
    public int x,y,w,h;
    private int dirX,dirY;

    public Ball(int x, int y, int w, int h, int dirX, int dirY){
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
        this.dirX=dirX;
        this.dirY=dirY;
    }

    public Ball(int x, int y, int w, int h){
        this(x, y, w, h, 1, 1); //change the speed
    }

    public void Move(){
        x += dirX;
        y += dirY;

        if(x<0){
            x=0;
            dirX=-dirX;
        }
        if(y<0){
            y=0;
            dirY=-dirY;
        }
        if(x>300-w){
            x=300-w;
            dirY=-dirY;
        }
         if(y > 300 - h){
            y = 300 - h;
            dirX= -dirX;
        }
    }
}
