public class Picture {
    public final Circle circle;
    public final Line1 line1;
    public final Line2 line2;
    public final Line3 line3;

    public Picture(Circle circle, Line1 line1, Line2 line2, Line3 line3){
        this.circle = circle;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }
public Enum.SimpleColor getColor(double x, double y){
        if(  line1.isPointAboveLine(x, y) && line2.isPointAboveLine(x, y) )
            return Enum.SimpleColor.YELLOW;


        else if ( !line1.isPointAboveLine(x, y) && line3.isPointAboveLine(x, y))
            return Enum.SimpleColor.GREEN;


        else if( !line1.isPointAboveLine(x, y) && !line3.isPointAboveLine(x, y) )
            return Enum.SimpleColor.GRAY;


        else if( (!line1.isPointAboveLine(x, y) && circle.isCircleTrue(x, y)) || (line1.isPointAboveLine(x, y) && !line2.isPointAboveLine(x, y) && line3.isPointAboveLine(x, y)) )
            return Enum.SimpleColor.BLUE;

        else return Enum.SimpleColor.ORANGE;

}

}
