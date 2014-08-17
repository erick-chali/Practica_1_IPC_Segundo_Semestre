import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * Created by erickchali on 8/3/14.
 */
public class Interfaz_201314457 extends JFrame implements ActionListener {

    String cadena = "";
    String memo1,memo2,signo;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    JButton btnSum,btnRes,btnMul,btnDiv,btnPunto,btnIgual;
    JButton btnFib,btnBin,btnFac,btnClear;
    JButton btnSen,btnCos,btnTan;
    JButton btnMR,btnMPos,btnMNeg;
    JTextField txtPantalla;
    JRadioButton btnA,btnB,btnC;
    ButtonGroup grupo;
    JPanel pa1,pa3,pa4;
    DecimalFormat formato = new DecimalFormat("#.##");
    double resultado=0;
    String a="0",b="0",c="0",s="0",co="0",t="0";

    public Interfaz_201314457(){
        super("Calculadora");
        this.setLayout(new FlowLayout());

        txtPantalla = new JTextField();
        txtPantalla.setPreferredSize(new Dimension(700,50));
        txtPantalla.setHorizontalAlignment(JTextField.RIGHT);
        txtPantalla.setText("0");
        txtPantalla.setEditable(false);

        //Botones panel 1
        btnMPos = new JButton("M+");
        btnMPos.setPreferredSize(new Dimension(100, 50));
        btnMPos.addActionListener(this);
        btnMNeg = new JButton("M-");
        btnMNeg.setPreferredSize(new Dimension(100, 50));
        btnMNeg.addActionListener(this);
        btnSen = new JButton("Sin");
        btnSen.setPreferredSize(new Dimension(100, 50));
        btnSen.addActionListener(this);
        btnCos = new JButton("Cos");
        btnCos.setPreferredSize(new Dimension(100, 50));
        btnCos.addActionListener(this);
        btnTan = new JButton("Tan");
        btnTan.setPreferredSize(new Dimension(100, 50));
        btnTan.addActionListener(this);

        //Botones panel 2
        btnFib = new JButton("Fibonacci");
        btnFib.setPreferredSize(new Dimension(100,50));
        btnFib.addActionListener(this);
        btnBin = new JButton("Binario");
        btnBin.setPreferredSize(new Dimension(100,50));
        btnBin.addActionListener(this);
        btnFac = new JButton("Factorial");
        btnFac.setPreferredSize(new Dimension(100,50));
        btnFac.addActionListener(this);
        btnClear = new JButton("C");
        btnClear.setPreferredSize(new Dimension(100,50));
        btnClear.addActionListener(this);

        //Botones panel 3
        btn1 = new JButton("1");
        btn1.setPreferredSize(new Dimension(100,50));
        btn1.addActionListener(this);
        btn2 = new JButton("2");
        btn2.setPreferredSize(new Dimension(100,50));
        btn2.addActionListener(this);
        btn3 = new JButton("3");
        btn3.setPreferredSize(new Dimension(100,50));
        btn3.addActionListener(this);
        btn4 = new JButton("4");
        btn4.setPreferredSize(new Dimension(100,50));
        btn4.addActionListener(this);
        btn5 = new JButton("5");
        btn5.setPreferredSize(new Dimension(100,50));
        btn5.addActionListener(this);
        btn6 = new JButton("6");
        btn6.setPreferredSize(new Dimension(100,50));
        btn6.addActionListener(this);
        btn7 = new JButton("7");
        btn7.setPreferredSize(new Dimension(100, 50));
        btn7.addActionListener(this);
        btn8 = new JButton("8");
        btn8.setPreferredSize(new Dimension(100,50));
        btn8.addActionListener(this);
        btn9 = new JButton("9");
        btn9.setPreferredSize(new Dimension(100,50));
        btn9.addActionListener(this);
        btn0 = new JButton("0");
        btn0.setPreferredSize(new Dimension(100, 50));
        btn0.addActionListener(this);
        btnSum = new JButton("+");
        btnSum.setPreferredSize(new Dimension(100,50));
        btnSum.addActionListener(this);
        btnRes = new JButton("-");
        btnRes.setPreferredSize(new Dimension(100,50));
        btnRes.addActionListener(this);
        btnMul = new JButton("X");
        btnMul.setPreferredSize(new Dimension(100,50));
        btnMul.addActionListener(this);
        btnDiv = new JButton("/");
        btnDiv.setPreferredSize(new Dimension(100,50));
        btnDiv.addActionListener(this);
        btnPunto = new JButton(".");
        btnPunto.setPreferredSize(new Dimension(100,50));
        btnPunto.addActionListener(this);
        btnIgual = new JButton("=");
        btnIgual.setPreferredSize(new Dimension(100,50));
        btnIgual.addActionListener(this);

        //Botones panel 4
        btnMR = new JButton("MR");
        btnMR.setPreferredSize(new Dimension(100,50));
        btnMR.addActionListener(this);
        btnA = new JRadioButton("A");
        btnA.setPreferredSize(new Dimension(100,50));
        btnB = new JRadioButton("B");
        btnB.setPreferredSize(new Dimension(100,50));
        btnC = new JRadioButton("C");
        btnC.setPreferredSize(new Dimension(100,50));

        grupo = new ButtonGroup();
        grupo.add(btnA);
        grupo.add(btnB);
        grupo.add(btnC);

        //paneles
        pa1 = new JPanel();
        pa1.setLayout(new FlowLayout());
        pa1.setPreferredSize(new Dimension(100, 500));
        pa3 = new JPanel();
        pa3.setLayout(new FlowLayout());
        pa3.setPreferredSize(new Dimension(500, 500));
        pa4 = new JPanel();
        pa4.setLayout(new FlowLayout());
        pa4.setPreferredSize(new Dimension(100,500));

        //Añadiendo cosas a los paneles
        pa1.add(btnMPos);
        pa1.add(btnMNeg);
        pa1.add(btnSen);
        pa1.add(btnCos);
        pa1.add(btnTan);
        pa3.add(btnFib);
        pa3.add(btnBin);
        pa3.add(btnFac);
        pa3.add(btnClear);
        pa3.add(btn7);
        pa3.add(btn8);
        pa3.add(btn9);
        pa3.add(btnSum);
        pa3.add(btn4);
        pa3.add(btn5);
        pa3.add(btn6);
        pa3.add(btnRes);
        pa3.add(btn1);
        pa3.add(btn2);
        pa3.add(btn3);
        pa3.add(btnMul);
        pa3.add(btnPunto);
        pa3.add(btn0);
        pa3.add(btnIgual);
        pa3.add(btnDiv);

        pa4.add(btnMR);
        pa4.add(btnA);
        pa4.add(btnB);
        pa4.add(btnC);

        //Añadiendo componentes
        this.add(txtPantalla);
        this.add(pa1);
        this.add(pa3);
        this.add(pa4);
    }

    @Override
    public void actionPerformed(ActionEvent tecla) {

        if(tecla.getSource()==btn1){
            cadena = cadena + "1" ;
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btn2){
            cadena = cadena + "2" ;
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btn3){
            cadena = cadena + "3" ;
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btn4){
            cadena = cadena + "4" ;
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btn5){
            cadena = cadena + "5";
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btn6){
            cadena = cadena + "6";
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btn7){
            cadena = cadena + "7";
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btn8){
            cadena = cadena + "8";
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btn9){
            cadena = cadena + "9";
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btn0){
            cadena = cadena + "0";
            txtPantalla.setText(cadena);
        }else if(tecla.getSource()==btnSum){
            try {
                resultado = Double.parseDouble(txtPantalla.getText());
                if(!txtPantalla.getText().equals("")){
                    memo1 = txtPantalla.getText();
                    signo="+";
                    txtPantalla.setText("");
                    cadena="";
                }
            }catch (Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }
        }else if(tecla.getSource()==btnRes){
            try {
                resultado = Double.parseDouble(txtPantalla.getText());
                if(!txtPantalla.getText().equals("")){
                    memo1 = txtPantalla.getText();
                    signo="-";
                    txtPantalla.setText("");
                    cadena="";
                }
            }catch (Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }
        }else if(tecla.getSource()==btnMul){
            try {
                resultado = Double.parseDouble(txtPantalla.getText());
                if(!txtPantalla.getText().equals("")){
                    memo1 = txtPantalla.getText();
                    signo="*";
                    txtPantalla.setText("");
                    cadena="";
                }
            }catch (Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }
        }else if(tecla.getSource()==btnDiv){
            try {
                resultado = Double.parseDouble(txtPantalla.getText());
                if(!txtPantalla.getText().equals("")){
                    memo1 = txtPantalla.getText();
                    signo="/";
                    txtPantalla.setText("");
                    cadena="";
                }
            }catch (Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }
        }else if(tecla.getSource()==btnIgual){
            String result;
            try {
                resultado = Double.parseDouble(txtPantalla.getText());
                if(!txtPantalla.getText().equals("")){
                    memo2 = txtPantalla.getText();
                    result = realizaOperaciones(memo1,memo2,signo);
                    txtPantalla.setText(result);
                    cadena="";
                }
            }catch (Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }
        }else if(tecla.getSource()==btnPunto){
            if(cadena.length()<=0){
                txtPantalla.setText("0.0");
            }else if(!existePunto(cadena)){
                cadena = cadena + ".";
            }
        }else if(tecla.getSource()==btnSen){
            Double ang,ans;
            try {
                ang = Math.toRadians(Double.parseDouble(txtPantalla.getText()));
                ans = Math.sin(ang);
                txtPantalla.setText(formato.format(ans));
            }catch (Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");

            }
        }else if(tecla.getSource()==btnCos){
            Double ang,ans;
            try{
                ang = Math.toRadians(Double.parseDouble(txtPantalla.getText()));
                ans = Math.cos(ang);
                txtPantalla.setText(formato.format(ans));
            }catch(Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }

        }else if(tecla.getSource()==btnTan){
            Double ang,ans;
            try {
                ang = Math.toRadians(Double.parseDouble(txtPantalla.getText()));
                ans = Math.tan(ang);
                txtPantalla.setText(formato.format(ans));
            }catch(Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }
        }else if(tecla.getSource()==btnFac){
            double fac;
            double ans=1;
            try {
                fac = Double.parseDouble(txtPantalla.getText());
                if(fac <=0){
                    txtPantalla.setText("Error el factorial solo es valido con numeros positivos - Presione la tecla C para borrar.");
                }else{
                    for(double x=fac; x>=1; x--){
                        ans = ans*x;
                    }
                    txtPantalla.setText(""+formato.format(ans));
                }
            }catch(Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }
        }else if(tecla.getSource()==btnFib){
            int a=1,b=1,c,limite;
            try {
                limite = Integer.parseInt(txtPantalla.getText());
                String ans = "0 " + "1 " + "1 ";
                for(int x=2; x<limite; x++){
                    c=a+b;
                    ans = ans + c + " ";
                    b=a;
                    a=c;
                }
                txtPantalla.setText(ans);
            }catch(Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }

        }else if(tecla.getSource()==btnBin){
            int a=1,b=1,c;
            long dec;
            String binario="";
            try {
                dec = Long.parseLong(txtPantalla.getText());
                if(dec<=0){
                    txtPantalla.setText(" Error debe ingresar un entero positivo mayor a cero - Presione la tecla C para borrar.");
                }else{
                    while(dec>0){
                        binario = (dec%2) + binario;
                        dec /= 2;
                    }
                    txtPantalla.setText(binario);
                }

            }catch(Exception e){
                txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
            }

        }else if(tecla.getSource()==btnMPos){
            if(btnA.isSelected()){
                try{
                    resultado = Double.parseDouble(txtPantalla.getText());
                    if(!txtPantalla.getText().equals("")){
                        a = txtPantalla.getText();
                    }
                    txtPantalla.setText("Variable guardada en A");
                }catch(Exception e){
                    txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
                }

            }else if(btnB.isSelected()){
                try{
                    resultado = Double.parseDouble(txtPantalla.getText());
                    if(!txtPantalla.getText().equals("")){
                        b = txtPantalla.getText();
                    }
                    txtPantalla.setText("Variable guardada en B");
                }catch(Exception e){
                    txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
                }
            }else if(btnC.isSelected()){
                try{
                    resultado = Double.parseDouble(txtPantalla.getText());
                    if(!txtPantalla.getText().equals("")){
                        c = txtPantalla.getText();
                    }
                    txtPantalla.setText("Variable guardada en C");
                }catch(Exception e){
                    txtPantalla.setText("Syntax Error - Presione la tecla C para borrar.");
                }
            }

        }else if(tecla.getSource()==btnMNeg){

            if(btnA.isSelected()){
                a="0";
            }else if(btnB.isSelected()){
                b="0";
            }else if(btnC.isSelected()){
                c="0";
            }else{
                txtPantalla.setText("Debe seleccionar un espacio a borrar. Presione C para continuar");
            }

        }else if(tecla.getSource()==btnMR){
            if(btnA.isSelected()){
                txtPantalla.setText(a);
            }else if(btnB.isSelected()){
                txtPantalla.setText(b);
            }else if(btnC.isSelected()){
                txtPantalla.setText(c);
            }else{
                txtPantalla.setText("Debe seleccionar una memoria para mostrar. Presione C para continuar");
            }

        }else if(tecla.getSource()==btnClear){
            cadena="";
            txtPantalla.setText("0");
            btnA.setSelected(false);
            btnB.setSelected(false);
            btnC.setSelected(false);
            memo1="";
            memo2="";
            signo="";
            s="0";
            co="0";
            t="0";

        }

    }

    public boolean existePunto(String texto) {
        boolean resultado;
        resultado=false;

        for (int x = 0; x < texto.length(); x++) {
            if (texto.substring(x, x+1).equals(".")) {
                resultado=true;
                break;
            }

        }
        return resultado;
    }

    public String realizaOperaciones(String memo1, String memo2, String signo) {
        String respuesta;
        Double ans = 0.0;
        if(signo.equals("+")){
            ans = Double.parseDouble(memo1) + Double.parseDouble(memo2);
        }else if(signo.equals("-")){
            ans = Double.parseDouble(memo1) - Double.parseDouble(memo2);
        }else if(signo.equals("*")){
            ans = Double.parseDouble(memo1) * Double.parseDouble(memo2);
        }else if(signo.equals("/")){
            if(Double.parseDouble(memo2)==0){
                JOptionPane.showMessageDialog(this,"Division por cero no es posible.");
                this.memo1="0";
                this.memo2="0";
                this.signo="";
            }
            else {
                ans = Double.parseDouble(memo1) / Double.parseDouble(memo2);
            }
        }
        respuesta = formato.format(ans).toString();
        return respuesta;
    }
}
