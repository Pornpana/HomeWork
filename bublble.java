package th.ac.utcc.cpe.pornpana;

public class bublble { // 5907401003 พรพนา ขำดวง
private double [] el ;
private int esize ;


public bublble(int size){
	if(size< 0 ) 
		this.el = new double[size] ;
	else 
		this.el = new double[10];
	
	esize = 0 ;
	
}
public  void insert(int e){
	this.el[esize] = e ;
	esize++;
	
}
public void show(){
	for(int i = 0 ; i < esize ; i++){
		System.out.print(this.el[i]+ " ");
		
	}
	System.out.print(" ");
}
public void bubbles(){
	
	int out,in ;
	for(out = esize -1 ;out > 0;out--){
		for(in = 0;in < out; in++){
			if(this.el[in]<this.el[in+1]){
				this.swap(in,in+1);
			}
		}
	}
}
	private void  swap(int le , int ri){
		double temp = this.el[le];
		this.el[le] = this.el[ri];
		this.el[ri] = temp ;
	}
	
	public static void main(String[]args){
		int max = 20 ;
		bublble bub = new bublble(max) ;
		bub.insert(37);
		bub.insert(43);
		bub.insert(95);
		bub.insert(32);
		bub.insert(91);
		bub.insert(75);
		bub.insert(26);
		bub.insert(12);
		
		System.out.println("Original Order ::");
		bub.show();
		bub.bubbles();
		System.out.println("Sorced order::");
		bub.show();
		
	}
}

