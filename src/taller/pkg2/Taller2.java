/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg2;
import ch.aplu.turtle.Turtle;
/**
 *
 * @author Usuario
 */
public class Taller2 {
    public static void main(String[] args) {
        /* Cuenta Bancaria
        int x;
        int p;
        String y;
        Cuenta c1=new Cuenta(1012, 1234, "Magdalena Sanchez", 0);
        Cuenta c2=new Cuenta(1013,9876,"Joselito Perez",500000);
        java.util.Scanner leer=new java.util.Scanner (System.in);
        do{
            Cuenta q=new Cuenta(0,0,null,0);
            int w;
            System.out.println("Ingrese el numero de la cuenta");
            w=leer.nextInt();
            if(w==1012){
                q=c1;
            }
            if(w==1013){
                q=c2;
            }
            System.out.println("Que desea hacer?");
            System.out.println("1 Consultar saldo");
            System.out.println("2 Consignar");
            System.out.println("3 Retirar");
            System.out.println("4 Cambiar clave");
            x=leer.nextInt();
            switch (x){
                case 1:
                    System.out.println(q.consultarsaldo());
                    break;
                case 2:
                    q.consignar();
                    break;
                case 3:
                    q.retirar();
                    break;
                case 4:
                    q.cambiar();
                    break;
            }
            System.out.println("Desea consultar otro usuario?");
            y=leer.next();
        }while("Si".equals(y) || "SI".equals(y) || "si".equals(y));
        */
        /*Escena
        Escena x=new Escena();
        x.escena(60);
        */
        /*TapeDeckTestDrive
        TapeDeck t=new TapeDeck();
        t.canRecord=true;
        t.playTape();
        if(t.canRecord==true){
            t.recordTape();
        }*/
        /*DVDPlayerTestDrive
        DVDPlayer d=new DVDPlayer();
        d.canRecord=true;
        if(d.canRecord==true){
            d.recordDVD();
        }*/
        /*DrumKitTestDrive
        DrumKit d=new DrumKit();
        d.playSnare();
        d.playTopHat();*/
        /*EchoTestDrive 1
        Echo e1=new Echo();
        Echo e2=new Echo();
        int x=0;
        while(x<4){
            e1.hello();
            e1.count=e1.count+1;
            if(x>0){
                e2.count=e2.count+1;
            }
            if(x>1){
                e2.count=e2.count+e1.count;
            }
            x=x+1;
        }
        System.out.println(e2.count);*/
        /*EchoTestDrive 2
        Echo e1=new Echo();
        Echo e2=new Echo();
        int x=0;
        while(x<4){
            e1.hello();
            e1.count=e1.count+2;
            if(x<4){
                e2.count=e2.count+1;
            }
            if(x<4){
                e2.count=e2.count+e1.count;
            }
            x=x+1;
        }
        System.out.println(e2.count);*/
    }
    
}
