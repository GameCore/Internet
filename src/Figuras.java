


import java.applet.Applet;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


/**
 *
 * @author Pablo
 */
public class Figuras extends JApplet{

    public void init() {
        Container contenido = getContentPane();
        setLayout(new FlowLayout());
        JMenu menuArchivo = new JMenu( "Archivo" );
        JMenuItem elementoAcerca = new JMenuItem( "Acerca de..." );
        menuArchivo.add( elementoAcerca );
        elementoAcerca.addActionListener(
        new ActionListener() { // clase interna anónima

        public void actionPerformed( ActionEvent evento )
     {
JOptionPane.showMessageDialog(null,
"Este programa calcula el area de las Figuras",
"CopyLeft", JOptionPane.PLAIN_MESSAGE );
}
} // fin de la clase interna anónima
); // fin de la llamada a addActionListener
        
        
        
        
JMenuItem elementoSalir = new JMenuItem( "Salir" );
elementoSalir.setMnemonic( 'S' );
menuArchivo.add( elementoSalir );
elementoSalir.addActionListener(
new ActionListener() { // clase interna anónima
// terminar la aplicación cuando el usuario haga clic en elementoSalir
public void actionPerformed( ActionEvent evento )
{
System.exit( 0 );
}
} // fin de la clase interna anónima
); // fin de la llamada a addActionListener
// crear barra de menús y adjuntarla a la ventana PruebaMenu



JMenuBar barra = new JMenuBar();
setJMenuBar( barra ); //Con esta se coloca toda la barra completo al applet o frame de cforma completa
 //contenido.add(barra);
barra.add( menuArchivo );


JMenu figuras = new JMenu( "Figuras" );
figuras.setMnemonic( 'F' );
JMenuItem cuadrado = new JMenuItem( "Cuadrado" );
cuadrado.setMnemonic( 'C' );
figuras.add( cuadrado );

cuadrado.addActionListener(
new ActionListener() { // clase interna anónima

public void actionPerformed( ActionEvent evento )
{   
FigurasMetodos ventana = new FigurasMetodos();
ventana.ventanaCuadrado();
}
});

JMenuItem circulo = new JMenuItem( "Circulo" );
cuadrado.setMnemonic( 'D' );
figuras.add( circulo );
circulo.addActionListener(
new ActionListener() { // clase interna anónima

public void actionPerformed( ActionEvent evento )
{   
FigurasMetodos ventana = new FigurasMetodos();
ventana.ventanaCirculo();
}
});


JMenuItem triangulo = new JMenuItem( "Triangulo" );
triangulo.setMnemonic( 'E' );
figuras.add( triangulo );
triangulo.addActionListener(
new ActionListener() { // clase interna anónima

public void actionPerformed( ActionEvent evento )
{   
FigurasMetodos ventana = new FigurasMetodos();
ventana.ventanaTriangulo();
}
});

JMenuItem rectangulo = new JMenuItem( "Rectangulo" );
rectangulo.setMnemonic( 'F' );
figuras.add( rectangulo );

rectangulo.addActionListener(
new ActionListener() { // clase interna anónima

public void actionPerformed( ActionEvent evento )
{   
FigurasMetodos ventana = new FigurasMetodos();
ventana.ventanaRectangulo();
}
});
// crear menú Formato, con sus submenús y elementos de menú
 //contenido.add(barra);       
       
 barra.add(figuras);
 setSize( 550, 200 );
} 
    


}
