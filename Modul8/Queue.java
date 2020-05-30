package Modul8;

/**
 *
 * @author Andy
 */
import java.util.Scanner;
public class Queue {
    int Id;
    String Nama,Perlu;
    Queue next;
    static Scanner in = new
        Scanner (System.in);
    static Scanner str = new
        Scanner (System.in);
    
    public void input(){//implementasi method input
        System.out.print("Masukan Id : ");
        Id=in.nextInt();//memanggil id 
        System.out.print("Masukan Nama : ");
        Nama=str.nextLine();//memanggil nama 
        System.out.print("Masukan Keperluan : ");
        Perlu=str.nextLine();//memanggil perlu  
        next=null;
    }
    
    public void read(){//implementasi method read
        System.out.println("|| "+Id+" \t|| "+Nama+" \t|| "+Perlu+" \t|| ");
    }
    
    public static void main(String[] args) {
        int menu = 0;
        linked que = new linked();//membuat instance linked
        while (menu!=4){
            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n4.Exit\n :");
            menu = in.nextInt();
            if (menu==1)que.enque();
            else if (menu==2)que.deque();
            else if (menu==3)que.view();
            else if (menu==4)System.out.println("- Keluar -");
            else System.out.println("- Salah -");
            System.out.println(" ");
        }
        
    }
}
class linked{
    Queue head,tail;
    
    public linked (){
        head = null;
        tail = null;
    }
    public void enque(){//implementasi method enque
        Queue baru = new Queue();
        baru.input();
        if (head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){//implemantasi method deque
        if (head==null)System.out.println("- Kosong -");
        else{
            System.out.println("Keluar dengan data id : "+head.Id);
            head=head.next;
        }
    }
    public void view(){//implementasi method view
        if (head==null)System.out.println("- Kosong -");
        else{
            System.out.println("||Id \t|| Nama \t|| Keperluan\t|| ");
            for (Queue a=head; a!=null; a=a.next) a.read();
        }
    }
}