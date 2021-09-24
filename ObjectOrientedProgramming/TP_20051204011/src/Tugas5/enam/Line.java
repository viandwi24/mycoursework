package Tugas5.enam;

public class Line implements Relation {
    private Double x1, x2, y1, y2;

    public Line(Double x1, Double y1, Double x2, Double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Double getLength() {
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    public Boolean isGreater(Object b) {
        Double aLen = ((this)).getLength();
        Double bLen = ((Line) b).getLength();
        return aLen > bLen;
    }

    public Boolean isLess(Object b) {
        Double aLen = ((this)).getLength();
        Double bLen = ((Line) b).getLength();
        return aLen < bLen;
    }

    public Boolean isEqual(Object b) {
        Double aLen = ((this)).getLength();
        Double bLen = ((Line) b).getLength();
        return aLen == bLen;
    }
}
