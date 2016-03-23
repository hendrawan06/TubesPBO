/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.logging.Logger;

/**
 *
 * @author Name
 */
public class Petugas extends Orang {
    private String idPetugas;
    
    public Petugas(String nama, String alamat,char jenisKelamin, String idPetugas){
    super(nama,alamat,jenisKelamin);
    this.idPetugas=idPetugas;  
}

    public String getIdPetugas() {
        return idPetugas;
    }
    
    
}
