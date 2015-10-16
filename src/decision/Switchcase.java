/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decision;

/**
 *
 * @author muhammad
 */
public class Switchcase {
    public static void main(String[] args) {
        int select=6;
        String res=null;
        switch(select){
            case 1:
                res ="Senin adalah Hari ke-"+select;
                break;
            case 2:
                res ="Selasa adalah Hari ke-"+select;
                break;
            case 3:
                res ="Rabu adalah Hari ke-"+select;
                break;
            case 4:
                res ="Kamis adalah Hari ke-"+select;
                break;
            case 5:
                res ="Jum'at adalah Hari ke-"+select;
                break;
            case 6:
                res ="Sabtu adalah Hari ke-"+select;
                break;
            case 7:
                res ="Jum'at adalah Hari ke-"+select;
                break;
            default:
                res ="Tidak ada Hari ke-"+select;
        }
        System.out.println(res);
    }
}
