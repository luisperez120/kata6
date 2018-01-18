/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        String name = "emails.txt";
        ArrayList<Person> mailArray = MailListReader.read(name);
        ArrayList<Person1> mailArray1 = PersonLoader.read();
        
        HistogramBuilder<Person> builder = new HistogramBuilder<>(mailArray);
        HistogramBuilder<Person1> builder1 = new HistogramBuilder<>(mailArray1);
        Histogram<String> domains = builder.build(new Attribute<Person,String>() {

            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];                
            }
        });
        
        Histogram<String> domains1 = builder1.build(new Attribute<Person1,String>() {

            @Override
            public String get(Person1 item) {
                return item.getMail().split("@")[1];                
            }
        });
        
        Histogram<Float> pesos = builder1.build(new Attribute<Person1,Float>() {

            @Override
            public Float get(Person1 item) {
                return item.getPeso();                
            }
        });
        
        Histogram<Character> genero = builder1.build(new Attribute<Person1,Character>() {

            @Override
            public Character get(Person1 item) {
                return item.getGenero().charAt(0);
            }
        });
        
        
        
        Histogram <Character> letters = builder.build(new Attribute<Person, Character>() {

            @Override
            public Character get(Person item) {
                return item.getMail().charAt(0);
            }
        });
        //Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        new HistogramDisplay(domains,"DOMINIOS").execute();
        new HistogramDisplay(domains1,"DOMINIOS").execute();
        new HistogramDisplay(pesos,"PESO").execute();
        new HistogramDisplay(genero,"GENERO").execute();
    }

}
