
public class DataSet {

    private double sum;
    private Measurable maximum;
    private int count;

    public DataSet() {
        sum = 0;
        maximum = null;
        count = 0;
    }

    public void add(Measurable x) {
        sum += x.getMeasure();

        if (count == 0 || x.getMeasure() > maximum.getMeasure()) {
            maximum = x;
        }

        count++;
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }

        return sum / count;
    }

    public Measurable getMax() {
        return maximum;
    }
}
