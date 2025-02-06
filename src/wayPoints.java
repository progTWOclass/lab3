public class wayPoints {

    double x,y;
    int timeStamp;

    public wayPoints(double x, double y, int timeStamp){
        this.x = x;
        this.y = y;
        this.timeStamp = timeStamp;
    }

    //print the object
    public String toString(){
        return String.format("Waypoint(X=%.2f, Y=%.2f, Time=%d sec)", x, y, timeStamp);
    }
}
