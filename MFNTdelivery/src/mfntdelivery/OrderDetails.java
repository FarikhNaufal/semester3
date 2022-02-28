/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfntdelivery;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author USER
 */
@DatabaseTable(tableName = "detail_pesanan")

public class OrderDetails {
    @DatabaseField(id = true)
    Integer idPesanan;

    @DatabaseField(canBeNull = false, width = 50)
    String namaCust;

    @DatabaseField(canBeNull = false, width = 255)
    String orderItem;
    
    @DatabaseField(canBeNull = false, width = 20)
    double totalHarga;
    
    @DatabaseField(canBeNull = false, width = 50)
    String alamat;
    
    public OrderDetails(String namaCust, String orderItem, double totalHarga, String alamat){
        this.namaCust = namaCust;
        this.orderItem = orderItem;
        this.totalHarga = totalHarga;
        this.alamat = alamat;
        
    }
    
    public OrderDetails(){}
}


