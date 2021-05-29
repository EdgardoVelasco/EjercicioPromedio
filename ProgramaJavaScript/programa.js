var calificaciones=[5,4,6,7];

function promedio(lista){
    var suma=0;
    for(var tmp of lista){
        suma=suma+tmp;
    }
    return suma/lista.length;
}

var promedioAlumno=promedio(calificaciones);
console.log("El promedio es "+promedioAlumno);
