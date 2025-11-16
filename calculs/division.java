package calculs;
public class division {
    public float calcul(float nombreD1, float nombreD2) {
        if (nombreD2 == 0) {
            throw new ArithmeticException("Division par zéro n'est pas autorisée.");
        }
        return nombreD1 / nombreD2;
    }
}
