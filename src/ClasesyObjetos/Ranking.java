package ClasesyObjetos;

public class Ranking {
    public Estudiante[] top3(Estudiante[] lista) {
        Estudiante top1 = null, top2 = null, top3 = null;
        for (Estudiante alumno : lista) {
            if (top1 == null || alumno.getNota() > top1.getNota()) {
                top3 = top2;
                top2 = top1;
                top1 = alumno;
            } else if (top2 == null || alumno.getNota() > top2.getNota()) {
                top3 = top2;
                top2 = alumno;

            } else if (top3 == null || alumno.getNota() > top3.getNota()) {
                top3 = alumno;
            }
        }
        return new Estudiante[]{top1, top2, top3};
    }
}
