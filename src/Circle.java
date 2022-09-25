/** Окружность вида:
 * (x – x0)^2 + (y – y0)^2 = R^2
 */

public class Circle {
    public double x0;

    public double y0;

    public double r;

    public Circle(double x0, double y0, double   r){
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }
    public boolean isCircleTrue(double x, double y){
        return Math.pow(r, 2) > Math.pow((x - x0), 2) + Math.pow((y - y0), 2);
    }
}
