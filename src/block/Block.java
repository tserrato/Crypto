package block;
import java.security.MessageDigest;

/**
 *
 * @author tjser
 */
public class Block {
    public String hash;
    public String previousHash;
    private String transactions;
    private long time;
    public int index;
        
    public String calculateHash() {
	String calculatedhash = calculatedHash.applySha256( 
			previousHash +
			Long.toString(time) +
			transactions 
			);
	return calculatedhash;
}
    
     public static void main(String args[]){
  }
    
    public Block(String transactions,int index,long time){
        this.index = index;
        this.transactions = transactions;
        this.time = time;
        this.hash = calculateHash(); 
        
    }

public class Transaction {
    public String sender;
    public String reciever;
    public int amt;
    public String hash;
    
    
    public Transaction(String sender, String reciever, int amt){
        this.sender = sender;
        this.reciever = reciever;
        this.amt = amt;
        this.hash = calculateHash();
        
    }
    
}
public class Blockchain {
    public String record[];
    
    public Blockchain(String record[]){
        this.record = record;
        
    }
}

public class getLastBlock{
    public getLastBlock(){
    }
}

public class addBlock{
    public addBlock(){
        
    }
}
     

}
