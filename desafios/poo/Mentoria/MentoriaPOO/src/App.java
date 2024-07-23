import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("curso Santander na DIO");
        curso1.setCargaHoraria(70);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso .NET");
        curso2.setDescricao("curso Santander na DIO");
        curso2.setCargaHoraria(90);

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Mentiro DIO");
        mentoria.setTitulo("Java Santander");

        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);
    }
}
