/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amenu;

import java.awt.Event;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author maizal
 */
public class AMenu extends Frame{
    
    public AMenu(){
        setTitle("ACTIVIDAD 4");
        MenuBar barra;
        barra= new MenuBar();
        
        Menu miMenu;
        Menu miMenu2;
         miMenu = new Menu( "Menú Archivo" );
         Menu sbg;
         MenuItem g,c,on,os;
         on = new MenuItem("Nuevo");
         sbg=new Menu("Guardar");
         g=new MenuItem("Guardar");
         c=new MenuItem("Guardar como :");
         os=new MenuItem("Salir");
        sbg.add(g);
        sbg.add(c);
         miMenu.add(on);
         miMenu.add(sbg);
         miMenu.addSeparator();
         miMenu.add(os);
         miMenu2=new Menu("Menú Ayuda ");
         MenuItem ad,a;
         ad=new MenuItem("Acerca de");
         a=new MenuItem("Ayuda");
         miMenu2.add(ad);
         miMenu2.add(a);
         barra.add( miMenu );
         barra.add( miMenu2 );
         setMenuBar( barra );
    }
    
    
    public boolean handleEvent( Event evt ) {
// Si la ventana se cerró salir de la aplicación
if( Event.WINDOW_DESTROY == evt.id && this == evt.target )
System.exit( 0 );
switch( evt.id ) {
case Event.ACTION_EVENT:
{
if( evt.target instanceof MenuItem)
{
    if( "Nuevo".equals( evt.arg ) ){
System.out.println( " NUEVO " );} 
    
    else if("Guardar".equals(evt.arg)){
            System.out.println("GUARDAR");}
     else if("Guardar como :".equals(evt.arg)){
            System.out.println("GUARDAR COMO:");}
     else if("Ayuda".equals(evt.arg)){
            System.out.println("AYUDA");}
     else if("Acerca de".equals(evt.arg)){
            System.out.println("ACERCA DE");}
    else if("Salir".equals(evt.arg)){
            System.out.println("SALIR");
    System.exit( 0 );}
 
}
}
}
        return false;
    
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame frame = new AMenu();
       
         frame.setSize( 500,500 );
         frame.setVisible(true);
      
        //System.exit( 0 );
}
}
    
    

