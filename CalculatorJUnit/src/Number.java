
public class Number {
		   
	int number;
	
	//constructor
	
	public Number() {
    this.number = 0;
	}
	
    public Number(int number) {
	this.number = number;
    }
    
   //get and set values
    public int getNumber() {
    return number;
    }
    
    public void setNumber(int number) {
    this.number = number;
    }

    //calculator : public methods :
    
	public Number add(Number a) {
	this.number += a.number;
	System.out.println("sum:"+this.number);//both correct and error value will come
	return this;
	}
	
	public 	Number sub(Number a) {
	this.number -= a.number;
	System.out.println("diff:"+this.number);//both correct and error value will come
	return this;
	}
	
	public 	Number mul(Number a) {
	this.number *= a.number;
	System.out.println("product:"+this.number);//both correct and error value will come
	return this;
	}
	
	public Number div(Number a) {
	if (a.number == 0) throw new IllegalArgumentException("Cannot be divided by zero .");
	this.number /= a.number;
	System.out.println("quotient:"+this.number);//both correct and error value will come
	return this;
	}
}