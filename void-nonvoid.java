/**
 *
 * @author @briella.yb
 */
public class withvoid {
    static void methodvoid()
    {
       System.out.println("Hai, saya adalah siswa RPL SMKN 1 Purwokerto");
    }    
 
    static String jumlahkan(int a, int b)
    {
        int hasil = a+b;
        String hasilAkhir = a + "+" + b + "=" + hasil;
        return hasilAkhir;
    }  
    
    static int kalikan(int a, int b)
    {        
        int hasilKali = a*b;
        return hasilKali;
    }    
    public static void main (String [] args)
    {
        methodvoid();
        methodvoid();
        methodvoid();
        String hasilnya = jumlahkan(7, 9);
        System.out.println("HASIL TAMBAH :" + hasilnya);  
        System.out.println(jumlahkan(7, 9));
        int hasilKali = kalikan(4, 5);
        System.out.println("HASIL KALI : " + hasilKali);
        System.out.println(jumlahkan(11, 10));
        System.out.println(kalikan(6, 5));
        System.out.println(kalikan(8, 2));

    }
}

// class jadi 1 ripository
// atas file class with void and bawah non void


public class nonvoid {
    static int delapan()
    {
        return 8;
    }
    public static void main (String[] args)
        {
            System.out.println(delapan());
        }
}
