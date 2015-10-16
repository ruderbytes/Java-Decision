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
public class Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int res, val1=1, val2=2;
        res = val1*val2;
        String nama="kalitambah";
        if(nama=="kali"){
            System.out.println("Hasil perkalian adalah "+res);
        }else if(nama=="tambah"){
            System.out.println("hasil "+res+" berasal dari perkalian");
        }else{
            System.out.println("Hasil tidak diketahui");
        }
    }
    
}
