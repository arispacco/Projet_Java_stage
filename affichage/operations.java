import calculs.*;

public class operations {
    public static String clean(float n) {
            return String.valueOf(n).replaceAll("\\.0$", "");
    }

    public float addition(float nombre1, float nombre2) {
        addition add = new addition();
        return add.calcul(nombre1, nombre2);
    }

    public float soustraction(float nombreA, float nombreB) {
        soustraction sous = new soustraction();
        return sous.calcul(nombreA, nombreB);
    }

    public float multiplication(float nombreM, float nombrem) {
        multiplication mul = new multiplication();
        return mul.calcul(nombreM, nombrem);
    }

    public float division(float nombreA, float nombreB) {
        division div = new division();
        return div.calcul(nombreA, nombreB);
    }
}
