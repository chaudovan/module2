package ss6_Ke_Thua.bai_3;

public class MoveblePoint extends Point{
    private float xSpeed,ySpeed;

    public MoveblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveblePoint() {
    }

    public MoveblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = {getxSpeed(),getySpeed()};
        return arr;
    }
    public Point move(){
        this.setX(this.getX() + this.getxSpeed());
        this.setY(this.getY() + this.getySpeed());
        return this;
    }
    public String toString() {
        return super.toString() +
                ", speed = (" + this.xSpeed + "," + this.ySpeed + ")"
                ;
    }
}
