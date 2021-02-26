/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author MOKLET-2
 */
public class UjiBus3 {

    /**
     * @param abc
     */
    public static void main(String[] abc) {
        Bus3 Bus = new Bus3(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(1);//tambah 1 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(1);//tambah 1 penumpang
        Bus.cetakpenumpang();
    }
    
}
