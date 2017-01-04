public class ControlMigratorio{
    public static void main(String[] args){
        Persona p1 = new PersonaTica();
        p1.nombre = "Juana";
        p1.edad = 16;
        System.out.println(p1.nombre);
        System.out.println(p1.edad);
        PersonaTica mismaPersona = (PersonaTica)p1;
        System.out.println(mismaPersona.saludo());
        System.out.println(mismaPersona.getNacionalidad());
        System.out.println(mismaPersona.getAntecedentesPenales());
        System.out.println(mismaPersona.despedida());

    }
}