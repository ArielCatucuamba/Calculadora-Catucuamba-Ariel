import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextField numero1;
    private JTextField numero2;
    private JTextField resultado;
    public Calculadora(){

        //Dar un titulo a mi ventana
        setTitle("Mi primera calculadora");
        //equivale a size y location
        //setBounds(600,200,400,600);
        //Dar las dimensiones de mi ventana
        setSize(400,800);
        //si le pongo null me pone en el centro de mi pantalla
        setLocationRelativeTo(null);
        //es para que mi ventana se mueva donde yo uqieroya no en la esquina izquierda
        //setLocation(600,200);
        //Indica que va a ser por defecto cuando cierre la ventana (detener el porgrama)
        //Cambair el color a mi frame
        //getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creo un panel
        JPanel panel = new JPanel();
        //agrego el panel a mi ventana
        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        this.getContentPane().add(panel);
        //Descativo el diseño predetemrinado
        panel.setLayout(null);
        JLabel titulo = new JLabel("Casio");
        //centrar el texto
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        //permiso para cambiar el fondo del label
        titulo.setOpaque(true);
        titulo.setBackground(Color.pink);
        titulo.setBounds(0,5,200,30);
        //cambair el tipo de letra , estilo y tamaño
        titulo.setFont(new Font("arial",Font.BOLD,14));

        JLabel titulo1 = new JLabel("Catucuamba Ariel");
        titulo1.setHorizontalAlignment(SwingConstants.CENTER);
        titulo1.setOpaque(true);
        titulo1.setFont(new Font("Chiller",0,20));
        titulo1.setBackground(Color.GRAY);
        titulo1.setBounds(100,5,400,30);


        JLabel texto1 = new JLabel("Ingrese el primer numero");
        texto1.setHorizontalAlignment(SwingConstants.CENTER);
        texto1.setOpaque(true);
        texto1.setFont(new Font("Arial Black",0,12));
        texto1.setBackground(Color.GRAY);
        texto1.setBounds(5,50,200,30);
        panel.add(texto1);

        JTextField numero1= new JTextField();
        numero1.setHorizontalAlignment(SwingConstants.CENTER);
        numero1.setOpaque(true);
        numero1.setFont(new Font("Chiller",0,20));
        numero1.setBackground(Color.LIGHT_GRAY);
        numero1.setBounds(210,50,175,30);
        panel.add(numero1);

        JLabel texto2 = new JLabel("Ingrese el segundo numero");
        texto2.setHorizontalAlignment(SwingConstants.CENTER);
        texto2.setOpaque(true);
        texto2.setFont(new Font("Arial Black",0,12));
        texto2.setBackground(Color.GRAY);
        texto2.setBounds(5,90,200,30);
        panel.add(texto2);

        JTextField numero2= new JTextField();
        numero2.setHorizontalAlignment(SwingConstants.CENTER);
        numero2.setOpaque(true);
        numero2.setFont(new Font("Chiller",0,15));
        numero2.setBackground(Color.LIGHT_GRAY);
        numero2.setBounds(210,90,175,30);
        panel.add(numero2);


        JLabel texto3 = new JLabel("  RESULTADO ");
        texto3.setHorizontalAlignment(SwingConstants.CENTER);
        texto3.setOpaque(true);
        texto3.setFont(new Font("Arial Black",0,15));
        texto3.setBackground(Color.GRAY);
        texto3.setBounds(5,130,200,30);
        panel.add(texto3);

        JTextField resultado= new JTextField();
        resultado.setHorizontalAlignment(SwingConstants.CENTER);
        resultado.setOpaque(true);
        resultado.setFont(new Font("Chiller",0,20));
        resultado.setBackground(Color.LIGHT_GRAY);
        resultado.setBounds(210,130,175,30);
        panel.add(resultado);



        //Crear botones y le doy como texto +
        JButton botonsuma = new JButton("+");
        //le doy la posicion que quiero que este
        botonsuma.setBounds(5,200,50,40);
        //cambiar el color al texto del boton
        botonsuma.setForeground(Color.red);

        //Cambair el color de fondo del boton
        //botonsuma.setBackground(Color.BLUE);
        //Si no me vale pongo setOpaque(true)


        //hago que el boton suma haga una accion
        botonsuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int total = num1 + num2;
                resultado.setText(Integer.toString(total));

            }
        });
        //boton resta
        JButton botonresta = new JButton("-");
        botonresta.setBounds(75,200,50,40);
        botonresta.setForeground(Color.red);

        botonresta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int total = num1 - num2;

                resultado.setText(Integer.toString(total));

            }
        });
        //boton multiplicacion
        JButton botonmultiplicacion = new JButton("X");
        botonmultiplicacion.setBounds(145,200,50,40);
        botonmultiplicacion.setForeground(Color.red);

        botonmultiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                int total = num1 * num2;

                resultado.setText(Integer.toString(total));

            }
        });

        //Boton division
        JButton botondivision = new JButton("÷");
        botondivision.setBounds(215,200,50,40);
        botondivision.setForeground(Color.red);

        botondivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                double total = (double) num1 / num2;

                resultado.setText(String.format("%.2f", total));
            }
        });

        JLabel solo1 = new JLabel("-------Para estas operaciones-------");
        solo1.setHorizontalAlignment(SwingConstants.CENTER);
        solo1.setOpaque(true);
        solo1.setFont(new Font("Arial Black",0,11));
        solo1.setBackground(Color.PINK);
        solo1.setBounds(0,310,400,30);
        panel.add(solo1);
        JLabel solo2 = new JLabel("ingresar SOLO el primer numero por teclado");
        solo2.setHorizontalAlignment(SwingConstants.CENTER);
        solo2.setOpaque(true);
        solo2.setFont(new Font("Arial Black",0,13));
        solo2.setBackground(Color.PINK);
        solo2.setBounds(0,340,400,30);
        panel.add(solo2);

        JLabel solo3 = new JLabel("PASO EXTRA");
        solo3.setHorizontalAlignment(SwingConstants.CENTER);
        solo3.setOpaque(true);
        solo3.setFont(new Font("Arial Black",0,10));
        solo3.setBackground(Color.PINK);
        solo3.setBounds(5,570,150,50);
        panel.add(solo3);

        JLabel solo4 = new JLabel("Calculo de la HIPOTENUSA");
        solo4.setHorizontalAlignment(SwingConstants.LEFT);
        solo4.setOpaque(true);
        solo4.setFont(new Font("arial",0,12));
        solo4.setBackground(Color.PINK);
        solo4.setBounds(5,600,150,90);
        panel.add(solo4);

        JLabel solo5 = new JLabel("Primer numero = cateto a");
        solo5.setHorizontalAlignment(SwingConstants.LEFT);
        solo5.setOpaque(true);
        solo5.setFont(new Font("arial",0,11));
        solo5.setBackground(Color.LIGHT_GRAY);
        solo5.setBounds(200,570,150,20);
        panel.add(solo5);

        JLabel solo6 = new JLabel("Segundo numero = cateto b");
        solo6.setHorizontalAlignment(SwingConstants.LEFT);
        solo6.setOpaque(true);
        solo6.setFont(new Font("arial",0,11));
        solo6.setBackground(Color.LIGHT_GRAY);
        solo6.setBounds(200,590,150,30);
        panel.add(solo6);




        //boton seno
        JButton botonseno = new JButton("sen");
        botonseno.setBounds(130,400,100,40);
        botonseno.setForeground(Color.red);

        botonseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                double total = Math.sin(Math.toRadians(num1));
                resultado.setText(Double.toString(total));
            }
        });

        //boton coseno
        JButton botoncoseno = new JButton("cos");
        botoncoseno.setBounds(255,400,100,40);
        botoncoseno.setForeground(Color.red);

        botoncoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                double total = Math.cos(Math.toRadians(num1));
                resultado.setText(Double.toString(total));
            }
        });
        //boton potencia
        JButton botonpotencia = new JButton("n1^n2");
        botonpotencia.setBounds(285,200,75,40);
        botonpotencia.setForeground(Color.red);

        botonpotencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                double total = Math.pow(num1, num2);
                resultado.setText(Double.toString(total));
            }
        });
        //boton botonlogaritmobase10
        JButton botonlogaritmobase10 = new JButton("log base10");
        botonlogaritmobase10.setBounds(5,400,100,40);
        botonlogaritmobase10.setForeground(Color.red);

        botonlogaritmobase10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                double total = Math.log10(num1);
                resultado.setText(Double.toString(total));
            }
        });

        //boton maximo
        JButton botonMaximo = new JButton("maximo");
        botonMaximo.setBounds(60,250,120,40);;
        botonMaximo.setForeground(Color.red);

        botonMaximo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                double total = Math.max(num1, num2);
                resultado.setText(Double.toString(total));
            }
        });

        //boton minimo
        JButton botonMinimo = new JButton("minimo");
        botonMinimo.setBounds(200,250,120,40);;
        botonMinimo.setForeground(Color.red);

        botonMinimo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                int num2 = Integer.parseInt(numero2.getText());
                double total = Math.min(num1, num2);
                resultado.setText(Double.toString(total));
            }
        });

        //boton Tangente
        JButton botonTangente = new JButton("Tan");
        botonTangente.setBounds(5,450,100,40);
        botonTangente.setForeground(Color.red);

        botonTangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                double total = Math.tan(Math.toRadians(num1));
                resultado.setText(Double.toString(total));
            }
        });

        //boton Raiz Cuadrada
        JButton botonRCUADRADA = new JButton("√ cuadrada");
        botonRCUADRADA.setBounds(130,450,100,40);
        botonRCUADRADA.setForeground(Color.red);

        botonRCUADRADA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                double total = Math.sqrt(num1);
                resultado.setText(Double.toString(total));
            }
        });

        //boton Raiz arcocoseno
        JButton botonarcocoseno = new JButton("arcocoseno");
        botonarcocoseno.setBounds(255,450,100,40);
        botonarcocoseno.setForeground(Color.red);

        botonarcocoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                double total =  Math.acos(num1);
                resultado.setText(Double.toString(total));
            }
        });

        //boton exponencial
        JButton botonexponencial = new JButton("exponencial");
        botonexponencial.setBounds(5,500,100,40);
        botonexponencial.setFont(new Font("arial",1,10));
        botonexponencial.setForeground(Color.red);

        botonexponencial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(numero1.getText());
                double total = Math.exp(num1);
                resultado.setText(Double.toString(total));
            }
        });
        //boton redondear
        JButton botonredondear = new JButton("Redondear");
        botonredondear.setBounds(130,500,100,40);
        botonredondear.setHorizontalAlignment(SwingConstants.CENTER);
        botonredondear.setForeground(Color.red);

        botonredondear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(numero1.getText());
                long total = Math.round(num1);
                resultado.setText(Long.toString(total));
            }
        });

        //boton Valor absoluto
        JButton botonAbsoluto = new JButton("V absoluto");
        botonAbsoluto.setBounds(255,500,100,40);
        botonAbsoluto.setHorizontalAlignment(SwingConstants.CENTER);
        botonAbsoluto.setForeground(Color.red);

        botonAbsoluto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(numero1.getText());
                double total = Math.abs(num1);
                resultado.setText(Double.toString(total));
            }
        });

        //boton Hipotenusa
        JButton botonHipotenusa = new JButton("HIPOTENUSA");
        botonHipotenusa.setBounds(177,640,200,40);
        botonHipotenusa.setHorizontalAlignment(SwingConstants.CENTER);

        botonHipotenusa.setForeground(Color.red);

        botonHipotenusa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(numero1.getText());
                double num2 = Double.parseDouble(numero2.getText());
                double total = Math.hypot(num1, num2);
                resultado.setText(Double.toString(total));
            }
        });



        //boton borrar/ limpiar
        JButton botonborrar = new JButton("C / borrar");
        botonborrar.setBounds(6,700,375,40);
        botonborrar.setHorizontalAlignment(SwingConstants.CENTER);
        botonborrar.setForeground(Color.red);

        botonborrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1.setText("");
                numero2.setText("");
                resultado.setText("");
            }
        });







        panel.add(titulo);
        panel.add(titulo1);
        panel.add(botonsuma);
        panel.add(botonresta);
        panel.add(botonmultiplicacion);
        panel.add(botondivision);
        panel.add(botonseno);
        panel.add(botoncoseno);
        panel.add(botonpotencia);
        panel.add(botonlogaritmobase10);
        panel.add(botonMaximo);
        panel.add(botonMinimo);
        panel.add(solo1);
        panel.add(botonTangente);
        panel.add(botonRCUADRADA);
        panel.add(botonarcocoseno);
        panel.add(botonexponencial);
        panel.add(botonredondear);
        panel.add(botonAbsoluto);
        panel.add(solo3);
        panel.add(botonHipotenusa);





        panel.add(botonborrar);
    }
}
