import javax.swing.*;

public class dogumGunTahmin {
    public static void main(String[] args) {

        String set1 =
                " 1  3  5  7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31";

        String set2 =
                " 2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";

        String set3 =
                " 4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        String set4 =
                " 8  9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        int gun = 0;

        int cevap = JOptionPane.showConfirmDialog(null, "Doğum günün bunlardan biri mi?\n " + set1);
        if(cevap == JOptionPane.YES_OPTION)
            gun += 1;

        cevap = JOptionPane.showConfirmDialog(null, "Doğum günün bunlardan biri mi?\n " + set2);
        if(cevap == JOptionPane.YES_OPTION)
            gun += 2;

        cevap = JOptionPane.showConfirmDialog(null, "Doğum günün bunlardan biri mi?\n " + set3);
        if(cevap == JOptionPane.YES_OPTION)
            gun += 4;

        cevap = JOptionPane.showConfirmDialog(null, "Doğum günün bunlardan biri mi?\n " + set4);
        if(cevap == JOptionPane.YES_OPTION)
            gun += 8;

        cevap = JOptionPane.showConfirmDialog(null, "Doğum günün bunlardan biri mi?\n " + set5);
        if(cevap == JOptionPane.YES_OPTION)
            gun += 16;

        JOptionPane.showMessageDialog(null, "Doğum günün " + gun + "!!");
    }
}
