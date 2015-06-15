
import java.util.Collections;
import static java.util.Collections.binarySearch;
import java.util.Comparator;
import java.util.List;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica62 {
    public static void main(String[] args) {
 Time t1=new Time();
 Time t2=new Time();
 t1.addJogador("gol",new Jogador(12, "Júlio César"));
 t1.addJogador("atk",new Jogador(11, "Tuba"));
 t1.addJogador("def",new Jogador(10, "Capivaraquadrada")); 
 t2.addJogador("gol",new Jogador(12, "Neymar")); 
 t2.addJogador("atk",new Jogador(11, "Hue")); 
 t2.addJogador("def",new Jogador(10, "asuashuashaus da Silva")); 
 JogadorComparator c=new JogadorComparator(false,true,true);
 List<Jogador> l1=t1.ordena(c);
        System.out.println(l1);

      
}
}