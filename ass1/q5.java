package ass1;

class Complex{
    int real,img;
    Complex(){
        real=0; img=0;
    }
    Complex(int real){
        this.real=real; img=0;
    }
    Complex(int real,int img){
        this.real=real; this.img=img;
    }
    Complex add(Complex c){
    return new Complex(real+c.real,img+c.img);
    }
    Complex product(Complex c){
    return new Complex(real*c.real-img*c.img,real*c.img+img*c.real);
    }
    void print(){
    System.out.print(real);
    if(img>=0) System.out.print("+");
    System.out.print(img+"i"); System.out.println();
    }
    public static void main(String[] args) {
        Complex c1=new Complex(3,2);
        Complex c2=new Complex(4,-2);
        Complex c3=c1.add(c2);
        Complex c4=c1.product(c2);
        c3.print(); c4.print();
    }
} 





// Write a class to represent complex numbers with necessary constructors. Write member
// functions to add, multiply two complex numbers.
// There should be three constructors: (i) to initialize real and imaginary parts to 0; (ii) to initialize
// imaginary part to 0 but to initialize the real part to user defined value; (iii) to initialize the real
// part and the imaginary part to user defined values.
// Also, write a main() function to (i) create two complex numbers 3+2i and 4-2i; (ii) to print the
// sum and product of those numbers.
