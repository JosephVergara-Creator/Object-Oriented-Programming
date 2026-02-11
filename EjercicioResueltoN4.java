public class EjercicioResueltoN4 {

    public static void main(String[] args) {
        double edalber, edana, edmama;
        double edjuan = 9;
        edalber = Edades.calcular_edalber(edjuan);
        edana = Edades.calcuar_edana(edjuan);
        edmama = Edades.calcular_edmama(edjuan, edalber, edana);
        System.out.println("Las edades son: Alberto = " + edalber + " Juan = " + edjuan + " Ana = " + edana + " Mama = " + edmama);
    }
}
