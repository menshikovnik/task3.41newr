public class Line4 {

    // a в этой линии = 0 => линия имеет вид: y = b

        public double x0;
        public double y0;
        public double a;

        public Line4(double x0, double y0, double a) {
            this.x0 = x0;
            this.y0 = y0;
            this.a = a;
        }

        public boolean isPointAboveLine(double x, double y) {
            return y > a * (x - x0) + y0;
        }
    }

