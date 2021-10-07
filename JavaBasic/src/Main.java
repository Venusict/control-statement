/*
*
* */
public class Main {

    public static void main(String[] args) {
///*        //So nguyen
//      //  byte a = 130; //Nếu
//      //  byte a1 = 127; b -> s -> i -> l
//        short b = 101;
//        int c = 1000;
//        long d = 1000000000009L;
//
//        float x = (float) 4.4;
//
//
//
//        System.out.println(f);*/
//
//        int f = 2;
//        Viettel a = new Viettel();

        Viettel hdQuater = new Viettel();
        hdQuater.setClientName("Tong cong ty");
        hdQuater.setTermName("CMC");

        Viettel hn = new Viettel();
        hn.setClientName("Ha noi");

        Viettel hcm = new Viettel();

        // doi thong tin cua tap doan


        System.out.println(hdQuater.getClientName());
        System.out.println(hdQuater.getEstablishYear());
        System.out.println(hn.getClientName());
        System.out.println(hcm.getClientName());
        System.out.println(hn.getTermName());

       // System.out.println(hdQuater.getClientName());
        //System.out.println(hn.getClientName());

    }
}

/*
* - 2 nhóm kiểu dlieu chính
* I. Primitive Type (kiểu dữ liệu nguyên thuỷ)
*   - gồm 8 kiểu dl
*   1. Boolean
*   2. Dấu phẩy động (Số thực) gồm Float và Double -> db
*   3. Số nguyên: Byte, Short, Int, Long -> df: int
* // Default value là gì
// Ép kiểu (Casting) là gì
* II. Reference type (kiểu dữ liệu tham chiếu)
*
* */

//Nên thi chứng chỉ của Oracle (5-6tr/certificate)
// 1. OCA,
// 2.OCP,
// 3.OC?? OCT



