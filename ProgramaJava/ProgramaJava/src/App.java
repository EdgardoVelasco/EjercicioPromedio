public class App {
    public static void main(String[] args) throws Exception {
        int[] calificaciones={5,6,7,8};

        double promedio= promedio(calificaciones);
        System.out.println("el promedio es: "+promedio);
    }
    private static double promedio(int[] calificaciones){
        double suma=0;
        for(int a : calificaciones){
            suma+=a;
        }
        return suma/calificaciones.length;
    }
}
