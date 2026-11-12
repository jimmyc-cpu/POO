package ClasesyObjetos;

public class Main {
    public static void main(String[] args) {

        Estudiante[] lista = new Estudiante[5];
        lista[0] = new Estudiante(18.5, "Ana");

        lista[1] = new Estudiante(16.0, "Luis");

        lista[2] = new Estudiante(19.2, "Maria");

        lista[3] = new Estudiante(15.7, "Pedro");

        lista[4] = new Estudiante(18.5, "Sofia");
        Ranking rank = new Ranking();
        Estudiante[] top = rank.top3(lista);
        for (int i =0;i < top.length;i++){
            if (top[i] != null) {
                System.out.println((i + 1) + "," + top[i]);
            }
        }
    }
}

