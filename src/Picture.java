public class Picture {
    public final Circle circle;
    public final Line1 line1;
    public final Line2 line2;
    public final Line3 line3;
    public final Line4 line4;

    public Picture(Circle circle, Line1 line1, Line2 line2, Line3 line3, Line4 line4){
        this.circle = circle;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }
public Enum.SimpleColor getColor(double x, double y){
         if((!line4.isPointAboveLine(x, y) && !circle.isCircleTrue(x, y) && line1.isPointAboveLine(x, y)  && line2.isPointAboveLine(x, y) && line3.isPointAboveLine(x, y)) || (!line2.isPointAboveLine(x, y) && line1.isPointAboveLine(x, y))){
        return Enum.SimpleColor.ORANGE;}

        else if(  line1.isPointAboveLine(x, y) && line2.isPointAboveLine(x, y) {
            if(!line4.isPointAboveLine(x, y) && line3.isPointAboveLine(x, y))
                return Enum.SimpleColor.ORANGE;
            else return Enum.SimpleColor.YELLOW;
    }

    } (line4.isPointAboveLine(x, y) && line2.isPointAboveLine(x, y)))
            return Enum.SimpleColor.YELLOW;


        else if ( !line1.isPointAboveLine(x, y) && line3.isPointAboveLine(x, y))
            return Enum.SimpleColor.GREEN;


        else if( !line1.isPointAboveLine(x, y) && !line3.isPointAboveLine(x, y) )
            return Enum.SimpleColor.GRAY;


        else if( (!line1.isPointAboveLine(x, y) && circle.isCircleTrue(x, y)) || (line1.isPointAboveLine(x, y) && !line2.isPointAboveLine(x, y) && line3.isPointAboveLine(x, y)) )
            return Enum.SimpleColor.BLUE;



        else return Enum.SimpleColor.BLACK;



}

}
