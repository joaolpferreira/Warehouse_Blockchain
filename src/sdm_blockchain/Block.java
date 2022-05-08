/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdm_blockchain;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;


public class Block {
    private String hash;
    private String previousHash;
    private Warehouse data;
    private long timeStamp;
    
    public Block(Warehouse data, String previousHash) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }
    
    public String calculateHash() throws NoSuchAlgorithmException, UnsupportedEncodingException{
        String calculateHash = DigitalFingerPrint.generateDigitalFingerPrint(
            previousHash + Long.toString(timeStamp) + data
        );
        return calculateHash;
    }
    
    public String getHash(){
        return this.hash;
    }
    public Warehouse getData(){
        return this.data;
    }
    
    public String getPreviousHash(){
        return this.previousHash;
    }
    
    public void setHash(String modHash){
        this.hash = modHash;
    }
    
    public void setData(Warehouse modData){
        this.data = modData;
    }
    
}