package create;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Facade implements CrearBody, CrearImagen, CrearPagina, CrearTexto {
    

    @Override
    public String crearTexto(String s) {
        return s;
    }

    public String construirPagina() {
        String pag = null;
        String route = null;
        String title = null;
        pag += crearPagina(crearBody(crearTexto("Hola mundo") + crearImagen(route, title)));

        return pag;
    }
    

    public void escribir(String nombre, String p ) {
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try {

            f = new File(nombre);
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            wr.write("crear pagina " + p +"\n");
            

            wr.close();
            bw.close();

        } catch (Exception e) {
        }

    }

    @Override
    public String crearPagina( String s) {
        return "<html>\n" + s + "</html>\n";
    }

    @Override
    public String crearImagen( String route, String title) {
        return "<img src=" + route + " alt=" + title + ">\n";
    }

    @Override
    public String crearBody(String s) {
        return "<body>\n" + s + "</body>\n";
    }

    public String recibir(String r){
        Integer.parseInt(r);
        System.out.println("que quiere agregar?");
        Scanner n = new Scanner(System.in);
        int nn = n.nextInt();
        String r2;
        if(nn==1){
            Facade rr = new Facade();
            r2 = rr.crearImagen("aa", "aa");
            return r2;
        }
        return null;
        
    }
}
