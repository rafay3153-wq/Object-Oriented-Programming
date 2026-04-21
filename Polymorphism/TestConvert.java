abstract class Convert {
    protected double val1;
    protected double val2;
    public Convert(double v) {
        val1 = v;
    }
    public abstract double convert();
    public double getResult() {
        return val2;
    }
}
class l_to_g extends Convert {
    public l_to_g(double v) {
        super(v);
    }
    @Override
    public double convert() {
        val2=val1*0.264172;
        return val2;
    }
}
class f_to_c extends Convert {
    public f_to_c(double v) {
        super(v);
    }
    @Override
    public double convert() {
        val2=(val1-32)*5/9;
        return val2;
    }
}
class f_to_m extends Convert {
    public f_to_m(double v) {
        super(v);
    }
    @Override
    public double convert() {
        val2=val1*0.3048;
        return val2;
    }
}
public class TestConvert {
    public static void main(String[] args) {
        Convert[] conversions=new Convert[3];
        conversions[0] = new l_to_g(10);
        conversions[1] = new f_to_c(100);
        conversions[2] = new f_to_m(50);
        for (int i=0; i < conversions.length; i++) {
             conversions[i].convert();
            System.out.println("Converted value: " + conversions[i].getResult());
        }
    }
}
