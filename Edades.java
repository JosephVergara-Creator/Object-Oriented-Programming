public class Edades {
public static double calcular_edalber(double edjuan){
        double edalber = 2 * edjuan/3;
        return edalber;
}
public static double calcuar_edana(double edjuan){
        double edana = 4 * edjuan/3;
        return edana;
}
public static double calcular_edmama(double edjuan, double edalber, double edana){
    double edmama = edjuan + edalber + edana;
    return edmama;
}

}
