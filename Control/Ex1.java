package Control;

public class Ex1 {
    public enum Planet {
        MERCURY(3.303e+23, 2.4397e6, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6, 2.4397e6),
        EARTH(5.976e+24, 6.37814e6, 2.4397e6),
        MARS(6.421e+23, 3.3972e6, 2.4397e6);

        private double mass, rad, radO;

        Planet(double mass, double rad, double radO) {
            this.mass = mass;
            this.rad = rad;
            this.radO = radO;
        }

        public double getRadO() {
            return radO;
        }

        public double getMass() {
            return mass;
        }

        public double getRad() {
            return rad;
        }
    }
        public static void main(String[] args) {
            System.out.println(Planet.MERCURY.getMass());
            System.out.println(Planet.EARTH.getMass());
            System.out.println(Planet.EARTH.getRad());
            System.out.println(Planet.EARTH.getRadO());
            System.out.println(Planet.VENUS.getMass());
            System.out.println(Planet.MARS.getMass());
        }
}
