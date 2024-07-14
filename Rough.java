public class Rough {

    public  static class  Node{
        int data ;
        Node next ;


       public  Node(int data){

        this.data = data ;
    }

}

    public static void main(String[] args) {

        Node a  =  new Node(5);
        Node b  =  new Node(10);
        Node c  =  new Node(15);
        Node d  =  new Node(20);
        Node e  =  new Node(25);

        a.next= b; 
        b.next= c; 
        c.next= d; 
        d.next= e; 


        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);


        
        System.out.println(a);
        System.out.println(a.next);
        System.out.println(b.next);
        
    }
}


