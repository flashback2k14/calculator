package Calculator;

/**
 * Created by skloppe on 16.01.2015.
 */
public class Grundrechenarten {
    /**
     * Attribute
     */
    private int zahl1;
    private int zahl2;
    private int ergebnis;
    private String operator;
    private boolean isClearedAfterOperator = false;

    /**
     * Getter / Setter
     */
    public int getZahl1() {
        return zahl1;
    }

    public void setZahl1(int zahl1) {
        this.zahl1 = zahl1;
    }

    public int getZahl2() {
        return zahl2;
    }

    public void setZahl2(int zahl2) {
        this.zahl2 = zahl2;
    }

    public int getErgebnis() {
        return ergebnis;
    }

    public void setErgebnis(int ergebnis) {
        this.ergebnis = ergebnis;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public boolean isClearedAfterOperator() {
        return isClearedAfterOperator;
    }

    public void setClearedAfterOperator(boolean isClearedAfterOperator) {
        this.isClearedAfterOperator = isClearedAfterOperator;
    }

    /**
     * Operationen
     */
    public int add() {
        return this.getZahl1() + this.getZahl2();
    }

    public int sub() {
        return this.getZahl1() - this.getZahl2();
    }

    public int mul() {
        return this.getZahl1() * this.getZahl2();
    }

    public int div() {
        int erg = 0;

        if (this.getZahl2() != 0) {
            erg = this.getZahl1() / this.getZahl2();
        }

        return erg;
    }

    /**
     * Override toString()
     */
    @Override
    public String toString() {
        StringBuilder gleichung = new StringBuilder()
                .append(getZahl1()).append(" ")
                .append(getOperator()).append(" ")
                .append(getZahl2()).append(" ")
                .append("= ")
                .append(getErgebnis());
        return gleichung.toString();
    }
}