import javax.swing.*;
import java.util.*;

public class arraysCheck {
    public static void main(String[] args) {
        int[] garr = {4, 5, 6,};
        int arlen = garr.length;
        int[] harr = new int[arlen + 1];

        for (int i = 0; i < arlen; i++) {
            harr[i] = garr[i];
        }
        harr[arlen] = Integer.parseInt(JOptionPane.showInputDialog("Enter the new number"));
        for (int i = 0; i < harr.length; i++) {
            System.out.println(harr[i]);
        }

    }
}
