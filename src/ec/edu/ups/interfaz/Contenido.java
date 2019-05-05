/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Domenica Cañizares
 */
public class Contenido {
    private int turno;
    private int pX;
    private int pO;

    public Contenido() {
    }

    //contructor
    public Contenido(int turno, int pX, int pO) {
        this.turno = turno;
        this.pX = pX;
        this.pO = pO;
    }

    //set
    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public void setpO(int pO) {
        this.pO = pO;
    }

    //get
    public int getTurno() {
        return turno;
    }

    public int getpX() {
        return pX;
    }

    public int getpO() {
        return pO;
    }

    public void intercambiar() {
        if (getTurno() == 0) {
            setTurno(1);
        } else {
            setTurno(0);
        }
    }

    public int posibilidad(int matriz[][]) {
        //maneras de ganar horizontal
        //ho11
        if (matriz[0][0] == matriz[0][1] & matriz[0][0] == matriz[0][2]) {
            return 1;
        }
        //hor2
        if (matriz[1][0] == matriz[1][1] & matriz[1][0] == matriz[1][2]) {
            return 2;
        }
        //hor3
        if (matriz[2][0] == matriz[2][1] & matriz[2][0] == matriz[2][2]) {
            return 3;
        }

        //maneras de ganar vertical
        //ver1
        if (matriz[0][0] == matriz[1][0] & matriz[0][0] == matriz[2][0]) {
            return 4;
        }
        //ver2
        if (matriz[0][1] == matriz[1][1] & matriz[0][1] == matriz[2][1]) {
            return 5;
        }
        //ver3
        if (matriz[0][2] == matriz[1][2] & matriz[0][2] == matriz[2][2]) {
            return 6;
        }

        //maneras de ganar diagonal
        //diagonal 1
        if (matriz[0][0] == matriz[1][1] & matriz[0][0] == matriz[2][2]) {
            return 7;
        }
        //diagonal 2
        if (matriz[0][2] == matriz[1][1] & matriz[0][2] == matriz[2][0]) {
            return 8;
        }

        return 0;
    }

    public int jugar(javax.swing.JButton btt, int i, int j, int matriz[][], javax.swing.JLabel jX, javax.swing.JLabel jO) {
        matriz[i][j] = getTurno();
        String n = new String();
        if (getTurno() == 0) {
            n = "X";
            btt.setForeground(Color.red);
        } else {
            n = "O";
            btt.setForeground(Color.blue);
        }

        intercambiar();
        btt.setText(n);
        btt.setEnabled(false);

        if (posibilidad(matriz) != 0) {
            JOptionPane.showMessageDialog(null, "Ganaste: " + n);
            if (getTurno() == 1) {
                setpX(getpX() + 1);
                jX.setText(String.valueOf(getpX()));
            }

            if (getTurno() == 0) {
                setpO(getpO() + 1);
                jO.setText(String.valueOf(getpO()));
            }
            return 1; 
        }
        return 0;
    }

    public void rayar(int matriz[][], javax.swing.JLabel p, int n, int i, int j) {
        matriz[i][j] = getTurno();
        if (posibilidad(matriz) == n) {
            p.setVisible(true);
        }
    }        
}
