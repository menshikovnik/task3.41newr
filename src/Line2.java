/**
 * Линия вида y = a * (x - x0) + y0
 * a это угол наклона прямой (Обычно обозначается как k)
 * (можно обойтись без y0, но с ним удобнее;
 * будем считать, что линия всегда наклонная)
 */

public class Line2 {
    public double x0;
    public double y0;
    public double a;
    public Line2(double x0, double y0, double a) { //это сеттер мы введем эти данные типа дабл в каком-то другом классе
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }
    /**
     * Проверяет, находится ли точка (x, y) выше линии
     */
    public boolean isPointAboveLine(double x, double y) {
        return y > a * (x - x0) + y0;
    }
}
