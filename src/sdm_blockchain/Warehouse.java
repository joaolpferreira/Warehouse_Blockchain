/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdm_blockchain;
//import java.util.ArrayList;

/**
 *
 * @author Ruca
 */
public class Warehouse {
    private int WarehouseID;
    private int Quantity;
    private String Operation;
    private int NewTotalStock;
 
    
    public Warehouse(int WarehouseID, int Quantity, String Operation, int NewTotalStock){
        this.WarehouseID = WarehouseID;
        this.Quantity = Quantity;
        this.Operation = Operation;
        this.NewTotalStock = NewTotalStock;
    }
    
    public int getWarehouseID(){
        return WarehouseID;
    }
    public int getQuantity(){
        return Quantity;
    }
    public String getOperation(){
        return Operation;
    }
    public int getNewTotalStock(){
        return NewTotalStock;
    }
    
    public void setNewTotalStock(int number){
        this.NewTotalStock = number;
    }
    
    public void setQuantity(int number){
        this.Quantity = number;
    }
    
    public void setOperation(String operation){
        this.Operation = operation;
    }
    
    
    
  
}
